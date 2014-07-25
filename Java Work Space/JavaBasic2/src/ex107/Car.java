/*
 * 14cm0101
 * 足立　昌太
 */
package ex107;

public class Car {
	private String name;	//名称	
	private long mileage;	//走行距離
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMileage(long mileage){
		this.mileage = mileage;
	}
	
	public long getMileage(){
		return mileage;
	}
	
	public void printDate() {
		System.out.println("名称　" + name + "走行距離　" + mileage);	//名称と走行距離を表示
	}
}
