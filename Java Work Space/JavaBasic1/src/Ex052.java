/*
 * 2014/05/22
 * Ex052.java
 * 14cm0132
 * 山出　達也
 */

public class Ex052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[];
		num = new int[10];
		
		for(int cnt=1;cnt<11;cnt++){
			num[cnt-1] = cnt;
		}
		
		for(int a:num){
			System.out.println("num["+ (a-1) + "] =" + a);
		}
		
		System.out.println("\n\n");
		
		for(int i=0;i<num.length;i++){
			System.out.println("num["+ (i) + "] =" + num[i]);
		}
			
		
		
		

	}

}
