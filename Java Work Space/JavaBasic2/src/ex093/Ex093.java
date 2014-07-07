package ex093;
import java.util.Scanner;
public class Ex093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("文字列を入力> ");
		String str1 = scan.next();
		System.out.print("文字列を入力> ");
		String str2 = scan.next();
		equals(str1,str2);
	}

	public static void equals(String str1,String str2){
		if(str1.equals(str2)){
			System.out.println("文字列は等しい");
		}else{
			System.out.println("文字列は等しくない");
		}
	}

}
