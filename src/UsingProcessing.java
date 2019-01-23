import processing.core.PApplet;

public class UsingProcessing extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("UsingProcessing");

	}

	Population test;
	
	public void settings() {
		size(800,800);
		test = new Population(this, 2000);
		
		
	}
	
	public void setup() {
		
	}
	
	public void draw() {
		background(255);
		test.update();
		test.show();
		
	}
}
