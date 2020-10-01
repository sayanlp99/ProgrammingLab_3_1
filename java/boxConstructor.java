import java.util.*;
class box{
	int height, width, length, volume;
	public box(int h, int w, int l){
		length = l;
        width = w;
        height = h;
	}
	void calculateVolume(){
		volume = height * width * length;
	}
}
class computeVolume{
	public static void main(String[] args) {
		int hi, wi, le;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter following to Calculate Volume: ");
		System.out.print("Height: ");
		hi = obj.nextInt();
		System.out.print("Width: ");
		wi = obj.nextInt();
		System.out.print("Length: ");
		le = obj.nextInt();
		box n = new box(hi, wi, le);
		n.calculateVolume();
		System.out.println("Volume is " + n.volume);
	}
}