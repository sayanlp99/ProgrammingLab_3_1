import java.util.*;
class operation{
	int num_one, num_two, num_res;
  public operation(int one, int two, int res){
    num_one = one;
    num_two = two;
    num_res = res;
  }
	void addition(){
		num_res = num_one + num_two;
	}
	void substraction(){
		num_res = num_one - num_two;
	}
	void multiplication(){
		num_res = num_one * num_two;
	}
	void division(){
		num_res = num_one / num_two;
	}
}
class computeOperation{
	public static void main(String[] args) {
		int sel = 1;
		Scanner input = new Scanner(System.in);
		operation n = new operation();
		while(sel!=0){
			System.out.println("Enter option from menu: ");
			System.out.print("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n0. Quit\n:");
			sel = input.nextInt();
			if(sel==1 || sel==2 || sel==3 || sel==4){
				System.out.print("Enter number: ");
				n.num_one = input.nextInt();
				System.out.print("Enter another number: ");
				n.num_two = input.nextInt();
			}
			switch(sel){
				case 1:
					n.addition();
					System.out.println("Sum: " + n.num_res);
					break;
				case 2:
					n.substraction();
					System.out.println("Sub: " + n.num_res);
					break;
				case 3:
					n.multiplication();
					System.out.println("Mul: " + n.num_res);
					break;
				case 4:
					n.division();
					System.out.println("Div: " + n.num_res);
					break;
				case 0:
					System.out.println("Quiting......");
					break;
				default:
					System.out.println("Wrong Input.");
			}
		}
	}
}
