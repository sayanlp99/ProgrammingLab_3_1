import java.util.*;
class isPrime{
	int prime;
	boolean isPrime = false;
	public isPrime(int p){
		prime = p;
	}
	boolean checkPrime(){
		int flag = 0;
		for(int i = 2; i <= prime/2; i = i + 1){
			if(prime%i == 0){
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
class primeMain{
	public static void main(String[] args) {
		int input;
		Scanner inpObj = new Scanner(System.in);
		System.out.print("Enter number: ");
		input = inpObj.nextInt();
		isPrime p = new isPrime(input);
		System.out.println("Is " + input + " Prime?: " + p.checkPrime());
	}
}