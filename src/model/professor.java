package model;

public class professor extends Person{
	//1.variables
	private long id;
	private profDegree degree;
	
	
	//helper variable and no need to create get or set for it
	private static long counter = 0;

//2. getters
    public long getid() {
    	return id;
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
 
		public void setdegree (profDegree inputdegree) {
			if(inputdegree != null) {
				degree = inputdegree;
			}
			else
			{
				degree = profDegree.unknown;
				}
			}
			
						
		// no -arg constructor
		public professor() {
			super("Karlis","Immers","KI07285");
			setId();
			//setName("Karlis");
			//setsurName("Immers");
			setdegree(profDegree.phd);
			//setpassportNumber("KI07285");
		
		}
		//arg-constructor
		public professor(String inputName, String inputsurName,profDegree inputDegree, String inputpassportNumber) {
			super(inputName,inputsurName,inputpassportNumber);//this will call arg constructor from the person class
			setId();
			//setName(inputName);
			//setsurName(inputsurName);
			setdegree(inputDegree);
			//setpassportNumber(inputpassportNumber);
		}
		//to string
		public String toString() {
			//0: karina Skirmante (master)
			String result = id + ": " + name + " " + surname + "(" + degree + ")" + passportNumber;
			return result;
		}
		
		
		
		}
