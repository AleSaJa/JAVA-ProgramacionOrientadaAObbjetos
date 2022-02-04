package Poo;

public class Student {
	 String firstName;
     String lastName;
     int registration;
     int grade;
     int year;   
     
     public Student() {
    	 this.firstName = "";
    	 this.lastName = "";
    	 this.registration = 0;
    	 this.grade = 0;
    	 this.year = 0;
     }
     
     public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
     
     public Student(String firstName, String lastName) {
    	 this.firstName = firstName;
    	 this.lastName = lastName;
    	 this.registration = 0;
    	 this.grade = 0;
    	 this.year = 0;
     }
     
	public void printFullName(){
         //TODO implement
		System.out.println(String.format("%s %s",this.firstName,this.lastName));
    	 
      }
	
      public Boolean isApproved(){
          //TODO implement: should return true if grade >= 60
    	  if(grade>=60) {
    		  return true;
    	  }
    	  return false;
      }
      
      public void changeYearIfApproved(){
          //TODO implement: the student should advance to the next year if he/she grade is >= 60
          // Make year = year + 1, and print "Congragulations" if the student has been approved
    	  if(isApproved()) {
    		  year++;
    		  System.out.println("Congragulations");
    	  }
      }
}
