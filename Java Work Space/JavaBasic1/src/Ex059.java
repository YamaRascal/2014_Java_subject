/*
 * 2014/05/22
 * Ex059.java
 * 14cm0132
 * 山出　達也
 */

public class Ex059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Fibonacci[] = new double[1000];		//とりあえず1000個用意しました
		
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
				
		
		for(int cnt=0;cnt<Fibonacci.length-2;cnt++){
			Fibonacci[cnt+2]=Fibonacci[0+cnt] + Fibonacci[1+cnt];
			System.out.println("Fibonacci数"+ Fibonacci[cnt+1] + "と" + Fibonacci[cnt+2] 
					+ "の比は1:" + ( Fibonacci[cnt+2] / Fibonacci[cnt+1] ));
		}

	}

}
