package co.simplon.lifeschool;

import java.time.LocalDate;


public class Student {

    private String prenom;
    private String nom;
    private LocalDate dateNaissance;
    private int age;
    private static int sommeDesAges = 0;
    private static int nombreEleves = 0;


    public Student(String prenom, String nom, LocalDate dateNaissance, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.age = age;
        this.sommeDesAges = sommeDesAges + age;
        this.nombreEleves++; // incrémentation du nombre d'élèves à chaque création d'un objet Student
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [prenom=" + this.prenom + ", nom=" + this.nom + ", dateNaissance=" + this.dateNaissance + ", age=" + this.age + "]";
    }

    public static double MoyenneAge() {
        return (sommeDesAges / nombreEleves);
    }

}
