import java.util.*;

public class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;
		//이름,번호, 생일 다받앗을경우
		public PhoneInfo(String name, String num, String brith) {
			this.name=name;
			phoneNumber=num;
			this.birth=brith;
		}
		//이름, 번호만 받았을경우
		public PhoneInfo(String name, String num) {
			this.name=name;
			phoneNumber=num;
			this.birth=null;
		}
		//이름, 번호, 생일을 출력해주는 메소드
		public void ShowPhoneInfo() {
			System.out.println("name : " + name);
			System.out.println("phone : " + phoneNumber);
			if(birth!=null)
				System.out.println("brith : " + birth);
		}
		
}

class PhoneBookManager {
	
	final int MAX_CNT = 100;
	
	//Phone info 라는 정보를 가진 class 를 infoStorage라는 이름으로(배열) 참조시키고  (MAX_CNT) 100개를 만듬
	PhoneInfo [] infoStorage = new PhoneInfo[MAX_CNT];
	//
	int curCnt = 0;
		
	//데이터 입력을 받는 class
	public void inputDate() {
		System.out.println("데이터 입력을 시작합니다..");
		
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("생년월일 : ");
		String birth = MenuViewer.keyboard.nextLine();
		
		//infostorage 에 curCnt++ = 새로운 인스턴스 phoneinfo에 입력받은 이름, 전화번호, 생년월일을 넘겨줌 
		infoStorage[curCnt++] = new PhoneInfo(name, phone, birth);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	//데이터를 검색하는 class
	public void serchData() {
		System.out.println("데이터 검색을 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		// dataIdx에 search class에 입력받은 name을 보내고 리턴받은 값을 입력받음 
		int dataIdx=search(name);
		
		//리턴받은 값이 0보다 작을경우
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}
		//리턴받은 값이 0보다 클경우
		else {
			//infoStorage[serch 리턴값]번째의 값의 ShowPhoneInfo 데이터를 참조함
			infoStorage[dataIdx].ShowPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
	}
	
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		//dataIdx에 밑에서 정의한 search 메소드를 이용하여 이름 대조후 0이상의 양수 혹은 -1을 리턴받음
		int dataIdx = search(name);
		//search 에서 값을 찾지 못했을때 -1을 리턴해주는 것이므로 0이상이면 정보를 찾은것이고  -1일경우 이름을 찾지못한경우임
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			//idx에 리턴받은 위치를 저장 위치값이 입력받은 정보들 숫자 보다 커질때까지  idx를 증가시킴
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				//infoStorage[] (원래값에) = 그뒤에있는 배열의 값을 씌워 값을 지움 (지울값에서 뒤엣값을 한칸씩 당겨움)
				infoStorage[idx]=infoStorage[idx+1];
			//지운 정보의 갯수를 적용시키기위해 불러오면 1씩감소시킴
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
			
		}
	}
	
	
	private int search(String name) {
		//curCnt = 입력받은 정보 수
		for (int idx=0; idx < curCnt; idx++) {
			// idx가 0 부터 curCnt(회원수)만큼 반복하여 PhoneInfo라는 클래스로 curInfo 라는 인스턴슬를 생성하고 그곳에 infoStorage[idx] 라는 배열을 참조함
			PhoneInfo curInfo = infoStorage[idx];
		
		//매개변수로 입력받은 name과 위에 curInfo에 입력받은 인스턴스의 name 변수와 비교후 같은 값을 찾을경우 반복하며 찾은 for문에 idx값을 반환, 반복이없을경우 무조건 -1을 반환
		//compareTo는 두개의 문자열을 비교후 int 형으로 값을 반환시킴 (값이 0일경우 같음)
		if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
	
}

class MenuViewer {
	//입력 받는 Scanner class keyboard
	public static Scanner keyboard = new Scanner(System.in);
	
	//메뉴를 보여주는 메소드
	public  static void showMenu() {
		System.out.println("선택하세요..");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}
