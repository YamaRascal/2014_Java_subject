/*webシステム科の友人と
 *今の時点での力で
 * どうすれば素数判定を短く書けるか競った僕の答えです
 * 2014/05/29
 * Ex072_01.java
 * 14cm0132
 * 山出　達也
 */

public class Ex072_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int serch =100000;					//調べたい数
		int [] prime = new int[100000];		//定義する素数の数
		prime[0]=2;
		prime[1]=3;
		int primeCount = 2;		

		for(int i1=4;i1<=serch;i1++){		//調べたい数までのカウント
			if(i1>2&&i1%2==0){				//2の倍数除外
				continue;
			}else{
				for(int i2=0;i2<primeCount;i2++){
					if(i1%prime[i2]==0){		//今までに出た素数で割り切れたら素数ではない
						break;
					}
					if(i2==primeCount-1){		//今までに出た素数で割れなかったのでその数は素数　配列に格納
						primeCount++;
						prime[primeCount-1]=i1;
					}
				}
			}
		}
		for(int i=0;i<primeCount;i++){
			System.out.println("素数は >" + prime[i]);
		}
	}

}
