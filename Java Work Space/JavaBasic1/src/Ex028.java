/*
 * 2014/05/01
 * Ex028.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;


public class Ex028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Yesなら１を、Noなら１以外を入力　> ");
		int val;
		val =scan.nextInt();
		if(val == 1){
			System.out.println("Yes");
		}else {
			System.out.println("No");
			
		}
	}

}