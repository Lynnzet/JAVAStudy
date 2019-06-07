package j190607;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// Vector 클래스는 java.util 패키지에 있는 컬렉션의 일종으로 가변 크기의 배열(dynamic array)을 구현하고 있다. 
			Vector vc = new Vector();
			vc.add("Hello World!");
			vc.add(new Integer(10));
			vc.add(20);
			System.out.println("vector size : " + vc.size());
			for(int i = 0; i < vc.size(); i++) {
				System.out.println("vector element " + i + " : " + vc.get(i));
			}
			String s =(String)vc.get(0);
			System.out.println(s);
	}
}
