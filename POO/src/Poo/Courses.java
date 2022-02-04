package Poo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortByGrade implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return a.grade - b.grade;
    }
}

public class Courses {
	String courseName;
	String professorName;
	int year;
	ArrayList<Student> students;
	
	public Courses(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
		this.students = new ArrayList<Student>();
	}

	public void enroll(Student student){
		//TODO add the student to the collection
		this.students.add(student);
	}

   public void unEnroll(Student student){
       //TODO remove this student from the collection
       // Hint: check if that really is this student
	   this.students.remove(student);
   }

   public int countStudents(){
       //TODO implement
	   return this.students.size();
   }
   
   public int bestGrade(){
       //TODO implement
       Collections.sort(students, new sortByGrade());
       return students.get(students.size() - 1).grade;
   }
	
}
