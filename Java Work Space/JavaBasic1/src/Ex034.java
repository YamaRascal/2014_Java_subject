/*
 * 2014/05/02
 * Ex034.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		
		int a, b, c, max;
		System.out.print("整数を入力せよ　＞");
		a = scan.nextInt();
		
		System.out.print("整数を入力せよ　＞");
		b = scan.nextInt();
		
		System.out.print("整数を入力せよ　＞");
		c = scan.nextInt();
		
		if (a > b){
		if (a > c){
			max = a;
			System.out.println("最大値maxは" + max + "です。");
		}else {
			max = c;
			System.out.println("最大値maxは" + max + "です。");
		}}else  if(b > c){
			max = b;
			System.out.println("最大値maxは" + max + "です。");
		}else {
			max = c;
			System.out.println("最大値maxは" + max + "です。");
					
		}
	}

}
