package j190607;

import java.util.Iterator;
import java.util.LinkedList;
//필드
class Student {
	int stuNum;
	String name;
	String phNum;
	
	public Student(int stuNum, String name, String phNum) {
		this.stuNum = stuNum;
		this.name = name;
		this.phNum = phNum;
	}
}
//컨트롤
class StuCTRL {
	//LinkedList에(배열) Student 를 참조하여 list라는 이름의 새로운 인스턴스 생성
	LinkedList<Student> list = new LinkedList<Student>();
	
	//list에 새로운 값들을 받아와 새로운 인스턴스항목을 만들어줄(학생 개체 생성)
	public void AddStudent(int stuNum, String name, String phNum) {
		list.add(new Student(stuNum, name, phNum));
	}
	
	//학번으로 검색 메소드 
	public Student SearchByStudentNum(int stuNum) {
		//학생이 없음을 알려줄 변수
		Student retValue = null;
		
		//student 필드를 사용할 변수
		Student temp;
		//Iterator에 student 참조하여 e 라는 이름으로 Interator를(반복자) 만들어줌
		Iterator<Student> e = list.iterator();
		
		//list 크기만큼 반복
		while(e.hasNext()) {
			//temp 에 Student값을 받아옴
			temp = (Student)e.next();
			
			//만약 temp에서 stuNum과 이 메소드를 불러올때 받아온 매개변수 stuNum이 같을경우
			if(temp.stuNum == stuNum) {
				//retValue에 같았던 학생정보를 넣어줌
				retValue = temp;
				break;
			}
		}
	//위 while 문에서 만약 매개변수 정보와 list안 학생들의 정보가 같지 않을경우 바로 빠져나와 null 값을 그대로 리턴함
	return retValue;
	}
	//번호로 검색 멕소드
	//위 메소드와 동일함
	public Student SearchByStudentPhoneNum(String phNum) {
		Student retValue = null;
		
		Student temp2;
		Iterator<Student> e = list.iterator();
		
		while(e.hasNext()) {
			temp2 = (Student)e.next();
			
			if(temp2.phNum == phNum) {
				retValue = temp2;
				break;
			}
		}
	return retValue;
	}
}

//메인
public class stuUI {

	public static void main(String[] args) {
		
		//StuCTRL 정보들을 메인에서이용하기위해 CTRL 로 인스턴스 생성
		StuCTRL CTRL = new StuCTRL();
		
		//CTRL에 새로운 학생들 정보를 입력받음
		CTRL.AddStudent(160001, "조우종", "010-0000-0000");
		CTRL.AddStudent(160002, "박다설", "010-0000-1111");
		CTRL.AddStudent(160003, "이강문", "010-0000-2222");
		CTRL.AddStudent(160004, "백효정", "010-0000-3333");
		
		//학생번호로 return값을 받아올 변수
		Student temp;
		//번호로 return 값을 받아올 변수
		Student temp2;
		
		//CTRL에 SearchByStudentNum매소드에 매개변수 160003을 넘겨줫을때 이 학생번호와 같은 학생을 찾게됨
		temp = CTRL.SearchByStudentNum(160003);
		//CTRL에 SearchByStudentNum매소드에 매개변수 160003을 넘겨줫을때 이 번호와 같은 학생을 찾게됨
		temp2 = CTRL.SearchByStudentPhoneNum("010-0000-3333");
		
		//리턴받은 값이 null이 아닌 정보들이 들어있는 학생 객체가 있으면 그 정보를 가져와 학번, 이름, 번호를 출력함
		if(temp != null) {
			System.out.println("학번으로 찾았다.!!!  학번:" + temp.stuNum +"  이름: " + temp.name + "  번호: " + temp.phNum );
		} else {	//값이 null인 경우 (매개변수와 값이 일치하지 않아 return 값이 null 인 경우) 해당사항이없다고 출력
			System.out.println("해당 학번이 없습니다.");
		}
		//위 if문과 동일
		if(temp2 != null) {
			System.out.println("번호로 찾았다.!!!  학번:" + temp2.stuNum +"  이름: " + temp2.name + "  번호: " + temp2.phNum  );
		} else {
			System.out.println("해당 번호가 없습니다.");
		}

	}

}
