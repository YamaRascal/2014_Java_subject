/*
 * 2014/05/22
 * Ex065.java
 * 14cm0132
 * 山出　達也
 */

public class Ex065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] card = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

		int count = 0;
		while(true) {
			int n =(int)(Math.random()*52);
			//int n = (int)(Math.random()*52)+1;
			
				if(1<=n && n<=13){
					System.out.println("スペード" + card[n-1]);
					count++;
				}else if(14<=n && n<=26){
					System.out.println("ハート" + card[n-14]);
					count++;
				}else if(27<=n && n<=39){
					System.out.println("ダイヤ" + card[n-27]);
					count++;
				}else if(40<=n && n<=52){
					System.out.println("クラブ" + card[n-40]);
					count++;
				}

			if (count == 5) {
				break;
			}
		
	}

}
}