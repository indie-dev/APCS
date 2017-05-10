package T2.com.edhesive.assignments.Assignment3;

public class Teacher extends Person{
	private String subject;
	public Teacher(String firstName, String lastName, String subject) 
	{
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		this.subject = subject;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t Subject: " + this.getSubject();
	}
}
