/*
 * 2014/05/22
 * Ex053.java
 * 14cm0132
 * 山出　達也
 */

public class Ex053 {

	public static void main(String[] args) {

		int num[] = new int[10];
		int num2[] = new int[10];

		for(int cnt=0;cnt<10;cnt++){
			num[cnt]=cnt+1;
		}

		for( int i=0; i<num.length; i++ ) {
			num2[i] = num[num.length-1-i];
		}

		for(int i=0;i<num2.length;i++){
			System.out.println("num2[" + (i) + "] =" + num2[i]);
		}
	}
}
