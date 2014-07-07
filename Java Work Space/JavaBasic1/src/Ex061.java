/*
 * 2014/05/22
 * Ex061.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
import java.text.*;
public class Ex061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum =0;
		int num[] = new int[5];
		int len = num.length;
		double ave;
		
		for(int cnt=0;cnt<5;cnt++){
			System.out.print("整数を入力 ＞");
			num[cnt] = scan.nextInt();
		}

		for(int a:num){
			sum += a;
		}
		ave = sum/len;
		DecimalFormat format = new DecimalFormat("0.00");
			System.out.println("合計は" + sum + "平均は" + format.format(ave));
			

		}
	}


