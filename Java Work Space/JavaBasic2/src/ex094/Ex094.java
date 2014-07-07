package ex094;
import java.util.Scanner;
public class Ex094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("年月日の入力 >");
		String yyyymmdd = scan.next();
		
		String yyyy = yyyymmdd.substring(0,4);
		String mm = yyyymmdd.substring(4,6);
		String dd = yyyymmdd.substring(6,8);
		
		System.out.println("年 :"+yyyy);
		System.out.println("月 :"+mm);
		System.out.println("日 :"+dd);
	}

}
