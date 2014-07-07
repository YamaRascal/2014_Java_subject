/*練習・・・ネット参照
虫食いパズル　2桁×2桁 

　  　□１
　✖　□□
–––––––––
　　□□□
　□□□
−−−−−−−−−
９□□□

だった場合の回答を導く
 */
public class Mushikui_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 出力情報 */
		int A, B;    /* 1段目と2段目の数 */
		int cnt = 0;     /* 解の個数         */
		/* パズル問題を解く */

		int a, b, c, d, e;

		for (a=10; a <= 99; a++) {          /* 1段目の数を生成 */
			for (b=10; b <= 99; b++) {      /* 2段目    〃     */

				c = a * (b % 10);         /* 3段目の数を計算 */
				d = a * (b / 10);         /* 4段目    〃     */
				e = a *  b;               /* 5段目    〃     */

				/* 各数字の桁数をチェック */
				if (c >= 100  && c <= 999 &&
						d >= 100  && d <= 999 &&
						e >= 1000 && e <= 9999) {

					/* dの2桁目が4で,eの3桁目が3か? */
					if (sub(a,1)==1 && sub(e,4)==9) {   /* 例題1の場合は if (sub(a,1)==1 && sub(e,4)==9) とする */
						A = a;  B = b;     /* 解の記録 */
						cnt++;             /* 解の個数 */
						System.out.println("  "+A);
						System.out.println("  "+B + "\n_____");
						System.out.println(" " + c);
						System.out.println(d+ " \n_________");
						System.out.println(e);
						System.out.println(cnt);
					}
				}
			}
		}
	}

	/* 10進数nのm桁目の数を返すサブルーチン */
	static int sub(int n, int m) {
		int i;

		/* nをm-1回,10で割る */
		for (i=1; i < m; i++)
			n /= 10;

		/* 10で割った余りを返す */
		return n % 10;
	}}
