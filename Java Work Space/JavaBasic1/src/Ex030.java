/*
 * 2014/05/01
 * Ex030.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			System.out.println("数を入力せよ　＞");
			int a;
			a = scan.nextInt();
			System.out.println("別の数を入力せよ　＞");
			int b;
			b = scan.nextInt();
			
			if(a > b){
				System.out.println(a + "の方が大きい数である");
			}else{
				a=b;
				System.out.println(a + "の方が大きい数である");
			}
			
					}

}
