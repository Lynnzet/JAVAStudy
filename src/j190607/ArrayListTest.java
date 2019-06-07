package j190607;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		
		list.add("BREAD");
		list.add("BUTTER");
		//인덱스 1에 "APPLE"을 삽입
		list.add(1, "APPLE");
		//인덱스 2의 원소를 "GRAPE"로 대체
		list.set(2, "GRAPE");
		//3인덱스 3의 원소를 삭제
		list.remove(3);
		
		//반복자
		String s;
		Iterator e = list.iterator();
		
		while(e.hasNext()) {
			s=(String)e.next();
			System.out.println("반복자 : " + s);
		}
		//일반 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println("일반 : " + list.get(i));
		}
	}
}
