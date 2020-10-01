import java.util.*;
class box{
	int height, width, length, volume;
	void setVal(int h, int w, int l){
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
		box n = new box();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter following to Calculate Volume: ");
		System.out.print("Height: ");
		hi = obj.nextInt();
		System.out.print("Width: ");
		wi = obj.nextInt();
		System.out.print("Length: ");
		le = obj.nextInt();
		n.setVal(hi, wi, le);
		n.calculateVolume();
		System.out.println("Volume is " + n.volume);
	}
}