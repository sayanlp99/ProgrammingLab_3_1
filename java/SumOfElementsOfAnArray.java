import java.util.Arrays;
import java.util.Scanner;
public class SumOfElementsOfAnArray {
   public static void main(String args[]){
      System.out.print("Enter the required size of the array: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the array: ");

      for(int i=0; i<size; i++){
      	System.out.print("["+ i +"]: ");
        myArray[i] = s.nextInt();
        sum = sum + myArray[i];
      }
      int max = myArray[0];
      int min = myArray[0];
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of the array: "+sum);
      for(int i=1; i<size; i++){
         if(min > myArray[i])
            min = myArray[i];
      }
      for(int i=0; i <size; i++){
         if(max<myArray[i])
            max = myArray[i];
      }
      System.out.println("Minimum element of array is: "+min);
      System.out.println("Maximum element of array is: "+max);
   }
   
}