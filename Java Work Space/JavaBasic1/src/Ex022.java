/*
 * 2014/04/25
 * Ex021.java
 * 14cm0132
 * 山出　達也
 */
import java .util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan =new Scanner(System.in);
			
			int x, y, z, resx, resy, resz;
			


			System.out.print("角数を入力：");
			x = scan.nextInt();
			resx = 180 * (x-2);
			System.out.println(x + ("角形の内角の合計は、") + resx + ("度です"));
			
			System.out.print("角数を入力：");
			y = scan.nextInt();
			resy = 180 * (y-2);
			System.out.println(y + ("角形の内角の合計は、") + resy + ("度です"));
			
			System.out.print("角数を入力：");
			z = scan.nextInt();
			resz = 180 * (z-2);
			System.out.println(x + ("角形の内角の合計は、") + resz + ("度です"));

	}

}
