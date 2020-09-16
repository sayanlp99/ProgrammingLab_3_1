import java.util.*;

class addTwoNumber{
	int sum, x , y;
	Scanner obj = new Scanner(System.in);
	void addition(){
		System.out.print("1st Number: ");
		x = obj.nextInt();
		System.out.print("2nd Number: ");
		y = obj.nextInt();
		sum = x + y;
	}
	void printResult(){
		System.out.println("Sum :" + sum);
	}
}

class addTwoNumberMain{
	public static void main(String[] args) {
		addTwoNumber n = new addTwoNumber();
		n.addition();
		n.printResult();
	}
}