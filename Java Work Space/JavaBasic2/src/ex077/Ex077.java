/*
 * 2014/06/05
 * Ex077.java
 * 14cm0132
 * 山出　達也
 */

package ex077;

public class Ex077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s1 = new Person();
		Person s2 = new Person();
		
		s1.name = "田中";
		s1.age = 15;
		s2.name = "山田";
		s2.age =20;
		
		System.out.println(s1.name + "さんの年齢は" + s1.age + "です");
		System.out.println(s2.name + "さんの年齢は" + s2.age + "です");
	}

}
