package j190611;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Student 클래스
//학번, 이름, 전화번호를 받아올것을 정의함
class Student{
	int number;
	String name;
	String phoneNum;
	
	public Student(int number, String name, String phoneNum) {
		this.number = number;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	//이름과 휴대전화번호를 리턴해줌
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
}

//Manager 클래스 + Menu 클래스 
class StudentMenu {
	Scanner input = new Scanner(System.in);
	HashMap<Integer, Student> st = new HashMap<Integer, Student>();
	
	//멘 처음 입력받는 메뉴 생성
	public StudentMenu() {
		while(true) {
			System.out.println("<< 학생 정보 관리 >>");
			System.out.println("[1] 학생 정보 입력");
			System.out.println("[2] 학생 정보 검색");
			System.out.print("선택 : ");
			int select = input.nextInt();
			
			switch(select) {
				case 1 : inputMenu();
					break;
				case 2 : searchMenu();
					break;
			}
		}
	}
	
	//set Menu
	public void inputMenu() {
		int studnum;
		String studname, phoneNum;
		
		System.out.println("<< 학생 정보 입력 >>");
		System.out.print("학번 : ");
		studnum = input.nextInt();
		System.out.print("이름 : ");
		studname = input.next();
		System.out.print("전화번호 : ");
		phoneNum = input.next();
		
		//전역으로 만들어준 HashMap에 key값과 Student 학번, 이름, 전화번호를 Set
		st.put(studnum, new Student(studnum, studname, phoneNum));
		System.out.println("입력이 완료 되었습니다.");
	}
	
	//search Menu
	public void searchMenu() {
		int studnum;
		
		System.out.println("<< 학생 정보 검색 >>");
		System.out.print("학번 : ");
		studnum = input.nextInt();
		
		//HashMap 에 입력받은 값이 없을시 출력값
		if(st.isEmpty() == true) {
			System.out.println("해당 데이터 없음.");
		}
		
		//HashMap 크기만큼 for문을 반복시킴
		for(Map.Entry<Integer, Student> s : st.entrySet()) {
			//HashMap 에서 키값으로 정해준 값과 학번이 같을경우
			if(s.getKey() == studnum) {
				//같았던 키값(학번) 의 이름 전화번호를 출력해줌
				System.out.println("이름 : " + s.getValue().getName());
				System.out.println("전화번호 : " + s.getValue().getPhoneNum());
			} else {
				//아닐경우 해당 출력값 출력
				System.out.println("해당 데이터 없음.");
				//HashMap에 만들어진만큼 반복하기에 break로 빠져나옴.
				break;
			}
		}
	}
}
public class MapTest {

	public static void main(String[] args) {
		StudentMenu stmn = new StudentMenu();
	}
}
