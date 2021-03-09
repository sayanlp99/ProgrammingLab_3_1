package Shapes;
abstract class Shape{
	abstract void startDrawing();
	abstract void drawShape();
	abstract void finishDrawing();
}
class Rectangle extends Shape{
	@Override
	void startDrawing() {
        System.out.println("Getting things ready to draw a rectangle...");
	}
	@Override
	void drawShape() {
        System.out.println("Drawing a rectangle...");
	}
	@Override
	void finishDrawing() {
        System.out.println("Finished drawing a rectangle.");
	}
}
class AbstractMain{
	public static void main(String[] args) {
    	Rectangle r1 = new Rectangle();
        r1.startDrawing();
        r1.drawShape();
        r1.finishDrawing();
	}
}
