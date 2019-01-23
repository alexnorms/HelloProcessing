import processing.core.PApplet;

public class Population {

	PApplet UsingProcessing;
	
	Dot[] dots;
	
	
	Population(PApplet b, int size){
		
		UsingProcessing = b;
		
		dots = new Dot[size];
		for(int i = 0; i< size; i++) {
			dots[i] = new Dot(UsingProcessing);
		}
		
	}
	
	
	//---------------------------------------------------------------------------
	
	void show() {
		
		for(int i = 0; i < dots.length; i++) {
			dots[i].show();
		}
	}
	
	//---------------------------------------------------------------------------
	
	void update() {
		
			for(int i = 0; i < dots.length; i++) {
				dots[i].update();
			}
		}
	
}
