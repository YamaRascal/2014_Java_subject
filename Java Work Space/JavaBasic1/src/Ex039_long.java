/*
 * 2014/05/08
 * Ex039_long.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex039_long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int y ,m ,d1 ,count;
		
		System.out.print("年月日を入力 >");
		y = scan.nextInt();
		m = scan.nextInt();
		d1 = scan.nextInt();
		
		int m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11;
		if (1 <= m && m <= 12){
		if (y%4 == 0  && y%100 != 0 || y%400 == 0){
			m1 = 31;
			m2 = 29;
			m3 = 31;
			m4 = 30;
			m5 = 31;
			m6 = 30;
			m7 = 31;
			m8 = 31;
			m9 = 30;
			m10 = 31;
			m11 = 30;

			
		switch(m){
		case 1:
			if(1 <= d1 && d1 <= 31){
			count = d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 2:
			if(1 <= d1 && d1 <= 29){
			count = m1 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 3:
			if(1 <= d1 && d1 <= 31){
			count = m1 + m2 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 4:
			if(1 <= d1 && d1 <= 30){
			count = m1 + m2 + m3 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 5:
			if(1 <= d1 && d1 <= 31){
			count = m1 + m2 + m3 + m4 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 6:
			if(1 <= d1 && d1 <= 30){
			count = m1 + m2 + m3 + m4 + m5 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 7:
			if(1 <= d1 && d1 <= 31){
			count = m1 + m2 + m3 + m4 + m5 + m6 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 8:
			if(1 <= d1 && d1 <= 31){
			count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 9:
			if(1 <= d1 && d1 <= 30){
			count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 10:
			if(1 <= d1 && d1 <= 31){
			count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 11:
			if(1 <= d1 && d1 <= 30){
			count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break;
		case 12:
			if(1 <= d1 && d1 <= 31){
			count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + d1;
			System.out.println("1月1日からの日数は" + count);
			}else
				System.out.println("入力エラーです");
			break; }
		}else {
			m1 = 31;
			m2 = 28;
			m3 = 31;
			m4 = 30;
			m5 = 31;
			m6 = 30;
			m7 = 31;
			m8 = 31;
			m9 = 30;
			m10 = 31;
			m11 = 30;

			
			switch(m){
			case 1:
				if(1 <= d1 && d1 <= 31){
				count = d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 2:
				if(1 <= d1 && d1 <= 28){
				count = m1 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 3:
				if(1 <= d1 && d1 <= 31){
				count = m1 + m2 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 4:
				if(1 <= d1 && d1 <= 30){
				count = m1 + m2 + m3 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 5:
				if(1 <= d1 && d1 <= 31){
				count = m1 + m2 + m3 + m4 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 6:
				if(1 <= d1 && d1 <= 30){
				count = m1 + m2 + m3 + m4 + m5 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 7:
				if(1 <= d1 && d1 <= 31){
				count = m1 + m2 + m3 + m4 + m5 + m6 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 8:
				if(1 <= d1 && d1 <= 31){
				count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 9:
				if(1 <= d1 && d1 <= 30){
				count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 10:
				if(1 <= d1 && d1 <= 31){
				count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 11:
				if(1 <= d1 && d1 <= 30){
				count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break;
			case 12:
				if(1 <= d1 && d1 <= 31){
				count = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + d1;
				System.out.println("1月1日からの日数は" + count);
				}else
					System.out.println("入力エラーです");
				break; }
		}
		}else{
			System.out.println("月を１〜１２の間にしてください");
		}

	}

}
