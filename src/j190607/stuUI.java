package j190607;

import java.util.Iterator;
import java.util.LinkedList;
//�ʵ�
class Student {
	int stuNum;
	String name;
	String phNum;
	
	public Student(int stuNum, String name, String phNum) {
		this.stuNum = stuNum;
		this.name = name;
		this.phNum = phNum;
	}
}
//��Ʈ��
class StuCTRL {
	//LinkedList��(�迭) Student �� �����Ͽ� list��� �̸��� ���ο� �ν��Ͻ� ����
	LinkedList<Student> list = new LinkedList<Student>();
	
	//list�� ���ο� ������ �޾ƿ� ���ο� �ν��Ͻ��׸��� �������(�л� ��ü ����)
	public void AddStudent(int stuNum, String name, String phNum) {
		list.add(new Student(stuNum, name, phNum));
	}
	
	//�й����� �˻� �޼ҵ� 
	public Student SearchByStudentNum(int stuNum) {
		//�л��� ������ �˷��� ����
		Student retValue = null;
		
		//student �ʵ带 ����� ����
		Student temp;
		//Iterator�� student �����Ͽ� e ��� �̸����� Interator��(�ݺ���) �������
		Iterator<Student> e = list.iterator();
		
		//list ũ�⸸ŭ �ݺ�
		while(e.hasNext()) {
			//temp �� Student���� �޾ƿ�
			temp = (Student)e.next();
			
			//���� temp���� stuNum�� �� �޼ҵ带 �ҷ��ö� �޾ƿ� �Ű����� stuNum�� �������
			if(temp.stuNum == stuNum) {
				//retValue�� ���Ҵ� �л������� �־���
				retValue = temp;
				break;
			}
		}
	//�� while ������ ���� �Ű����� ������ list�� �л����� ������ ���� ������� �ٷ� �������� null ���� �״�� ������
	return retValue;
	}
	//��ȣ�� �˻� �߼ҵ�
	//�� �޼ҵ�� ������
	public Student SearchByStudentPhoneNum(String phNum) {
		Student retValue = null;
		
		Student temp2;
		Iterator<Student> e = list.iterator();
		
		while(e.hasNext()) {
			temp2 = (Student)e.next();
			
			if(temp2.phNum == phNum) {
				retValue = temp2;
				break;
			}
		}
	return retValue;
	}
}

//����
public class stuUI {

	public static void main(String[] args) {
		
		//StuCTRL �������� ���ο����̿��ϱ����� CTRL �� �ν��Ͻ� ����
		StuCTRL CTRL = new StuCTRL();
		
		//CTRL�� ���ο� �л��� ������ �Է¹���
		CTRL.AddStudent(160001, "������", "010-0000-0000");
		CTRL.AddStudent(160002, "�ڴټ�", "010-0000-1111");
		CTRL.AddStudent(160003, "�̰���", "010-0000-2222");
		CTRL.AddStudent(160004, "��ȿ��", "010-0000-3333");
		
		//�л���ȣ�� return���� �޾ƿ� ����
		Student temp;
		//��ȣ�� return ���� �޾ƿ� ����
		Student temp2;
		
		//CTRL�� SearchByStudentNum�żҵ忡 �Ű����� 160003�� �ѰܢZ���� �� �л���ȣ�� ���� �л��� ã�Ե�
		temp = CTRL.SearchByStudentNum(160003);
		//CTRL�� SearchByStudentNum�żҵ忡 �Ű����� 160003�� �ѰܢZ���� �� ��ȣ�� ���� �л��� ã�Ե�
		temp2 = CTRL.SearchByStudentPhoneNum("010-0000-3333");
		
		//���Ϲ��� ���� null�� �ƴ� �������� ����ִ� �л� ��ü�� ������ �� ������ ������ �й�, �̸�, ��ȣ�� �����
		if(temp != null) {
			System.out.println("�й����� ã�Ҵ�.!!!  �й�:" + temp.stuNum +"  �̸�: " + temp.name + "  ��ȣ: " + temp.phNum );
		} else {	//���� null�� ��� (�Ű������� ���� ��ġ���� �ʾ� return ���� null �� ���) �ش�����̾��ٰ� ���
			System.out.println("�ش� �й��� �����ϴ�.");
		}
		//�� if���� ����
		if(temp2 != null) {
			System.out.println("��ȣ�� ã�Ҵ�.!!!  �й�:" + temp2.stuNum +"  �̸�: " + temp2.name + "  ��ȣ: " + temp2.phNum  );
		} else {
			System.out.println("�ش� ��ȣ�� �����ϴ�.");
		}

	}

}
