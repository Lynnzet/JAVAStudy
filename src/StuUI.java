import java.util.*;

class Student {
	int StudID;
	String Name;
	String Address;
	
	Student(int StudID,String Name, String Address){
		this.StudID = StudID;
		this.Name = Name;
		this.Address = Address;
	}
	Student( int StudID, String Name){
		this.StudID = StudID;
		this.Name = Name;
		this.Address = null;
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

class studmenu {
		//�Է� �޴� Scanner class keyboard
		public static Scanner keyboard = new Scanner(System.in);
		
		public static void showmenu() {
					System.out.println("�����ϼ���..");
					System.out.println("[1] �л� ���� �Է�");
					System.out.println("[2] �л� ���� �˻�");
					System.out.println("[3] �л� ���� ����");
					System.out.println("[4] ��ü���");
					System.out.println("[5] ����");
					System.out.println("���� : ");
		}
}

class StuManager {
		Student[] infoStorage = new Student[100];
		int studnum = 0;
		
		
		public void Input() {
			
			
			System.out.println("�л� ������ �Է��մϴ�.\n");

			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = studmenu.keyboard.next();
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			String address = studmenu.keyboard.next();
			
			infoStorage[studnum++] = new Student(studnum,name,address);
			
			System.out.print("����� �л� ��ȣ�� " + studnum + " �� �����Ǿ����ϴ�.");
			
			System.out.println("�л� �Է��� �Ϸ�Ǿ����ϴ�.");
			
		}
		public void Search() {
			System.out.println(studnum);
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
	

public class StuUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StuManager st = new StuManager();
		
		int choice;
		
		while (true) {
			studmenu.showmenu();
			
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
					st.PrintAll();
					break;
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					return;		
			}
			
			
		}
			
	}

}
