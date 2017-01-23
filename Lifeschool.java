package co.simplon.lifeschool;

import java.time.LocalDate;
import java.time.Month;

public class Lifeschool {

    public static void main(String[] args) {

        //Création d'une école nommée InfoJava avec ses étudiants
        School InfoJava = new School("InfoJava");

        InfoJava.setStudent("Stéphanie", "Durand", LocalDate.of(1980, Month.NOVEMBER, 12), 37);
        InfoJava.setStudent("Mamadou", "Fort", LocalDate.of(1992, Month.SEPTEMBER, 13), 25);
        InfoJava.setStudent("Florence", "Lune", LocalDate.of(2001, Month.APRIL, 05), 16);
        InfoJava.setStudent("Loic", "Martin", LocalDate.of(1998, Month.JULY, 07), 19);

        System.out.println(InfoJava.toString());
        for (int i = 0; i < InfoJava.getStudent().size(); i++) {
            System.out.println(InfoJava.getStudent().get(i).toString());
        }

        //Affichage de la moyenne d'âge
		 System.out.println("Moyenne d'age : " + Student.MoyenneAge() );
		 System.out.println("\n");


        // Les diplômés de Simplon
        School Simplon = new School("Simplon");

        Simplon.setGraduate("Drake", "Foudre", LocalDate.of(1990, Month.NOVEMBER, 11), 27, 2);
        Simplon.setGraduate("Solange", "Feu", LocalDate.of(1990, Month.DECEMBER, 12), 27, 5);
        Simplon.setGraduate("Johnny", "Lumière", LocalDate.of(1990, Month.OCTOBER, 01), 27, 3);

        // Les diplômés de Simplon
        for (int i = 0; i < Simplon.getGraduate().size(); i++) {
            System.out.println(Simplon.getGraduate().get(i).toString());
        }


        // Comparaison entre l'objet Johnny et Solange.
        Graduate Solange = new Graduate("Solange", "Feu", LocalDate.of(1990, Month.DECEMBER, 12), 27, 5);
        Graduate Johnny = new Graduate("Johnny", "Lumière", LocalDate.of(1990, Month.OCTOBER, 01), 27, 3);

        System.out.println("\n**************************** Comparaison ********************************");
        if (Solange.equals(Johnny) == true) {

            System.out.println("Il s'agit du même diplômé");
        }
        else {
            System.out.println("Il s'agit de deux diplômés différents");
        }

    }

}
