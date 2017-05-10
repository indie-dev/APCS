package T2.com.edhesive.assignments.Assignment3;

public class HighSchoolStudent extends Student{
	private double gpa;
	public HighSchoolStudent(String firstName, String lastName, int level, double gpa) {
		super(firstName, lastName, level);
		// TODO Auto-generated constructor stub
		if(gpa < 0.00 || gpa > 4.0)
		{
			this.gpa = 0;
		}
		else
		{
			this.gpa = gpa;
		}
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t GPA: " + gpa;
	}
}
