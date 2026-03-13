package model;

public class course {
	//1. variables
	private long id;
	private String title;
	private int creditPoint;
	private professor professor;
	
	//helper
	private static long counter = 10000;
	
	//2. getters
	public long getid() {
    	return id;
    }
    public String gettitle() {
    	return title;
    }
    public int getcreditpoint() {
    	return creditPoint;
    }
    public professor getprofessor() {
    	return professor;
    }
    
	//3. setters
    public void setId() {
    	id = counter;
    	counter++;
    }
    
    public void settitle(String inputtitle) {
		if ((inputtitle != null) && (!inputtitle.isEmpty())
				&&(inputtitle.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
		title = inputtitle;
	}
	       else 
	{
		title = "Unknown";
		}
    }	
    public void setcreditPoint(int inputcreditPoint) {
		if(inputcreditPoint >= 0 && (inputcreditPoint <= 10)) {
           creditPoint = inputcreditPoint;
	    }
	    else
	    {
		    creditPoint = 1;
	    } 
    }
	public void setprofessor (professor inputprofessor) {
		if(inputprofessor != null) {
				professor = inputprofessor;
			}
		  else
		  {
				professor = new professor();
			}
			
		}
	//4. no args constructor
	public course() {
		setId();
		settitle("Java");
		setcreditPoint(6);
		setprofessor(new professor());
	}
	
	//5. args constructors
		public course(String inputtitle, int inputcreditpoint,professor inputprofessor) {
			setId();
			settitle(inputtitle);
			setcreditPoint(inputcreditpoint);
			setprofessor(inputprofessor);
			
		}
	         
	//6. to string
			public String toString() {
				//0: java programming (6CP),k. Skirmante
				String result = id + ": " + title + "(" + creditPoint 
						+ "), "+ professor.getname().charAt(0)
						+ ". " + professor.getsurName();
				return result;
			}
	//7. additional functions(if necessary)
	

}
