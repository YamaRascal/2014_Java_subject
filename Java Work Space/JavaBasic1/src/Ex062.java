/*
 * 2014/05/22
 * Ex062.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int year,mon;
		int [] month= {31,28,31,30,31,30,31,31,30,31,30,31};

		for(;;){
			System.out.print("西暦と月を入力してください＞");
			year =scan.nextInt();

			if (year%4 == 0  && year%100 != 0 || year%400 == 0){
				mon = scan.nextInt();
				month[1]=29;
				System.out.println(year + "年" + mon + "月は" + month[mon-1] + "日です");
			}else if(year==-1){
				System.out.println("終了");
				break;
			}else{
				mon = scan.nextInt();
				month[1]=28;
				System.out.println(year + "年" + mon + "月は" + month[mon-1] + "日です");
			}
		}
	}
}
