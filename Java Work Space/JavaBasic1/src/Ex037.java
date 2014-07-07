/*
 * 2014/05/08
 * Ex037.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, max;
		System.out.print("整数aを入力　＞");
		a = scan.nextInt();
		System.out.print("整数bを入力　＞");
		b = scan.nextInt();
		System.out.print("整数cを入力　＞");
		c = scan.nextInt();
		
		if(a > b && a > c){
		max = a;
		System.out.println("最大値maxは" + max + "です。");
		} else if(b > a && b > c){
			max = b;
			System.out.println("最大値maxは" + max + "です。");
		}else if(c > a && c >b){
			max = c;
			System.out.println("最大値maxは" + max + "です。");
		}
	}

}
