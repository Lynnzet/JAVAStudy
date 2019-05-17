
public class PhoneBookVer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PhoneBookManager class를 manager라는 인스턴스로 생성함
		PhoneBookManager manager = new PhoneBookManager();
		
		int choice;
		
		
		while (true) {
			
			//메뉴뷰어 클레스에 showmenu메소드를 불러와 안에 값을 출력함
			MenuViewer.showMenu();
			//위에서 선언한 choice라는 변수를 선언한 곳에 유저가 선택한 메뉴의 값을 넣음
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			//choice로 메뉴마다 PhoneBookManager에서 선언했던 메소드들을 case로 구분해서 필요할때마다 불러옴
			//4를 입력시 무한 반복하는 while가 그만되게됨.
			
			switch(choice) {
				case 1:
					manager.inputDate();
					break;
				case 2:
					manager.serchData();
					break;
				case 3:
					manager.deleteData();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}

	}

}
