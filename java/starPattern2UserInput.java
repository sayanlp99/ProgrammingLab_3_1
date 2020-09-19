import java.util.Scanner;

class starPatternTwo{
	public static void main(String[] args) {
		int rows = 0;
		Scanner inp = new Scanner(System.in);
		while(rows%2==0){
			System.out.println("Enter an odd number.\n");
			System.out.print("Enter number of rows:");
			rows = inp.nextInt();
			if(rows%2!=0){
				rows=rows/2;
				rows=rows+1;
				for (int i= 0; i<= rows-1 ; i++){
		            for (int j=0; j<=i; j++) {
		                System.out.print("*"+ " ");
		            }
		            System.out.println("");
		        } 
		        for (int i=rows-1; i>=0; i--){
		            for(int j=0; j <= i-1;j++){
		                System.out.print("*"+ " ");
		            }
		            System.out.println("");
		        }
		    }
		}
	}
}