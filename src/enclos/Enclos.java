package enclos;

import animal.*;

import java.sql.Array;
import java.util.ArrayList;

public class Enclos {
    private String nom;
    private double superficie;
    private int nb_max_animaux;
    private int nb_animaux_pres;
    private ArrayList<Animal> animaux; // Liste d'animaux présent dans l'enclos
    private String proprete;

    public Enclos(String nom, double superficie, int nb_max_animaux, int nb_animaux_pres, String proprete) {
        this.nom = nom;
        this.superficie = superficie;
        this.nb_max_animaux = nb_max_animaux;
        this.nb_animaux_pres = nb_animaux_pres;
        this.animaux = new ArrayList<Animal>();
        this.proprete = proprete;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNb_max_animaux() {
        return nb_max_animaux;
    }

    public void setNb_max_animaux(int nb_max_animaux) {
        this.nb_max_animaux = nb_max_animaux;
    }

    public int getNb_animaux_pres() {
        return nb_animaux_pres;
    }

    public void setNb_animaux_pres(int nb_animaux_pres) {
        this.nb_animaux_pres = nb_animaux_pres;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    public String getProprete() {
        return proprete;
    }

    public void setProprete(String proprete) {
        this.proprete = proprete;
    }

    public void ajouterAnimaux(ArrayList<Animal> listAnimaux) {
        this.animaux.addAll(listAnimaux);
    }


    public void enleverAnimaux(ArrayList<Animal> listAnimaux) {
        for ( Animal a : this.animaux ) {
            for ( Animal b : listAnimaux ) {
                if ( a.equals(b) ) {
                    this.animaux.remove(a);
                }
            }
        }
    }

    public void nourrirAnimaux() {
        for ( Animal a : this.animaux ) {
            if ( a.isFaim() == true ) {
                System.out.println( a.getNom() + " a été nourri" );
                a.setFaim(false);
            }
        }
    }

    public void entretienEnclos() {
        if ( this.proprete.equals("mauvais") && this.nb_animaux_pres == 0 ) {
            this.setProprete("bon");
        }
    }

    @Override
    public String toString() {
        return "Enclos {" +
                "nom = '" + nom + '\'' +
                ", superficie = " + superficie +
                ", nb_max_animaux = " + nb_max_animaux +
                ", nb_animaux_pres = " + nb_animaux_pres +
                ", animaux = " + animaux +
                ", proprete = '" + proprete + '\'' +
                '}';
    }
}
