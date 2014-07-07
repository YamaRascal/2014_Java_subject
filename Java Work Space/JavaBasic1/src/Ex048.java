/*
 * 2014/05/15-16
 * Ex048.java
 * 14cm0132
 * 山出　達也
 */
public class Ex048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int cnt=1;cnt<6;cnt++){
			for(int cnt2=0;cnt2<cnt;cnt2++);{
				System.out.println("＊");
				*/
		int lim;
		lim = 5; //ループ回数		
		
		
		//＊が1つから増えて行くループ
		for(int cnt1=0;cnt1<lim;cnt1++){		
			for(int cnt2=-1;cnt2<cnt1;cnt2++){
				System.out.print("＊");
			}
		System.out.println();
		}
		
		//////////////////////////////////////////////////次の文との空白
		System.out.println();
		
		
		//＊が５つから減って行くループ
		for(int cnt1=lim;cnt1>0;cnt1--){
			for(int cnt2=0;cnt2<cnt1;cnt2++){
				System.out.print("＊");
			}
		System.out.println();
		}
		/////////////////////////////////////////////////次の文との空白
		System.out.println();
		
		
		//空白と＊を決めた個数並べるループ
		for(int cnt1 =0;cnt1<lim;cnt1++){
		//ループ１・・・空白を表示する	
				for(int cnt2=4;cnt2>cnt1;cnt2--){
					System.out.print("　");	
				}
				//////////////////////////////////////////奇数分表示
				//cnt2を1ずらすことで描画する数を奇数に
				for(int cnt2=0;cnt2<=cnt1;cnt2++){
					System.out.print("＊");					
				}
				
				for(int cnt2=1;cnt2<=cnt1;cnt2++){
					System.out.print("＊");					
				}
				
				//////////////////////////////////////
				for(int cnt2=4;cnt2>cnt1;cnt2--){
					System.out.print("　");
				}
				System.out.println("");
			}

		}
}



