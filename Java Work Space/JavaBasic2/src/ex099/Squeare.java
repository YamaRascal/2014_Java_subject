package ex099;

public class Squeare extends Figure{
	private float x,y;
	private float width;
	private float height;
	

	void setX(float c){
		x = c;
	}
	void setY(float c){
		y = c;
	}
	
	void setWidth(float c){
		width = c;
	}
	void setHeight(float c){
		height = c;
	}
	

	//ここまでがセッター
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
	
	
	
	
}
