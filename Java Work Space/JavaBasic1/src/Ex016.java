/*
 * 2014/04/24
 * Ex016.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("数値を３つ入力することで合計と平均を出す");
		Scanner scan = new Scanner(System.in);
		
		double valA, valB, valC, sum, ave;
		
		valA = scan.nextInt();
		valB = scan.nextInt();
		valC = scan.nextInt();
		sum = valA + valB + valC ;
		ave = sum/3.0 ;
		
	
		System.out.println("合計は" + sum + "、平均は" + ave + "となる。");
		
		
		
	}

}
