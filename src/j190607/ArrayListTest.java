package j190607;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		
		list.add("BREAD");
		list.add("BUTTER");
		//�ε��� 1�� "APPLE"�� ����
		list.add(1, "APPLE");
		//�ε��� 2�� ���Ҹ� "GRAPE"�� ��ü
		list.set(2, "GRAPE");
		//3�ε��� 3�� ���Ҹ� ����
		list.remove(3);
		
		//�ݺ���
		String s;
		Iterator e = list.iterator();
		
		while(e.hasNext()) {
			s=(String)e.next();
			System.out.println("�ݺ��� : " + s);
		}
		//�Ϲ� ���
		for(int i = 0; i < list.size(); i++) {
			System.out.println("�Ϲ� : " + list.get(i));
		}
	}
}
