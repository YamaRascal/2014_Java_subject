/*
 * 2014/05/15
 * Ex046.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int  cnt,num;
		cnt = 0;
		while(cnt<3){
			System.out.print("入力>");
			num = scan.nextInt();
			System.out.println((cnt+1) + "回目の入力は" + num + "です");
			cnt++;
		}

	}

}
