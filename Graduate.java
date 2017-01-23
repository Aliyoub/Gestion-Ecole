package co.simplon.lifeschool;

import java.time.LocalDate;

public class Graduate extends Student {

    private String prenom;
    private String nom;
    private LocalDate dateNaissance;
    private int age;
    private int grade;


    public Graduate(String prenom, String nom, LocalDate dateNaissance, int age, int grade) {
        super(prenom, nom, dateNaissance, age);
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.age = age;
        this.grade = grade;
    }

    public boolean equals(Graduate obj) {
        if (obj.nom == this.nom && obj.prenom == this.prenom && obj.dateNaissance == this.dateNaissance
                && obj.age == this.age && obj.grade == this.grade) {
            return true;
        }
        else return false;
    }


    public String toString() {
        return "Graduate [prenom=" + this.prenom + ", nom=" + this.nom + ", dateNaissance=" + this.dateNaissance + ", age=" + this.age
                + ", grade=" + this.grade + "]";
    }
}
