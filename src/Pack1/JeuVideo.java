package Pack1;

public abstract class JeuVideo {
    protected int id;
    protected String titre;
    protected String genre;
    protected String anneeSortie;

    public JeuVideo(int id, String titre, String genre, String anneeSortie) {
        this.id = id;
        this.titre = titre;
        this.genre = genre;
        this.anneeSortie = anneeSortie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(String anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public abstract void afficherDetails();
}


