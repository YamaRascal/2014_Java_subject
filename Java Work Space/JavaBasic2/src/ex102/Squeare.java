package ex102;

public class Squeare extends Figure{
	private float x,y;
	private float width;
	private float height;
	
	Squeare(String n,float cx,float cy,float sx,float sy,float w,float h){
		super(n,cx,cy);
		x = sx;
		y = cy;
		width = w;
		height = h;
	}
	//////////////////////////////////////////////////
	float getX(){
		return x;
	}
	float getY(){
		return y;
	}
	float getWidth(){
		return width;
	}
	float getHeigth(){
		return height;
	}
	
	void printDate(){
		super.printDate();
		System.out.println("左上座標("+getX()+","+getY()+")幅"+getWidth()+"高さ"+getHeigth());
	}
	
	
}
