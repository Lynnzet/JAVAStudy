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
		System.out.println("<< ���� �޴� >>");
		System.out.println("[1] �л� ���� ����");
		System.out.println("[2] ���� ���� ����");
		System.out.println("[3] ���");
		System.out.println("[4] ����");
		System.out.print("���� : ");
		
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
		//�Է� �޴� Scanner class keyboard
		public static Scanner keyboard = new Scanner(System.in);
		
		public static void showmenu() {
			
			StuManager st = new StuManager();	
			
			while(true) {
					
					System.out.println("<< �л����� ���� >>");
					System.out.println("[1] �л� ���� �Է�");
					System.out.println("[2] �л� ���� �˻�");
					System.out.println("[3] �л� ���� ����");
					System.out.println("[4] ���� �޴��� ���ư���");
					System.out.println("���� : ");
					
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
								System.out.println("�߸� �����̽��ϴ�.");
						}
					}
		}
}



class StuManager {
		Student[] infoStorage = new Student[10];
		int studnum = 0;
		
		
		public void Input() {
			
			
			System.out.println((studnum+1) + "��° �л����� "+ (19000+studnum+1) + "�й��� �ο��մϴ�.");

			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = studmenu.keyboard.next();
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			String address = studmenu.keyboard.next();
			System.out.print("��ȭ��ȣ : ");
			String phonenum = studmenu.keyboard.next();
			
			
			infoStorage[studnum++] = new Student(19000+studnum,name,address,phonenum);
			
			
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			
		}
		public void Search() {
			System.out.println("�л� �˻��� �����մϴ�.");
			
			System.out.print("�л� ��ȣ : ");
			int StudID = studmenu.keyboard.nextInt();
			
			int stinfo = stsearch(StudID);
			
			if(stinfo < 0) {
				System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�.");
			}else {
				infoStorage[stinfo].ShowStudentinfo();
				System.out.println("�л� �˻簡 �Ϸ�Ǿ����ϴ�.");
			}
		}
		public void Delete() {
			System.out.println("�л� ���� ������ �����մϴ�.");
			
			System.out.print("�л���ȣ : ");
			int StudID = studmenu.keyboard.nextInt();
			
			int studidx = stsearch(StudID);
			
			if(studidx < 0) {
				System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�. \n");
			}else {
				for(int idx=studidx; idx<(studnum-1); idx++)
					infoStorage[idx] = infoStorage[idx+1];
				
				studnum--;
				System.out.println("�л� ���� ������ �Ϸ�Ǿ����ϴ�.");
			}
			
			
		}
		public void PrintAll() {
			System.out.println("�Էµ� �л��� ����" + studnum + "���Դϴ�. \n");
			
			for(int idx=0; idx < studnum; idx++) {
				System.out.println("\n"+ (idx+1) + "��° �л� \n");
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
