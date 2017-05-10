package T2.com.edhesive.assignments.Assignment3;

import java.util.ArrayList;

public class School {
	private int gradeLevel;
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	public School(ArrayList<Student> student, ArrayList<Teacher> teacher)
	{
		this.students = student;
		this.teachers = teacher;
	}
	public int getGradeLevel(int gradeLevel)
	{
		for(Student student : students)
		{
			return student.getLevel();
		}
		return 0;
	}
	public String toString()
	{
		StringBuilder here_come_dat_boi = new StringBuilder();
		here_come_dat_boi.append("\nFaculty: \n\t");
		for(Teacher teacher : teachers)
		{
			here_come_dat_boi.append(teacher + "\n\t");
		}
		
		here_come_dat_boi.append("\nStudent Body: \n\t");
		
		for(Student student : students)
		{
			here_come_dat_boi.append(student);
		}
		return here_come_dat_boi.toString();
	}
	
}
