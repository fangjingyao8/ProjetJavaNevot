package animal;

import java.util.Objects;

public class Animal {
    private String nom;
    private String sexe;
    private int poids;
    private int taille;
    private int age;
    private boolean faim; //true si l'animal a faim, false si l'animal n'a pas faim
    private boolean sommeil; //true si l'animal dorm, false si l'animal se réveille
    private boolean sante; //

    public Animal (String nom, String sexe, int poids, int taille, int age, boolean faim, boolean sommeil, boolean sante) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = faim;
        this.sommeil = sommeil;
        this.sante = sante;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaim(boolean faim) {
        this.faim = faim;
    }

    public void setSommeil(boolean sommeil) {
        this.sommeil = sommeil;
    }

    public void setSante(boolean sante) {
        this.sante = sante;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isFaim() {
        return faim;
    }

    public boolean isSommeil() {
        return sommeil;
    }

    public boolean isSante() {
        return this.sante;
    }

    public void manger() {
        System.out.println("");
        this.faim = false;
    }

    public void emettreSon() {
        System.out.println("");
    }

    public void soigner() {
        System.out.println("");
        this.sante = true;
    }

    public void reveiller() {
        this.sommeil = false;
    }

    public void dormir() {
        this.sommeil = true;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "nom = '" + nom + '\'' +
                ", sexe = '" + sexe + '\'' +
                ", poids = " + poids +
                ", taille = " + taille +
                ", age = " + age +
                ", faim = " + faim +
                ", sommeil = " + sommeil +
                ", sante = " + sante +
                '}';
    }

    public boolean equals(Animal a) {
        if (this == a) return true;
        Animal animal = a;
        return this.poids == animal.poids && this.taille == animal.taille && this.age == animal.age && this.faim == animal.faim && this.sommeil == animal.sommeil && this.sante == animal.sante && this.nom.equals(animal.nom) && this.sexe.equals(animal.sexe);
    }
}