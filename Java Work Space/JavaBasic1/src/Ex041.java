/*
 * 2014/05/15
 * Ex041.java
 * 14cm0132
 * 山出　達也
 */

import java.util.Random;
public class Ex041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int  num;
		for(int i=0; i<5; i++){
			num =rand.nextInt(11);  //0から10までの小さい乱数を生成
			System.out.println(num);
		}
	}

}
