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
		System.out.println("이름 : " + ScoreName);
		System.out.println("학번 : " + ScoreID
				+ "\n===========================");
		System.out.println("국어 : " + Studobj1);
		System.out.println("영어 : " + Studobj2);
		System.out.println("수학 : " + Studobj3);
	}
}

class scoremenu {
	
	public static Scanner keyboard = new Scanner(System.in);

	
	public static void showmenu() {
		ScoreManager sm = new ScoreManager();
		mainmenu mu = new mainmenu();
		while(true) {
		
		int choice;
		
		System.out.println("<< 성적 정보 관리>>");
		System.out.println("[1] 성적 입력");
		System.out.println("[2] 성적 검색");
		System.out.println("[3] 성적 삭제");
		System.out.println("[4] 메인 메뉴로 돌아가기");
		System.out.print("선택 : ");
		
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
			System.out.println((a+1) + " 번째 학생 성적을 입력합니다.");
			System.out.print("학번 : ");
			int StudID = scoremenu.keyboard.nextInt();
			System.out.print("이름 : ");
			String Studname = scoremenu.keyboard.next();
			System.out.println("====================");
			System.out.print("국어 : ");
			int Studobj1 = scoremenu.keyboard.nextInt();
			System.out.print("영어 : ");
			int Studobj2 = scoremenu.keyboard.nextInt();
			System.out.print("수학 : ");
			int Studobj3 = scoremenu.keyboard.nextInt();
			System.out.println(" ");
			infoScore[scorenum++] = new Score(StudID,Studname,Studobj1,Studobj2,Studobj3);
		}
		System.out.println("학생 입력이 완료되었습니다.");
	}
	public void Search() {
		System.out.println("데이터 검색을 시작합니다."
				+ "\n 학번을 입력 하세요.");
		
		System.out.print("학번 : ");
		int ScoreID = scoremenu.keyboard.nextInt();
		
		int scinfo = scsearch(ScoreID);
		
		if(scinfo < 0) {
			System.out.println("해당하는 학생이 존재하지 않습니다.");
		}else {
			infoScore[scinfo].ShowScoreinfo();
			System.out.println("학생 검사가 완료되었습니다.");
		}
	}
	public void Delete() {
		System.out.println("데이터 삭제를 시작합니다."
				+ "\n학번을 입력하세요.");
		
		System.out.print("학생번호 : ");
		int ScoreID = scoremenu.keyboard.nextInt();
		
		int scoreidx = scsearch(ScoreID);
		
		if(ScoreID < 0) {
			System.out.println("해당하는 학생이 존재하지 않습니다. \n");
		}else {
			for(int idx=scoreidx; idx<(scorenum-1); idx++)
				infoScore[idx] = infoScore[idx+1];
			
			scorenum--;
			System.out.println("해당 학생 정보를 삭제했습니다.");
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



