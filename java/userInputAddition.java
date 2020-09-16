import java.util.Scanner; 

class userInputAddition{
	public static void main(String[] args) {
		double num1, num2, sum;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number: ");
		num1 = obj.nextInt();
		System.out.print("Enter another number: ");
		num2 = obj.nextInt();
		sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}
}