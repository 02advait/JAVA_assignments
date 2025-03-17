import java.util.*;				// Student Management System - Menu Driven.

class Student{
	int rollno;
	String name;
	int age;
	double fees;
	public Student() {
		
	}
	public Student(int rollno, String name, int age, double fees) {
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "[rollno=" + rollno + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}	
	
	
	
}

public class menudriven {
	
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student(101,"Tanmay",25,50000.00));
		slist.add(new Student(102,"Sahil",23,45000.00));
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		do {
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("Press 1 to Add Student.");
		System.out.println("Press 2 to View Student.");
		System.out.println("Press 3 to Update Student.");
		System.out.println("Press 4 to Delete Student.");
		System.out.println("Press 5 to Exit.");
		
		System.out.println("Enter your choice: ");
		choice = scan.nextInt();
		
		switch(choice) {
			case 1:{
				Scanner sc = new Scanner(System.in);
				Student s = new Student();
				System.out.println("Enter Roll No: ");
				s.rollno = sc.nextInt();
				System.out.println("Enter Name: ");
				s.name = sc.next();
				System.out.println("Enter Age: ");
				s.age = sc.nextInt();
				System.out.println("Enter Fees: ");
				s.fees = sc.nextDouble();
				
				slist.add(s);
				System.out.println("Student added successfully.");
				break;
				
			}
			case 2:{
				for(Student s:slist) {
					System.out.println(s);
				}
				break;
			}
			case 3:{
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter Roll No of Student to be Updated: ");
				int rn1 = sc1.nextInt();
				boolean flag = false;
				for(Student s:slist) {
					if (rn1==s.rollno) {
						flag = true;
						System.out.println("Enter new name, age, fees:");
						s.name = sc1.next();
						s.age = sc1.nextInt();
						s.fees = sc1.nextDouble();
						System.out.println("Record Updated Successfully.");
						break;
					}
				}
				if (flag == false) {
					System.out.println("Student not found.");
				}
				break;
						
			}
			case 4:{
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter Roll No of Student to be Deleted: ");
				int rn2 = sc2.nextInt();
				boolean flag1 = false;
				for(Student s:slist) {
					if (rn2==s.rollno) {
						flag1 = true;
						slist.remove(s);
						System.out.println("Record Deleted Successfully.");
						break;
					}
				}
				if (flag1 == false) {
					System.out.println("Student not found.");
				}
			}
			case 5:{
				System.out.println("Exitng Program...");
				break;
			}
			default:
				System.out.println("Invalid Choice.");
			
		}
	}while(choice!=5);	
		
	}

}
