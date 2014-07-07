/*
 * 2014/06/05
 * Ex080.java
 * 14cm0132
 * 山出　達也
 */

package ex080;

public class Ex080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s1 = new Person();
		Person s2 = new Person();
		
		s1.setName("田中");
		s1.setAge(15);
		s1.setTel("090-1234-56782");
		s1.setAdress("新宿区百人町");
		/////////////////////////////
		s2.setName("山田");
		s2.setAge(20);
		s2.setTel("090-9876-4321");
		s2.setAdress("港区六本木");
		
		////////////////////////////
		s1.printDate();
		s2.printDate();
	}

}
