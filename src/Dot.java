import processing.core.PApplet;
import processing.core.PVector;

public class Dot {
	
	PApplet UsingProcessing;
	
	PVector pos;
	PVector vel;
	PVector acc;
	
	Brain brain;
	
	
	boolean dead = false;
	
	Dot(PApplet b){
		
		UsingProcessing = b;
		
		brain = new Brain(400);
		
		pos = new PVector(UsingProcessing.width/2, UsingProcessing.height/2);
		vel = new PVector(0,0);
		acc = new PVector(0,0);
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	void show() {
		
		UsingProcessing.fill(300);
		UsingProcessing.ellipse(pos.x, pos.y, 4, 4);
		
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	void move() {
		
		if(brain.directions.length > brain.step) {
			acc = brain.directions[brain.step];
			brain.step++;
		}
		
		else {
			dead = true;
		}
		
		vel.add(acc);
		vel.limit(5);
		pos.add(vel);
		
	}
	
	
	//------------------------------------------------------------------------------------------
	
	void update() {
		
		if(!dead) {
			move();
			
			if(pos.x < 2 || pos.y < 2 || pos.x > (UsingProcessing.width-2) || pos.y > (UsingProcessing.height -2)) {
				dead = true;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
