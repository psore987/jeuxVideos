package Pack1;

public class JeuNES extends JeuVideo {
    private String typeCartouche;

    public JeuNES(int id, String titre, String genre, String anneeSortie, String typeCartouche) {
        super(id, titre, genre, anneeSortie);
        this.typeCartouche = typeCartouche;
    }

    
    public String getTypeCartouche() {
		return typeCartouche;
	}


	public void setTypeCartouche(String typeCartouche) {
		this.typeCartouche = typeCartouche;
	}


	@Override
    public void afficherDetails() {
        System.out.println("Jeu NES - Titre : " + titre + ", Genre : " + genre +
            ", Année : " + anneeSortie + ", Type de cartouche : " + typeCartouche);
    }
}
