package enclos;


public class Aquarium extends Enclos {

    private double profondeur;
    private int salinite;
    private boolean estVerifie;

    public Aquarium(String nom, double superficie, int nb_max_animaux, int nb_animaux_pres, String proprete, double profondeur, int salinite) {
        super(nom, superficie, nb_max_animaux, nb_animaux_pres, proprete);
        this.profondeur = profondeur;
        this.salinite = salinite;
    }

    public double getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }

    public int getSalinite() {
        return salinite;
    }

    public void setSalinite(int salinite) {
        this.salinite = salinite;
    }

    public boolean isEstVerifie() {
        return estVerifie;
    }

    public void setEstVerifie(boolean estVerifie) {
        this.estVerifie = estVerifie;
    }

    public void entretienAquarium() {
        if(this.isEstVerifie() == true) {
            this.entretienEnclos();
        }
        this.setEstVerifie(false);
    }
}