package ex102;

public class Circle extends Figure{
	float radius;
	Circle(String n,float cx,float cy,float ra){
		super(n,cx,cy);
		radius = ra;
	}

	float getRadius(){
		return radius;
	}
	
	void printDate(){
		super.printDate();
		System.out.println("半径"+getRadius());
	}
	
	
}
