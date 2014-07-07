/*
 * 2014/05/01
 * Ex030.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("整数を入力してください");
		int num1, num2;
		num1 = scan.nextInt();
		num2 = num1 % 2;
		
		if(num2 > 0){
			System.out.println(num1 + "は奇数である。");
		}else{
			System.out.println(num1 + "は偶数である。");
			
		}
	}

}
