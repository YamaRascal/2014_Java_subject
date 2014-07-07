/*
 * 2014/05/02
 * Ex035.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.print("西暦を和暦に変換します。 \n知りたい西暦を入力してください　＞");
		num = scan.nextInt();

		if (num >= 1868){
			if(num >= 1912){
				if(num >= 1926){
					if(num >= 1989){
						System.out.println(num + "年は平成です");
					}else{
						System.out.println(num + "年は昭和です");						
					}}else{
						System.out.println(num + "年は大正です");	
					}}else{
						System.out.println(num + "年は明治です");			
					}}else {
						System.out.println("入力エラーです。1868年以上の西暦を入力してください");
					}
	}
}



