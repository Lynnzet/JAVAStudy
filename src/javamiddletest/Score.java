package javamiddletest;

import java.util.Scanner;

public class Score {
	int ScoreID;
	String ScoreName;
	int Studobj1;
	int Studobj2;
	int Studobj3;
	
	Score(int ScoreID, String ScoreName, int Studobj1,int Studobj2,int Studobj3){
		this.ScoreID = ScoreID;
		this.ScoreName = ScoreName;
		this.Studobj1 = Studobj1;
		this.Studobj2 = Studobj2;
		this.Studobj3 = Studobj3;
	}
	void ShowScoreinfo() {
		System.out.println("�̸� : " + ScoreName);
		System.out.println("�й� : " + ScoreID
				+ "\n===========================");
		System.out.println("���� : " + Studobj1);
		System.out.println("���� : " + Studobj2);
		System.out.println("���� : " + Studobj3);
	}
}

class scoremenu {
	
	public static Scanner keyboard = new Scanner(System.in);

	
	public static void showmenu() {
		ScoreManager sm = new ScoreManager();
		mainmenu mu = new mainmenu();
		while(true) {
		
		int choice;
		
		System.out.println("<< ���� ���� ����>>");
		System.out.println("[1] ���� �Է�");
		System.out.println("[2] ���� �˻�");
		System.out.println("[3] ���� ����");
		System.out.println("[4] ���� �޴��� ���ư���");
		System.out.print("���� : ");
		
		choice = scoremenu.keyboard.nextInt();
		scoremenu.keyboard.nextLine();

			switch(choice) {
				case 1 : sm.Input();
						 break;
				case 2 : sm.Search();
						 break;
				case 3 : sm.Delete();
						 break;
				case 4 : mu.showmenu();
						 break;
			}
		}
		
	}
}


class ScoreManager {
	
	Score[] infoScore = new Score[10];
	int scorenum = 0;
	
	public void Input() {
		
		for(int a = 0; a < infoScore.length; a++) {
			System.out.println((a+1) + " ��° �л� ������ �Է��մϴ�.");
			System.out.print("�й� : ");
			int StudID = scoremenu.keyboard.nextInt();
			System.out.print("�̸� : ");
			String Studname = scoremenu.keyboard.next();
			System.out.println("====================");
			System.out.print("���� : ");
			int Studobj1 = scoremenu.keyboard.nextInt();
			System.out.print("���� : ");
			int Studobj2 = scoremenu.keyboard.nextInt();
			System.out.print("���� : ");
			int Studobj3 = scoremenu.keyboard.nextInt();
			System.out.println(" ");
			infoScore[scorenum++] = new Score(StudID,Studname,Studobj1,Studobj2,Studobj3);
		}
		System.out.println("�л� �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	public void Search() {
		System.out.println("������ �˻��� �����մϴ�."
				+ "\n �й��� �Է� �ϼ���.");
		
		System.out.print("�й� : ");
		int ScoreID = scoremenu.keyboard.nextInt();
		
		int scinfo = scsearch(ScoreID);
		
		if(scinfo < 0) {
			System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�.");
		}else {
			infoScore[scinfo].ShowScoreinfo();
			System.out.println("�л� �˻簡 �Ϸ�Ǿ����ϴ�.");
		}
	}
	public void Delete() {
		System.out.println("������ ������ �����մϴ�."
				+ "\n�й��� �Է��ϼ���.");
		
		System.out.print("�л���ȣ : ");
		int ScoreID = scoremenu.keyboard.nextInt();
		
		int scoreidx = scsearch(ScoreID);
		
		if(ScoreID < 0) {
			System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�. \n");
		}else {
			for(int idx=scoreidx; idx<(scorenum-1); idx++)
				infoScore[idx] = infoScore[idx+1];
			
			scorenum--;
			System.out.println("�ش� �л� ������ �����߽��ϴ�.");
		}
		
		
	}
	
	
	private int scsearch(int ScoreID) {
		for(int idx=0; idx < scorenum; idx++) {
			Score scinfo = infoScore[idx];
			if((ScoreID == scinfo.ScoreID) == true)
				return idx;
		}
		return -1;
	}

}



