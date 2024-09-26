package Pack1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Création de quelques objets de jeux vidéo
        JeuVideo jeu1 = new JeuNES(1, "Super Mario Bros.", "Plateforme", "1985", "Standard");
        JeuVideo jeu2 = new JeuSega(2, "Sonic the Hedgehog", "Plateforme", "1991", true);

        // Insertion des jeux dans la base de données
        GestionJeux gestionJeux = new GestionJeux();
        try {
            gestionJeux.ajouterJeu(jeu1);
            gestionJeux.ajouterJeu(jeu2);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Affichage de tous les jeux depuis la base de données
        try {
            gestionJeux.afficherJeux();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
