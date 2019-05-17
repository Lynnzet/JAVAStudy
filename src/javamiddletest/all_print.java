package javamiddletest;

class all_print {
	
	Student[] PutinfoStorage = new Student[10];
	Score[] PutinfoScore = new Score[10];
	int num = 0;
	
	
	void getScore(Student infoStorage) {
		PutinfoStorage[num++] = infoStorage;
		
	}
	void getStudent(Score infoScore) {
		PutinfoScore[num++] = infoScore;
	}
	
}
