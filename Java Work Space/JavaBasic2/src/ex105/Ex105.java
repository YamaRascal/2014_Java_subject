package ex105;

public class Ex105 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CD c1 = new CD("ＨＥＡＲＴ","ＴＯＫＩＯ");
		CD c2 = new CD("Ｄ’ｓｌｏｖｅ","Ｄ－ＬＩＴＥ（ｆｒｏｍ　ＢＩＧＢＡＮＧ）");
		CD c3 = new CD("ＴＨＥ　ＢＥＳＴ“Ｂｌｕｅ","Ｋａｌａｆｉｎａ");
		CD c4 = new CD("ＴＨＥ　ＢＥＳＴ“Ｒｅｄ","Ｋａｌａｆｉｎａ");
		CD c5 = new CD("Ｄｒｉｖｉｎｇ　ｔｏ　ｔｈｅ　ｈｉｇｈｗａｙ","ＴＥＡＭ　Ｈ");
		
		
		RentalMenber m1 = new RentalMenber("山口としき","ありませんwww");
		m1.doRentalCD(c3);
		m1.doRentalCD(c4);
		showInfo(m1);
		
		
		RentalMenber m2 = new RentalMenber("ラ・コウリン","23456778rewe");
		m2.doRentalCD(c1);
		showInfo(m2);
	}
	static void showInfo(RentalMenber m){
		System.out.println(m.toString());
	}

}
