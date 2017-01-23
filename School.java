package co.simplon.lifeschool;

import java.util.ArrayList;
import java.time.LocalDate;

public class School {

    private String nomEcole  ;
    private ArrayList<Student>  student  = new ArrayList();
    private ArrayList<Graduate> graduate = new ArrayList();


    public School(String nom) {
        this.nomEcole = nom;
    }

	public void setStudent(String prenom, String nom, LocalDate dateNaissance, int age) {
		this.student.add(new Student(prenom,nom,dateNaissance,age));
	}

    public void setGraduate(String prenom, String nom, LocalDate dateNaissance, int age,int grade) {
        this.graduate.add(new Graduate(prenom,nom,dateNaissance,age,grade));
    }

    public ArrayList<Student> getStudent() {
        return this.student;
    }

    public ArrayList<Graduate> getGraduate() {
        return this.graduate;
    }

    public String toString() {
        return "School [nomEcole=" + nomEcole + "]";
    }


}

