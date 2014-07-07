package ex101;

public class Figure {
	private String color;		//色（red,blue,yellow・・・ect）
	private float cx, cy;		//中心座標(cx,cy)
	Figure(String n,float x,float y){
		color = n;
		cx = x;
		cy = y;
	}
	
	////////////////////////////////
	float getCX(){
		return cx;
	}
	float getCY(){
		return cy;
	}
	String getColor(){
		return color;
	}
	
	void printDate(){
		System.out.print(getColor()+"中心座標("+getCX()+","+getCY()+")");
	}
	
	
}
