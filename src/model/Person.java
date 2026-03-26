package model;

public class Person {
	//1. variables
	protected String name;
	protected String surname;
	protected String passportNumber;
    //2, getters
	public String getName() {
		return  name;
	}
	public String getsurName() {
		return  surname;
	}
	public String getpassportNumber () {
		return  passportNumber;
	}
	//3.setters
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
	//4.both constructors
	public Person() {
		setName("Samuil");
		setsurName("Irfan");
		setpassportNumber("Qw98765");
	}
	public Person(String inputName,String inpursurName,String inputpassportNumber) {
		setName(inputName);
		setsurName(inpursurName);
		setpassportNumber(inputpassportNumber);
	}
	//5.to string
	public String toString() {
		String result = name + " " + surname + "(" + passportNumber + ")";
		return result;
	}
}
