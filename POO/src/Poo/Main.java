package Poo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses myClass = new Courses("Mate", "Juan", 2022);

       Student student1 = new Student("Ruravi", "Mojica", 2018, 80, 2022);
       Student student2 = new Student("Pedro", "Diaz", 2018, 85, 2022);
       Student student3 = new Student("Luis", "lopez", 2018, 90, 2022);
       Student student4 = new Student("Felipe", "Hernandez", 2018, 100, 2022);
       Student student5 = new Student("José", "lopez", 2018, 50, 2022);

        myClass.enroll(student1);
        myClass.enroll(student2);
        myClass.enroll(student3);
        myClass.enroll(student4);
        myClass.enroll(student5);



        System.out.println(myClass.countStudents());


        myClass.unEnroll(student3);

        System.out.println(myClass.countStudents());

        System.out.println(myClass.bestGrade());
	}

}
