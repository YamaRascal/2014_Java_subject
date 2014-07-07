/*
 * 2014/05/22
 * Ex056.java
 * 14cm0132
 * 山出　達也
 */

public class Ex056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={10,20,30,40,50};
		int[] num1 = new int[5];
		
		//System.out.println(num.length);
		
		for(int cnt =0; cnt<num.length;cnt++){
			num1[cnt] =num[num.length-cnt-1];
			System.out.println("num1[" + cnt + "]=" + num1[cnt]);
		}

	}

}
