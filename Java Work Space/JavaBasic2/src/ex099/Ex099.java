package ex099;

public class Ex099 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Squeare sq1 = new Squeare();
		Squeare sq2 = new Squeare();
		
		sq1.setColor("red");
		sq1.setCX(200);
		sq1.setCY(200);
		sq1.setX(150);
		sq1.setY(250);
		sq1.setWidth(100);
		sq1.setHeight(100);
		
		sq2.setColor("blue");
		sq2.setCX(300);
		sq2.setCY(400);
		sq2.setX(200);
		sq2.setY(450);
		sq2.setWidth(200);
		sq2.setHeight(100);
		
		System.out.println(sq1.getColor()+"中心座標("+sq1.getCX()+","+sq1.getCY()+")左上座標("+sq1.getX()+","+sq1.getY()+")幅"+sq1.getWidth()+"高さ"+sq1.getHeigth());
		System.out.println(sq2.getColor()+"中心座標("+sq2.getCX()+","+sq2.getCY()+")左上座標("+sq2.getX()+","+sq2.getY()+")幅"+sq2.getWidth()+"高さ"+sq2.getHeigth());
		
	}

}

