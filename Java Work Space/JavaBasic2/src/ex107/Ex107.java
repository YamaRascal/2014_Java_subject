/*
 * Ex107.java
 * 14cm0132
 * 山出　達也
 */

package ex107;

public class Ex107 {
	public static void main(String[] args){
		Truck t1 = new Truck("キャンター",100 , 30);
		SportsCar s1 = new SportsCar("S2000",2000 , 230);
		
		print(t1);
		print(s1);
	}

	public static void print(Car c){
		c.printDate();
	}
}
