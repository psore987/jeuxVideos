package Pack1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionJeux {

    // Méthode pour ajouter un jeu dans la base
    public void ajouterJeu(JeuVideo jeu) throws SQLException {
        String sql = "INSERT INTO jeux_video (titre, genre, annee_sortie, type_console, specificite) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, jeu.getTitre());
            stmt.setString(2, jeu.getGenre());
            stmt.setString(3, jeu.getAnneeSortie());
            stmt.setString(4, jeu instanceof JeuNES ? "NES" : "Sega");
            stmt.setString(5, jeu instanceof JeuNES ? ((JeuNES) jeu).getTypeCartouche() : ((JeuSega) jeu).isaSonic() ? "Avec Sonic" : "Sans Sonic");

            stmt.executeUpdate();
        }
    }

    // Méthode pour afficher tous les jeux
    public void afficherJeux() throws SQLException {
        String sql = "SELECT * FROM jeux_video";

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Jeu : " + rs.getString("titre") +
                                   ", Genre : " + rs.getString("genre") +
                                   ", Année : " + rs.getString("annee_sortie") +
                                   ", Console : " + rs.getString("type_console") +
                                   ", Specificité : " + rs.getString("specificite"));
            }
        }
    }
}
