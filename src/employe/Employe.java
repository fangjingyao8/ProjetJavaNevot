package employe;

public class Employe {
    private String nom;
    private String sexe;
    private int age;

    // ------------ Constructeur ------------
    public Employe(String nom, String sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe {" +
                "nom = '" + nom + '\'' +
                ", sexe = '" + sexe + '\'' +
                ", age = " + age +
                '}';
    }
}