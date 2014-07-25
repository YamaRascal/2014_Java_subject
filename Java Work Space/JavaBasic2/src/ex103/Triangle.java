package eex103;

public class Triangle extends Figure{
	float x1,y1,x2,y2,x3,y3;
	
	Triangle(String n,float cx,float cy,float a1,float b1,float a2,float b2,float a3,float b3){
		super(n,cx,cy);
		x1 = a1;
		y1 = b1;
		x2 = a2;
		y2 = b2;
		x3 = a3;
		y3 = b3;
	}
	float getX1(){
		return x1;
	}
	float getY1(){
		return y1;
	}
	float getX2(){
		return x2;
	}
	float getY2(){
		return y2;
	}
	float getX3(){
		return x3;
	}
	float getY3(){
		return y3;
	}
	
	void printDate(){
		super.printDate();
		System.out.println("頂点1("+getX1()+","+getY1()+")頂点2("+getX2()+","+getY2()+")頂点3("+getX3()+","+getY3()+")");
	}
	void rotate(double rd){
		rd = Math.toRadians(rd);
		x1=(float) (x1*Math.cos(rd)-y1*Math.sin(rd));
		y1=(float) (x1*Math.sin(rd)+y1*Math.cos(rd));
		
		x2=(float) (x2*Math.cos(rd)-y2*Math.sin(rd));
		y2=(float) (x2*Math.sin(rd)+y2*Math.cos(rd));
		
		x3=(float) (x3*Math.cos(rd)-y3*Math.sin(rd));
		y3=(float) (x3*Math.sin(rd)+y3*Math.cos(rd));
	}
	
}