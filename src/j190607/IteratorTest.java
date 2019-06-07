package j190607;

import java.util.Iterator;
import java.util.LinkedList;

class Student1 {
	int stuNum;
	String name;
	
	public Student1(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}
}
public class IteratorTest {

	public static void main(String[] args) {
		
		LinkedList<Student1> list = new LinkedList<Student1>();
		
		list.add(new Student1(160001, "������"));
		list.add(new Student1(160002, "�ڴټ�"));
		list.add(new Student1(160003, "�̰���"));
		list.add(new Student1(160004, "��ȿ��"));
		
		int toFind = 160003;
		Student1 temp;
		Iterator<Student1> e = list.iterator();
		
		while(e.hasNext()) {
			temp = (Student1)e.next();
			System.out.println("ã�Ҵ�! " + "�й�:" + temp.stuNum + "  �̸�:" + temp.name);
			break;
		}
	}
}
