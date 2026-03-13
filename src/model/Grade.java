package model;

public class Grade {
//1. variables
	private long id;
	private int Value;
	private Student student;
	private course Course;
	
	//helper
		private static long counter = 20000;
		
	
//2. getters
	public long getid() {
		return id;
	}
	public int getValue() {
		return Value;
	}
	public Student getstudent() {
		return student;
	}
	public course getCourse() {
		return Course;
	}
	
//3. setters
	public void setid() {
    	id = counter;
    	counter++;
    }
    
    public void setValue(int inputValue) {
    	if(inputValue > 0 && inputValue <=10) {
    		Value = inputValue;
    	}
    	else {
    		Value = 1;
    	}
	}
    public void setstudent (Student inputstudent) {
		if(inputstudent != null) {
				student = inputstudent;
			}
		  else
			{
				student = new Student();
			}
			
		}
    public void setcourse (course inputCourse) {
		if(inputCourse != null) {
				Course = inputCourse;
			}
		  else
			{
				Course = new course();
			}
			
		}
   //4. no-args constructor
    public Grade() {
    	setid();
    	setValue(10);
    	setstudent(new Student());
    	setcourse(new course());
    }
    
  //5.  arg constructors	      
    public Grade(int inputValue,Student inputStudent,course inputCourse) {
		setid();
		setValue(inputValue);
		setstudent(inputStudent);
		setcourse(inputCourse);
		}
 //.6 to string
    public String toString() {
    	//20000: F.Obidiaso got 10 in Java
    	String result = id + ": " + student.getName().charAt(0)+ ". " +  student.getsurName() + " got " + Value +  " in " + Course.gettitle();
		return result;
	}

	
    
	
}
