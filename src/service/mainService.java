package service;

import model.Country;
import model.Grade;
import model.Student;
import model.course;
import model.profDegree;
import model.professor;
import java.util.ArrayList;
import java.util.Arrays;

public class mainService {
	private static ArrayList<Student>allStudents = 
			                                    new ArrayList<Student>();
	private static ArrayList<course>allcourses = 
                                                new ArrayList<course>();
    private static ArrayList<professor>allprofessors = 
                                                new ArrayList<professor>();
    private static ArrayList<Grade>allgrades = 
                                                        new ArrayList<Grade>();




	public static void main(String[] args) {	
        Student stud1 = new Student(); //default Favour
        System.out.println(stud1);
        
        System.out.println("-------Student------");
        Student stud2 = new Student("AB987654","John","Sarfo",
        		"BES",1996, Country.Latvia, "GH23766");
        System.out.println(stud2);
        
        Student stud3 = new Student("BF987654","Agnese","Kelechi",
        		"ITF",2000, Country.Latvia, "NG23766");
        System.out.println(stud3);
        
        Student stud4 = new Student("HY987654","Aiga","Estere",
        		"ICC",2009, Country.Lithuainia, "LT23766");
        System.out.println(stud4);
        
        allStudents.add(stud1);
        allStudents.add(stud2);
        allStudents.add(stud3);
        allStudents.add(stud4);
        System.out.println(allStudents);

        System.out.println("-------Students from latvia------");
        
        for(int i = 0; i < allStudents.size();i++) {
        	if(allStudents.get(i).getcountry().equals(Country.Latvia)) {
        		System.out.println(allStudents.get(i));
        	}
        }
        
        System.out.println("---------PROFESSORS---------");
        professor prof1 = new professor();
        professor prof2 = new professor ("Estere","Vitola",profDegree.master);
     
        allprofessors.add(prof1);
        allprofessors.add(prof2);
        
        System.out.println(allprofessors);

        
        
        
        
        System.out.println("-------Courses-------------");
        course course1 = new course();
        course course2 = new course("Data Structures", 6, prof2);
        allcourses.addAll(Arrays.asList(course1,course2));
        System.out.println(allcourses);
        
        
        System.out.println("-------Grade--------");
        Grade gr1 = new Grade();
        Grade gr2 = new Grade (6,stud4, course2);
        Grade gr3 = new Grade (4,stud2, course2);
        Grade gr4 = new Grade (7,stud3, course1);
        allgrades.addAll(Arrays.asList(gr1, gr2, gr3, gr4));
        System.out.println(allgrades);
        
        System.out.println("-----------PROFESSORS WITH MASTERS DEGREE-----------");
        filterAllProfessorsWithSpecificDegree(profDegree.master);
        System.out.println("-----------PROFESSORS WITH PHD DEGREE-----------");
        filterAllProfessorsWithSpecificDegree(profDegree.phd);
        
        
        System.out.println("-----------STUDENTS OLDER THAN 2005-----------");
        filterAllStudentWithSpecificBirthYear();
        
	}
	//Filtering
	public static void filterAllProfessorsWithSpecificDegree(profDegree degree) {
		for(professor tempS : allprofessors) {
			if(tempS.getdegree().equals(degree)) {
				System.out.println(tempS);
			}
		}
	}
	public static void filterAllStudentWithSpecificBirthYear() {
		for(Student tempA : allStudents) {
			if(tempA.getbirthYear()>=2005) {
				System.out.println(tempA);
				
			}
		}
	}
	public static void filterAllStudentWithSpecificFaculty() {
		for(Student tempB : allStudents) {
			
		}
	}
          
}
