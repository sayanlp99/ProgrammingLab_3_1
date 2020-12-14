import java.util.Scanner;
class grade{
	String name;
	int roll;
	int marks;
	void getGrade() {
		int i,n;
		float sum=0, avg;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of students: ");
		n=s.nextInt();
		int students[] =new int[n];
		for(i=0;i<students.length;i++) {
			System.out.print("Enter Name: ");
			name=s.next();
			System.out.print("Enter Roll Number: ");
			roll=s.nextInt();
			System.out.print("Enter marks: ");
			marks=s.nextInt();
			System.out.print("Grade: ");
			if(marks>90){
				System.out.print("A");
			}
			else if(marks>80 && marks<=90){
				System.out.print("B");
			}
			else if(marks>60 && marks<=80){
				System.out.print("C");
			}
			else if(marks>40 && marks<=60){
				System.out.print("D");
			}
			else{
				System.out.print("F");
			}
			System.out.println("");
		}
	}
}
public class findGrade {
	public static void main(String[] args) {
		grade g=new grade();
		g.getGrade();
	}
}