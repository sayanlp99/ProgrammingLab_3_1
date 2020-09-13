import java.util.Scanner; 

class factorial{
	public static void main(String args[]){
		int inp, fact = 1;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number: ");
		inp = obj.nextInt();
		for(int i = 1; i <= inp; i=i+1){
			fact = fact * i;
		}
		System.out.println("Factorial of "+ inp +": "+ fact);
	}
}