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
        professor prof2 = new professor ("Estere","Vitola",profDegree.master,"EV42658");
     
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
        
        try
		{
		ArrayList<Student> result 
		= filterAllStudentsWhichBirtyearIsLargerThan(2007);
		System.out.println(result);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
        try {
        	ArrayList<Student> result2 
    		= filterAllStudentWhichFacultyisITF("ITF");
    		System.out.println(result2);
        }
        catch (Exception e) {
			System.out.println(e.getMessage());
		}
        try {
        	ArrayList<course> result3 
        = filteredCoursesByProfessorId(1);
    		System.out.println(result3);
        }
        catch (Exception e) {
			System.out.println(e.getMessage());
		}
        try {
        	ArrayList<Grade> result4
        = filterfailedGrades();
    		System.out.println(result4);
        }
        catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
			System.out.println("---------CRUD FOR PROFESSOR--------");
			try {
				createNewPofessor("Karina","Skirmante",profDegree.master, "KI13445");
				System.out.println(allprofessors);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	
	}
	//Filtering
	public static void filterAllProfessorsWithSpecificDegree(profDegree degree) {
		for(professor tempS : allprofessors) {
			if(tempS.getdegree().equals(degree)) {
				System.out.println(tempS);
			}
		}
	}
	public static ArrayList<Student> 
	filterAllStudentsWhichBirtyearIsLargerThan(int inputBirthyearThreshold) throws Exception
	{
		ArrayList<Student> filteredStudents = new ArrayList<Student>();
		for(Student tempS : allStudents) {
			if(tempS.getbirthYear() >= inputBirthyearThreshold) {
				filteredStudents.add(tempS);
			}
		}


		if(filteredStudents.isEmpty()) {
			Exception myExc = new Exception
				("There is no student which birth year is larger than " + inputBirthyearThreshold);
			throw myExc;
		}
		else
		{
			return filteredStudents;
		}
		
				
		
		
	}
	public static ArrayList<Student>filterAllStudentWhichFacultyisITF(String inputFaculty) throws Exception {
		ArrayList<Student> filteredStudent = new ArrayList<Student>();
		for(Student tempS : allStudents) {
			if(tempS.getfaculty().equals(inputFaculty)) {
				filteredStudent.add(tempS);
			}
		}
		if(filteredStudent.isEmpty()) {
			Exception myExc = new Exception
				("There is no student which faculty is" + inputFaculty);
			throw myExc;
		}
		else
		{
			return filteredStudent;
		}
	}
       //which leading professor ID is 1\
	public static ArrayList<course>filteredCoursesByProfessorId(long inputId)throws Exception{
		ArrayList<course>filteredcourse = new ArrayList<course>();
		for(course tempC :allcourses) {
			if(tempC.getprofessor().getid()==inputId) {
				filteredcourse.add(tempC);
			}
		}
		if(filteredcourse.isEmpty()) {
			Exception myExc = new Exception("There is no course which leading professor with ID 1" + inputId);
			throw myExc;
		}
		else {
			return filteredcourse;
		}
		
	}
	public static ArrayList<Grade>filterfailedGrades()throws Exception{
		ArrayList<Grade>filteredGrade = new ArrayList<Grade>();
		for(Grade tempG : allgrades) {
			if(tempG.getValue() < 4) {
				filteredGrade.add(tempG);
			}
		}
		if(filteredGrade.isEmpty()) {
			Exception myExc = new Exception ("there is no Grade which is below 4");
			throw myExc;
		}
		else
		{
			return filteredGrade;
		}
		
	}
	//CRUD - C CREATE; R - RETRIVE; U - UPDADE; D - DELETE
	public static void createNewPofessor(String inputName, String inputsurName,profDegree inputDegree, String inputpassportNumber) throws Exception{
		//TODO check input params
		for(professor tempP : allprofessors) {
			if(tempP.getpassportNumber().equals(inputpassportNumber)) {
				Exception myExc = new Exception("Professor already exists in the system");
				throw myExc;
			}
		}
		professor newProfessor = new professor( inputName, inputsurName,inputDegree, inputpassportNumber);
			allprofessors.add(newProfessor);
		
	}
}
