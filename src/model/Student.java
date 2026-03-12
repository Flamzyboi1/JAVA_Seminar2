package model;

public class Student {
	private String matriculaNumber;
	private String name;
	private String surname;
	private String faculty;
	private int birthYear;
	private Country country;
	private String passportNumber;
	//getters
	public String getMatriculaNumber() {
		return matriculaNumber;
	}
	public String getName() {
		return  name;
	}
	public String getsurName() {
		return  surname;
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
	public String getpassportNumber () {
		return  passportNumber;
	}
	//setters
	public void setName(String inputName) {
		if ((inputName != null) && (!inputName.isEmpty())
				&&(inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))){
		name = inputName;
	}
	else 
	{
		name = "Unknown";
	 }
		
	}
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
	public void setsurName(String inputSurname) {
		if( (inputSurname != null) && (!inputSurname.isEmpty()) 
				&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
				surname = inputSurname;
			}
			else
			{
				surname = "Unknown";
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
	public void setpassportNumber (String inputpassportNumber) {
		if(inputpassportNumber != null && (!inputpassportNumber.isEmpty())
		&& (inputpassportNumber.matches("[A-Z]{2}[0-9]{5}"))){
			passportNumber = inputpassportNumber;
		}
		else
		{
			passportNumber = "unknown";
		}
		
	}
	// no -arg constructor  
	public Student() {
		setmatriculaNumber("AB123456");
		setName("Favour");
		setsurName("Obidiaso");
		setfaculty("ITF");
		setBirthYear(1999);
		setcountry(Country.Spain);
		setpassportNumber("SP09235");
	}
	//arg-constructor
	 public Student(String inputMatriculanumber,String inputName,
	 String inputSurname, String inputFaculty,int inputBirthyear, Country inputCountry,
	 String inputPassportnumber){
		 setmatriculaNumber(inputMatriculanumber);
		 setName(inputName);
		 setsurName(inputSurname);
		 setfaculty(inputFaculty);
		 setBirthYear(inputBirthyear);
		 setcountry(inputCountry);
		 setpassportNumber(inputPassportnumber);
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
