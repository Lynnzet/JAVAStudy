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
		
		list.add(new Student1(160001, "조우종"));
		list.add(new Student1(160002, "박다설"));
		list.add(new Student1(160003, "이강문"));
		list.add(new Student1(160004, "백효정"));
		
		int toFind = 160003;
		Student1 temp;
		Iterator<Student1> e = list.iterator();
		
		while(e.hasNext()) {
			temp = (Student1)e.next();
			System.out.println("찾았다! " + "학번:" + temp.stuNum + "  이름:" + temp.name);
			break;
		}
	}
}
