package model;

public class professor {
	//1.variables
	private long id;
	private String name;
	private String surName;
	private profDegree degree;
	private String passportNumber;
	
	//helper variable and no need to create get or set for it
	private static long counter = 0;

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
    public String getpassportNumber() {
    	return passportNumber;
    }
    //setters
    public void setId() {
    	id = counter;
    	counter++;
    }
    
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
		public void setdegree (profDegree inputdegree) {
			if(inputdegree != null) {
				degree = inputdegree;
			}
			else
			{
				degree = profDegree.unknown;
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
		public professor() {
			setId();
			setName("Karlis");
			setsurName("Immers");
			setdegree(profDegree.phd);
			setpassportNumber("KI07285");
		
		}
		//arg-constructor
		public professor(String inputName, String inputsurName,profDegree inputDegree, String inputpassportNumber) {
			setId();
			setName(inputName);
			setsurName(inputsurName);
			setdegree(inputDegree);
			setpassportNumber(inputpassportNumber);
		}
		//to string
		public String toString() {
			//0: karina Skirmante (master)
			String result = id + ": " + name + " " + surName + "(" + degree + ")" + passportNumber;
			return result;
		}
		
		
		
		}
