/*
 * 2014/05/22
 * Ex063.java
 * 14cm0132
 * 山出　達也
 */

public class Ex063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[52];
		
		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		for(int i=0;i<5;i++){
			System.out.println(num[(int)(Math.random()*52)]);
		}
	}

}
