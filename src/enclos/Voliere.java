package enclos;

public class Voliere extends Enclos{
    public Voliere(String nom, double superficie, int nb_max_animaux, int nb_animaux_pres, String proprete) {
        super(nom, superficie, nb_max_animaux, nb_animaux_pres, proprete);
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public boolean isVeriftoit() {
        return veriftoit;
    }

    public void setVeriftoit(boolean veriftoit) {
        this.veriftoit = veriftoit;
    }
}
