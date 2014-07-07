/*
 * 2014/05/22
 * Ex060.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
		int num[] = new int[5];
		
		for(int cnt=0;cnt<5;cnt++){
			System.out.print("整数を入力 ＞");
			num[cnt] = scan.nextInt();
			if(cnt==4){
				for(int cnt1=0;cnt1<num.length;cnt1++){
				System.out.println("num["+ cnt1 + "] =" + num[cnt1]);
				}
				break;
			}
		}
			
	}

}
