import java.util.*;
class box{
	int height, width, length, volume;
	void calculateVolume(){
		volume = height * width * length;
	}
}
class computeVolume{
	public static void main(String[] args) {
		box n = new box();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter following to Calculate Volume: ");
		System.out.print("Height: ");
		n.height = obj.nextInt();
		System.out.print("Width: ");
		n.width = obj.nextInt();
		System.out.print("Length: ");
		n.length = obj.nextInt();
		n.calculateVolume();
		System.out.println("Volume is " + n.volume);
	}
}