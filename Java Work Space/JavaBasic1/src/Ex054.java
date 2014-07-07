/*
 * 2014/05/22
 * Ex052.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[10];
		
		for(int cnt=0;cnt<num.length;cnt++){
			num[cnt]=cnt+1;
		}
		
		System.out.print("インデックスを入力> ");
		int num1 = scan.nextInt();
		System.out.println("要素" + num1 + "の中身は" + num[num1] + "です");
	}

}
