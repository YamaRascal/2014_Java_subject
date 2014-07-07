/*
 * 2014/05/15
 * Ex050.java
 * 14cm0132
 * 山出　達也
 */

public class Ex050 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0; 							//元の数
		
			for(int cnt=1;cnt<101;cnt++){		//1~100までループ
				num1=num1+cnt;					
				if(cnt<100){
					continue;					//100になるまで出力せず戻す
				}
				System.out.println("1から100までの数の合計は" + num1);
			}
	}
	
}
