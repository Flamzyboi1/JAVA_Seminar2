package service;

import model.Country;
import model.Student;
import model.course;
import model.profDegree;
import model.professor;

public class mainService {

	public static void main(String[] args) {	
        Student stud1 = new Student(); //default Favour
        System.out.println(stud1);
        //  bfgh
        
        System.out.println("-------Student------");
        Student stud2 = new Student("AB987654","John","Sarfo",
        		"BES",1996, Country.other, "GH23766");
        System.out.println(stud2);
        
        Student stud3 = new Student("BF987654","Agnese","Kelechi",
        		"ITF",2000, Country.Nigeria, "NG23766");
        System.out.println(stud3);
        
        Student stud4 = new Student("HY987654","Aiga","Estere",
        		"ICC",2009, Country.Lithuainia, "LT23766");
        System.out.println(stud4);
        
        System.out.println("---------PROFESSORS---------");
        professor prof1 = new professor();
        System.out.println(prof1);
        professor prof2 = new professor ("Estere","Vitola",profDegree.master);
        System.out.println(prof2);
        
        System.out.println("-------Courses-------------");
        course course1 = new course();
        System.out.println(course1);
        
        course course2 = new course("Data Structures", 6, prof2);
        System.out.println(course2);
	}

}
