/*
 * 2014/05/15
 * Ex042.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Random;

public class Ex042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int num1,num2;
		num1 = rand.nextInt(6)+1;
		System.out.print(num1 +" ");	
		num2 = rand.nextInt(6)+1;
		System.out.println(num2);
		System.out.println(("合計は\n") + (num1 + num2) );
	}

}
