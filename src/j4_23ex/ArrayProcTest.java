package j4_23ex;
import java.util.*;

class ArrayProc {
	
	//성적을 입력받는 클래스
	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		
		//매개변수로 입력받은 array 배열의 크기만큼 성적을 반복적으로 입력받음
		for( int i=0; i <array.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			array[i] = scan.nextInt();
		}
	}
	// 받아온 인스턴스의 배열을 for문으로 반복적으로 total에 값을 받아와 array의 크기만큼 나누어 평균을 구함
	public double getAverage(int[] array) {
		double total = 0;
		for (int i=0; i<array.length; i++)
			total += array[i];
		return total / array.length;
	}
}

public class ArrayProcTest {
	final static int STUDENTS = 5;

	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		
		//위 만들어준 STUDENNTS 크기의 배열에 getValues에 매개변수(배열)을 참조해 넘겨주고 class에 내용이 출력됨
		obj.getValues(scores);
		//마찬가지로 getAverage라는 클래스에서 scores에 입력받은 값들의 평균을 return 해준 값을 출력해줌
		System.out.println("평균은 = " + obj.getAverage(scores));
	}

}
