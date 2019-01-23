import processing.core.PApplet;
import processing.core.PVector;

public class Brain {
	

	PApplet UsingProcessing;
	
	PVector[] directions;
	int step = 0;
	 
	 
	 Brain(int size){
		 
		 directions = new PVector[size];
		 randomize();
		 
	 }
	

	 void randomize() {
		 
		 for(int i = 0; i < directions.length; i++ ) {
			 
			 float randomAngle = (float) (Math.random()*(2*Math.PI));
			 directions[i] = PVector.fromAngle(randomAngle);
			 
		 }
	 }
}
