/*
 * 14CO0101
 * 雨宮 甲念
 */
package ex107;
class Truck extends Car{
	private int loadage;		//積載量
	
	Truck(String name, long mileage, int loadage){
		setName(name);
		setMileage(mileage);
		setLoadage(loadage);
	}

	public void setLoadage(int loadage){
		this.loadage = loadage;
	}
	public int getLoadage(){
		return loadage;
	}

	public void printDate(){
		System.out.println("名前 : "+ getName() +" 走行距離 : "+ getMileage() +" 積載量 : "+ getLoadage());
	}
}
