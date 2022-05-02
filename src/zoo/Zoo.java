package zoo;

import employe.Employe;
import enclos.*;
import java.util.ArrayList;

public class Zoo {
    private String nom;
    private Employe employe;
    private int nb_max_enclos;
    private ArrayList<Enclos> enclos; // Liste des enclos dans le zoo

    public Zoo(String nom, Employe employe, int nb_max_enclos) {
        this.nom = nom;
        this.employe = employe;
        this.nb_max_enclos = nb_max_enclos;
        this.enclos = new ArrayList<Enclos>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public int getNb_max_enclos() {
        return nb_max_enclos;
    }

    public void setNb_max_enclos(int nb_max_enclos) {
        this.nb_max_enclos = nb_max_enclos;
    }

    public ArrayList<Enclos> getEnclos() {
        return enclos;
    }

    public void setEnclos(ArrayList<Enclos> enclos) {
        this.enclos = enclos;
    }

    @Override
    public String toString() {
        return "Zoo {" +
                "nom = '" + nom + '\'' +
                ", employe = " + employe +
                ", nb_max_enclos = " + nb_max_enclos +
                ", enclos = " + enclos +
                '}';
    }
}
