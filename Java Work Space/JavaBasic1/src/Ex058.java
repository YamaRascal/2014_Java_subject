/*
 * 2014/05/22
 * Ex058.java
 * 14cm0132
 * 山出　達也
 */

public class Ex058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Fibonacci[] = new int[20];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		
		int len =  Fibonacci.length;

		for(int cnt=0;cnt<len-2;cnt++){
			Fibonacci[cnt+2]=Fibonacci[cnt] + Fibonacci[1+cnt];
		}
		for(int cnt=0;cnt<len;cnt++){
			System.out.println("Fibonacci数の"+ (cnt) + "番目は" + Fibonacci[cnt]);
		}
			/*	フィボナッチ数  
			 *  1番目　　1
				2番目　　1
				3番目　　2
				4番目　　3
				5番目　　5
				6番目　　8
				7番目　　13
				8番目　　21
				9番目　　34
				10番目　 55
				11番目　 89
				12番目　 144
				13番目　 233
				14番目　 377
				15番目　 610
				16番目　 987
				17番目  1597
				18番目  2584
				19番目  4181
			 * 
			 */
	}
}
