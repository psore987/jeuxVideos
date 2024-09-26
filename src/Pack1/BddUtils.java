package Pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BddUtils {

    // Les détails de la base de données MariaDB
    private static final String URL = "jdbc:mariadb://localhost:3306/collection_jeux";
    private static final String UTILISATEUR = "root";
    private static final String MOT_DE_PASSE = "password";

    public static Connection connecterBdd() {
        Connection connexion = null;
        try {
            // Chargement du pilote JDBC
            Class.forName("org.mariadb.jdbc.Driver");

            // Établir la connexion
            connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);

            if (connexion != null) {
                System.out.println("Connexion à la base de données réussie !");
            } else {
                System.out.println("Échec de la connexion à la base de données.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connexion;
    }

    public static void fermerBdd(Connection connexion) {
        if (connexion != null) {
            try {
                connexion.close();
                System.out.println("Connexion à la base de données fermée.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
