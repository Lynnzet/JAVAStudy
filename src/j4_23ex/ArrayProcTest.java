package j4_23ex;
import java.util.*;

class ArrayProc {
	
	//������ �Է¹޴� Ŭ����
	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		
		//�Ű������� �Է¹��� array �迭�� ũ�⸸ŭ ������ �ݺ������� �Է¹���
		for( int i=0; i <array.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			array[i] = scan.nextInt();
		}
	}
	// �޾ƿ� �ν��Ͻ��� �迭�� for������ �ݺ������� total�� ���� �޾ƿ� array�� ũ�⸸ŭ ������ ����� ����
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
		
		//�� ������� STUDENNTS ũ���� �迭�� getValues�� �Ű�����(�迭)�� ������ �Ѱ��ְ� class�� ������ ��µ�
		obj.getValues(scores);
		//���������� getAverage��� Ŭ�������� scores�� �Է¹��� ������ ����� return ���� ���� �������
		System.out.println("����� = " + obj.getAverage(scores));
	}

}
