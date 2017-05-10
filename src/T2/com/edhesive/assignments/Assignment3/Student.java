package T2.com.edhesive.assignments.Assignment3;

public class Student extends Person{
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private int studentId;
	private int nextStudentId=1;
	public Student(String firstName, String lastName, int level){
		super(firstName, lastName);
		if(level < 0 || level > 12)
		{
			this.gradeLevel = 0;
		}else{
			this.gradeLevel = level;
		}
		this.studentId++;
	}
	
	public int getLevel()
	{
		return this.gradeLevel;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t Grade Level: " + this.gradeLevel + "\n\t ID: " + studentId;
	}
}
