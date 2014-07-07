/*
 * 2014/05/08
 * Ex038.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int leap; //leap year　うるう年
		
		System.out.print("西暦を入力してください　＞");
		leap = scan.nextInt();
		
		if (leap%4 == 0 ){
			if (leap%100 == 0){
				if (leap%400 == 0){
					System.out.println("うるう年です");
				}else 
					System.out.println("うるう年ではありません");
			}else 
				System.out.println("うるう年です");
		}else
			System.out.println("うるう年ではありません");
		
		
		
	}

}
