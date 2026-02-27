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
				&&(inputName.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}?"))){
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
	public void setsurName() {
		
	}
	public void setfaculty() {
		
	}
	public int setbirthYear() {
		
	}
	public Country setcountry () {
		
	}
	public void setpassportNumber () {
		
	}
	// no -arg constructor

}
