/*
 * 2014/04/24
 * Ex018.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int num1, num2 , quo, rim ;
		
		System.out.print("ここに数値入力　＞");
		num1 = scan.nextInt();
		System.out.print("ここに数値入力　＞");
		num2 = scan.nextInt();
		
		quo = num1 / num2 ;
		rim = num1 - (num2 * quo) ;
		
		System.out.println(num1 +"を" + num2 + "で割ったときの商は" + quo + "、余りは" + rim + "です");
		
	}

}
