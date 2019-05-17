package javamiddletest;

import java.util.*;

class Student {
	int StudID;
	String Name;
	String Address;
	String phonenum;
	
	Student(int StudID,String Name, String Address, String phonenum){
		this.StudID = StudID;
		this.Name = Name;
		this.Address = Address;
		this.phonenum = phonenum;
	}
	Student( int StudID, String Name, String Address){
		this.StudID = StudID;
		this.Name = Name;
		this.Address = Address;
		this.phonenum = null;
	}
	void ShowStudentinfo() {
		System.out.println("name : " + Name);
		System.out.println("StudID : " + StudID);
		if(Address!=null)
			System.out.println("Address : " + Address);
	}
	int getStudID() {
		return StudID;
	}
}

class mainmenu {
	public static void showmenu() {
		
		int select;
		
		
		while(true) {
		System.out.println("<< 메인 메뉴 >>");
		System.out.println("[1] 학생 정보 관리");
		System.out.println("[2] 성적 정보 관리");
		System.out.println("[3] 출력");
		System.out.println("[4] 종료");
		System.out.print("선택 : ");
		
		select = studmenu.keyboard.nextInt();
		
			switch(select) {
				case 1 : 
						studmenu.showmenu();
						break;
				case 2 : 
						scoremenu.showmenu();
						break;
				case 3 :
				case 4 : return;
				
			}
		}
	}
}

class studmenu {
		//입력 받는 Scanner class keyboard
		public static Scanner keyboard = new Scanner(System.in);
		
		public static void showmenu() {
			
			StuManager st = new StuManager();	
			
			while(true) {
					
					System.out.println("<< 학생정보 관리 >>");
					System.out.println("[1] 학생 정보 입력");
					System.out.println("[2] 학생 정보 검색");
					System.out.println("[3] 학생 정보 삭제");
					System.out.println("[4] 메인 메뉴로 돌아가기");
					System.out.println("선택 : ");
					
					int choice;
					
					
					
						choice = studmenu.keyboard.nextInt();
						studmenu.keyboard.nextLine();
						
						switch(choice) {
							case 1:
								st.Input();
								break;
							case 2:
								st.Search();
								break;
							case 3:
								st.Delete();
								break;
							case 4:
								
							default :
								System.out.println("잘못 누르셨습니다.");
						}
					}
		}
}



class StuManager {
		Student[] infoStorage = new Student[10];
		int studnum = 0;
		
		
		public void Input() {
			
			
			System.out.println((studnum+1) + "번째 학생에게 "+ (19000+studnum+1) + "학번을 부여합니다.");

			System.out.print("이름을 입력하세요 : ");
			String name = studmenu.keyboard.next();
			System.out.print("주소를 입력하세요 : ");
			String address = studmenu.keyboard.next();
			System.out.print("전화번호 : ");
			String phonenum = studmenu.keyboard.next();
			
			
			infoStorage[studnum++] = new Student(19000+studnum,name,address,phonenum);
			
			
			System.out.println("입력이 완료되었습니다.");
			
		}
		public void Search() {
			System.out.println("학생 검색을 시작합니다.");
			
			System.out.print("학생 번호 : ");
			int StudID = studmenu.keyboard.nextInt();
			
			int stinfo = stsearch(StudID);
			
			if(stinfo < 0) {
				System.out.println("해당하는 학생이 존재하지 않습니다.");
			}else {
				infoStorage[stinfo].ShowStudentinfo();
				System.out.println("학생 검사가 완료되었습니다.");
			}
		}
		public void Delete() {
			System.out.println("학생 정보 삭제를 시작합니다.");
			
			System.out.print("학생번호 : ");
			int StudID = studmenu.keyboard.nextInt();
			
			int studidx = stsearch(StudID);
			
			if(studidx < 0) {
				System.out.println("해당하는 학생이 존재하지 않습니다. \n");
			}else {
				for(int idx=studidx; idx<(studnum-1); idx++)
					infoStorage[idx] = infoStorage[idx+1];
				
				studnum--;
				System.out.println("학생 정보 삭제가 완료되었습니다.");
			}
			
			
		}
		public void PrintAll() {
			System.out.println("입력된 학생의 수는" + studnum + "명입니다. \n");
			
			for(int idx=0; idx < studnum; idx++) {
				System.out.println("\n"+ (idx+1) + "번째 학생 \n");
				infoStorage[idx].ShowStudentinfo();
			}
			
		}
		
		private int stsearch(int studID) {
			for(int idx=0; idx < studnum; idx++) {
				Student stinfo = infoStorage[idx];
				if((studID == stinfo.StudID) == true)
					return idx;
			}
			return -1;
		}
}
