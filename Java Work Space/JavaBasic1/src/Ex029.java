/*
 * 2014/05/01
 * Ex029.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			System.out.print("整数を入力 >");
			int num;
			num = scan.nextInt();
			if(num >0){
				if(num < 10){
				System.out.println("1〜9です");
				}else{
					System.out.println("10以上です");
				}
			}else{
				System.out.println("0以上です");
				
					
				}
			}
			
	}