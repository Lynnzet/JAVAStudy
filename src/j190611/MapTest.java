package j190611;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Student Ŭ����
//�й�, �̸�, ��ȭ��ȣ�� �޾ƿð��� ������
class Student{
	int number;
	String name;
	String phoneNum;
	
	public Student(int number, String name, String phoneNum) {
		this.number = number;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	//�̸��� �޴���ȭ��ȣ�� ��������
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
}

//Manager Ŭ���� + Menu Ŭ���� 
class StudentMenu {
	Scanner input = new Scanner(System.in);
	HashMap<Integer, Student> st = new HashMap<Integer, Student>();
	
	//�� ó�� �Է¹޴� �޴� ����
	public StudentMenu() {
		while(true) {
			System.out.println("<< �л� ���� ���� >>");
			System.out.println("[1] �л� ���� �Է�");
			System.out.println("[2] �л� ���� �˻�");
			System.out.print("���� : ");
			int select = input.nextInt();
			
			switch(select) {
				case 1 : inputMenu();
					break;
				case 2 : searchMenu();
					break;
			}
		}
	}
	
	//set Menu
	public void inputMenu() {
		int studnum;
		String studname, phoneNum;
		
		System.out.println("<< �л� ���� �Է� >>");
		System.out.print("�й� : ");
		studnum = input.nextInt();
		System.out.print("�̸� : ");
		studname = input.next();
		System.out.print("��ȭ��ȣ : ");
		phoneNum = input.next();
		
		//�������� ������� HashMap�� key���� Student �й�, �̸�, ��ȭ��ȣ�� Set
		st.put(studnum, new Student(studnum, studname, phoneNum));
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
	}
	
	//search Menu
	public void searchMenu() {
		int studnum;
		
		System.out.println("<< �л� ���� �˻� >>");
		System.out.print("�й� : ");
		studnum = input.nextInt();
		
		//HashMap �� �Է¹��� ���� ������ ��°�
		if(st.isEmpty() == true) {
			System.out.println("�ش� ������ ����.");
		}
		
		//HashMap ũ�⸸ŭ for���� �ݺ���Ŵ
		for(Map.Entry<Integer, Student> s : st.entrySet()) {
			//HashMap ���� Ű������ ������ ���� �й��� �������
			if(s.getKey() == studnum) {
				//���Ҵ� Ű��(�й�) �� �̸� ��ȭ��ȣ�� �������
				System.out.println("�̸� : " + s.getValue().getName());
				System.out.println("��ȭ��ȣ : " + s.getValue().getPhoneNum());
			} else {
				//�ƴҰ�� �ش� ��°� ���
				System.out.println("�ش� ������ ����.");
				//HashMap�� ���������ŭ �ݺ��ϱ⿡ break�� ��������.
				break;
			}
		}
	}
}
public class MapTest {

	public static void main(String[] args) {
		StudentMenu stmn = new StudentMenu();
	}
}
