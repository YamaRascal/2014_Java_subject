/*
 * 2014/05/01
 * Ex030.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("入れるお金を入力してください >");
		int num1, num2, num3,price;
		price = 110;	//自販機の値段
		num1 = scan.nextInt();
		num2 = num1 - price ;
		num3 = num2 * -1 ;
		
		
		if (num2 >= 0){
			if(num2 > 0){
			System.out.println("販売しました。おつりは" + num2 +"円です");
			}else{
				System.out.println("販売しました。");			
			}
		}else{
			System.out.println("お金が足りません。不足金は" + num3 + "円です。");
				
			}
			
		}
		
	}

