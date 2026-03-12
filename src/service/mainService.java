package service;

import model.Country;
import model.Student;

public class mainService {

	public static void main(String[] args) {	
        Student stud1 = new Student(); //default Favour
        System.out.println(stud1);
        
        Student stud2 = new Student("AB987654","John","Sarfo",
        		"BES",1996, Country.other, "GH23766");
        System.out.println(stud2);
        
        Student stud3 = new Student("BF987654","Agnese","kelechi",
        		"ITF",2000, Country.Nigeria, "NG23766");
        System.out.println(stud3);
        
        Student stud4 = new Student("HY987654","Aiga","Estere",
        		"ICC",2009, Country.Lithuainia, "LT23766");
        System.out.println(stud4);
	}

}
