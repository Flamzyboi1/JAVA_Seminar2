package model;

public class professor {
	//1.variables
	private long id;
	private String name;
	private String surName;
	private profDegree degree;

//2. getters
    public long getid() {
    	return id;
    }
    public String getname() {
    	return name;
    }
    public String getsurName() {
    	return surName;
    }
    public profDegree getdegree() {
    	return degree;
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
		public void setsurName(String inputSurname) {
			if( (inputSurname != null) && (!inputSurname.isEmpty()) 
					&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
					surName = inputSurname;
				}
				else
				{
					surName = "Unknown";
				}
		}
}