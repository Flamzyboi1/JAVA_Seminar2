package model;

public class Student extends Person{
	private String matriculaNumber;
	
	private String faculty;
	private int birthYear;
	private Country country;
	
	// Name,surName, passportNumber, is from person class
	
	//getters
	public String getMatriculaNumber() {
		return matriculaNumber;
	}
	
	public String getfaculty() {
		return  faculty;
	}
	public int getbirthYear() {
		return birthYear;
	}
	public Country getcountry () {
		return  country;
	}
	
	//setters
	
	public void setmatriculaNumber(String inputMatriculaNumber) {
		if ((inputMatriculaNumber != null) && (!inputMatriculaNumber.isEmpty())
				&&(inputMatriculaNumber.matches("[A-Z]{2}[0-9]{6}?"))){
		matriculaNumber= inputMatriculaNumber;
	}
	else 
	{
		name = "Unknown";
	 }
	}
	
	public void setfaculty(String inputFaculty) {
		if((inputFaculty != null) && (!inputFaculty.isEmpty())
				&& (inputFaculty.matches("[A-Za-z ]{3,100}"))) {
			faculty = inputFaculty;
		}
		else
		{
			faculty = "Unknown";
		}
	}
	public void setBirthYear(int inputBirthYear) {
		if(inputBirthYear >= 1950 && (inputBirthYear <= 2020)) {
           birthYear = inputBirthYear;
	    }
	    else
	    {
		    birthYear = 2008;
	    } 
    }
	public void setcountry (Country inputCountry) {
		if(inputCountry != null) {
			country = inputCountry;
		}
		else
		{
			country = Country.unknown;
		}
		
	}
	
	// no -arg constructor  
	public Student() {
		super();//
		setmatriculaNumber("AB123456");
		//setName("Favour");
		//setsurName("Obidiaso");
		setfaculty("ITF");
		setBirthYear(1999);
		setcountry(Country.Spain);
		//setpassportNumber("SP09235");
	}
	//arg-constructor
	 public Student(String inputMatriculanumber,String inputName,
	 String inputSurname, String inputFaculty,int inputBirthyear, Country inputCountry,
	 String inputPassportnumber){
		 super(inputName,inputSurname,inputPassportnumber);//this will call arg constructor from the person class
		 setmatriculaNumber(inputMatriculanumber);
		//setName(inputName);
		// setsurName(inputSurname);
		 setfaculty(inputFaculty);
		 setBirthYear(inputBirthyear);
		 setcountry(inputCountry);
		// setpassportNumber(inputPassportnumber);
	     }
	 
	 //Favour Obidiaso (AB123456) ITF,1999
 	public String toString() {
		String result = name  + " "  + surname 
				+ "(" + matriculaNumber + ")" + faculty
				+ " "+ birthYear + "[" + country + "],"
				+ passportNumber;
		return result;
 	}
	
	

		

}
