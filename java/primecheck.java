import java.util.Scanner;

class primecheck{
	public static void main(String args[]){
		int inp, flag = 0;
		System.out.print("Enter number: ");
		Scanner obj = new Scanner(System.in);
		inp = obj.nextInt();
		for(int i = 2; i <= inp/2; i = i + 1){
			if(inp%i == 0){
				System.out.println(inp + " is not a prime number.");
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println(inp + " is a prime number.");
		}
	}
}