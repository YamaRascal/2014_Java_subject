/*
 * 2014/05/08
 * Ex036.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("月を入力せよ　＞");
		int num1;
		num1 = scan.nextInt();

		switch(num1){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(num1 + "月は31日です");
			break;
		case 2:
			System.out.println(num1 + "月は28日です");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(num1 + "月は30日です");
			break;
	}
	}
	
}
