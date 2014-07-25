/*14CM0132
  山出 達也
*/
package ex107;


class SportsCar extends Car{
	private int maxSpeed;
	
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed(){
		return  maxSpeed;
	}
	
	
	SportsCar(String a,int b,int c){
	setName(a);
	setMileage(b);
	setMaxSpeed(c);	
	}

	public void printDate(){
		System.out.println("名前 : " + getName() +"  走行距離 : "+ getMileage() +"  最高速度 : "+ getMaxSpeed());
	}
}