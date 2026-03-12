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
		if(inputcreditPoint >= 03 && (inputcreditPoint <= 30)) {
           creditPoint = inputcreditPoint;
	    }
	    else
	    {
		    creditPoint = 30;
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
	//5. args constructors
	//6. to string
	//7. additional functions(if necessary)
	

}
