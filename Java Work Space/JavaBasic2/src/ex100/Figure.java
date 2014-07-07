package ex100;

public class Figure {
	private String color;		//色（red,blue,yellow・・・ect）
	private float cx, cy;		//中心座標(cx,cy)
	
	void setCX(float c){
		cx = c;
	}
	void setCY(float c){
		cy = c;
	}
	
	void setColor(String co){
		color = co;
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
