/*
 * 2014/05/16
 * Ex049.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Random;
import java.util.Scanner;

public class Ex049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int num1,num2;
		num1 = rand.nextInt(10);
		
		for(;;){				//無限ループ
			System.out.print("数当てゲームです\n０〜９までで数値を入力してください >");
			num2 = scan.nextInt();
		if(num1==num2){
			System.out.println("当たり");
			break;
		}else {
			System.out.println("はずれ");
		}
		}
	}

}
