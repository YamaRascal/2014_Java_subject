/*
 * 2014/04/24
 * Ex020.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			double x ,y , z, sum, ave;
			
			System.out.print("体重を入力：");
			x = scan.nextDouble();
			System.out.print("体重を入力：");
			y = scan.nextDouble();
			System.out.print("体重を入力：");
			z = scan.nextDouble();
			
			sum = x + y + z ;
			ave = sum /3 ;
			System.out.println("合計は" + sum + ("kg、平均は") + ave + ("kg"))
			;
			
			
	}

}
