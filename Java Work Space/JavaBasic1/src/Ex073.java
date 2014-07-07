/*
 * 2014/05/30
 * Ex073.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1,num2;
		System.out.print("要素数を入力 >");
		num1 = scan.nextInt();
		System.out.print("乱数の上限を入力　>");
		num2 = scan.nextInt();
		int [] ran=new int[num1];
		
		init(ran,num1,num2);
		showInfo(ran,num1);

	}
	public static void init(int [] ran,int num1,int num2){
		for(int i=0;i<num1;i++){
			ran[i]= (int)(Math.random()*num2);
		}
	}
	public static void showInfo(int [] ran,int num1){
		for(int i = 0;i<num1;i++){
			System.out.println("要素["+ i + "]は"+ ran[i]);
		}
	}

}
