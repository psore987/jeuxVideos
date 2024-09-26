package Pack1;

public class JeuSega extends JeuVideo {
    private boolean aSonic;

    public JeuSega(int id, String titre, String genre, String anneeSortie, boolean aSonic) {
        super(id, titre, genre, anneeSortie);
        this.aSonic = aSonic;
    }

    
    public boolean isaSonic() {
		return aSonic;
	}


	public void setaSonic(boolean aSonic) {
		this.aSonic = aSonic;
	}


	@Override
    public void afficherDetails() {
        System.out.println("Jeu Sega - Titre : " + titre + ", Genre : " + genre +
            ", Année : " + anneeSortie + ", Avec Sonic : " + (aSonic ? "Oui" : "Non"));
    }
}
