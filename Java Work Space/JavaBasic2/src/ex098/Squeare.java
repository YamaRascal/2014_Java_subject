package ex098;

public class Squeare extends Figure{
	float x,y;
	float width;
	float height;
	
	void setDate(float a,float b,float c,float d,float e,float f,String co){
		cx = a;
		cy = b;
		x = c;
		y = d;
		width = e;
		height = e;
		color = co;
	}
	//////////////////////////////////////////////////
	void showInfo(){
		System.out.println(color+"中心座標("+cx+","+cy+")左上座標（"+x+","+y+")幅"+width+"高さ"+height );
	}
	
	/*	void setCX(int c){
		cx = c;
	}
	void setCY(int c){
		cy = c;
	}
	void setX(int c){
		x = c;
	}
	void setY(int c){
		y = c;
	}
	
	void setWidth(int c){
		width = c;
	}
	void setHeight(int c){
		height = c;
	}
	
	void setColor(String co){
		color = co;
	}
	//ここまでがセッター
	//////////////////////////////////////////////////
	float getCX(){
		return cx;
	}
	float getCY(){
		return cy;
	}
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
	String getColor(){
		return color;
	}
	 * 
	 */
	
	
	
	
}
