/*
 * 2014/06/05
 * Ex079.java
 * 14cm0132
 * 山出　達也
 */

package ex079;

public class Ex079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s1 = new Person();
		Person s2 = new Person();
		
		s1.name = "田中";
		s1.age = 15;
		s1.tel = "090-1234-5678";
		s1.adress = "新宿区百人町";
		
		s2.name = "山田";
		s2.age =20;
		s2.tel = "090-9876-4321";
		s2.adress = "港区六本木";
		
		s1.showInfo1();
		s1.showTel();
		s1.showAdress();
		//s1.void showInfo2()
		
		
		s2.showInfo1();
		s2.showTel();
		s2.showAdress();
		//s2.void showInfo2()
	}

}
