/*
 * 2014/05/22
 * Ex064.java
 * 14cm0132
 * 山出　達也
 */

public class Ex064_salan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[52];

		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		int count = 0;

		while(true) {
			int n = (int)(Math.random()*52);
			if (num[n] >= 0) {
				System.out.println(num[n]);

				num[n] *= -1;	//一度書いたデータはーにしてif文に入らないようにする
				count++;
			}

			if (count == 5) {
				break;
			}
		}

	}

}
