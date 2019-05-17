import java.util.*;

public class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;
		//�̸�,��ȣ, ���� �ٹ޾������
		public PhoneInfo(String name, String num, String brith) {
			this.name=name;
			phoneNumber=num;
			this.birth=brith;
		}
		//�̸�, ��ȣ�� �޾������
		public PhoneInfo(String name, String num) {
			this.name=name;
			phoneNumber=num;
			this.birth=null;
		}
		//�̸�, ��ȣ, ������ ������ִ� �޼ҵ�
		public void ShowPhoneInfo() {
			System.out.println("name : " + name);
			System.out.println("phone : " + phoneNumber);
			if(birth!=null)
				System.out.println("brith : " + birth);
		}
		
}

class PhoneBookManager {
	
	final int MAX_CNT = 100;
	
	//Phone info ��� ������ ���� class �� infoStorage��� �̸�����(�迭) ������Ű��  (MAX_CNT) 100���� ����
	PhoneInfo [] infoStorage = new PhoneInfo[MAX_CNT];
	//
	int curCnt = 0;
		
	//������ �Է��� �޴� class
	public void inputDate() {
		System.out.println("������ �Է��� �����մϴ�..");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("������� : ");
		String birth = MenuViewer.keyboard.nextLine();
		
		//infostorage �� curCnt++ = ���ο� �ν��Ͻ� phoneinfo�� �Է¹��� �̸�, ��ȭ��ȣ, ��������� �Ѱ��� 
		infoStorage[curCnt++] = new PhoneInfo(name, phone, birth);
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	//�����͸� �˻��ϴ� class
	public void serchData() {
		System.out.println("������ �˻��� �����մϴ�.");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		// dataIdx�� search class�� �Է¹��� name�� ������ ���Ϲ��� ���� �Է¹��� 
		int dataIdx=search(name);
		
		//���Ϲ��� ���� 0���� �������
		if(dataIdx < 0) {
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}
		//���Ϲ��� ���� 0���� Ŭ���
		else {
			//infoStorage[serch ���ϰ�]��°�� ���� ShowPhoneInfo �����͸� ������
			infoStorage[dataIdx].ShowPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	public void deleteData() {
		System.out.println("������ ������ �����մϴ�.");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		//dataIdx�� �ؿ��� ������ search �޼ҵ带 �̿��Ͽ� �̸� ������ 0�̻��� ��� Ȥ�� -1�� ���Ϲ���
		int dataIdx = search(name);
		//search ���� ���� ã�� �������� -1�� �������ִ� ���̹Ƿ� 0�̻��̸� ������ ã�����̰�  -1�ϰ�� �̸��� ã�����Ѱ����
		if(dataIdx < 0) {
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		} else {
			//idx�� ���Ϲ��� ��ġ�� ���� ��ġ���� �Է¹��� ������ ���� ���� Ŀ��������  idx�� ������Ŵ
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				//infoStorage[] (��������) = �׵ڿ��ִ� �迭�� ���� ���� ���� ���� (���ﰪ���� �ڿ����� ��ĭ�� ��ܿ�)
				infoStorage[idx]=infoStorage[idx+1];
			//���� ������ ������ �����Ű������ �ҷ����� 1�����ҽ�Ŵ
			curCnt--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
			
		}
	}
	
	
	private int search(String name) {
		//curCnt = �Է¹��� ���� ��
		for (int idx=0; idx < curCnt; idx++) {
			// idx�� 0 ���� curCnt(ȸ����)��ŭ �ݺ��Ͽ� PhoneInfo��� Ŭ������ curInfo ��� �ν��Ͻ��� �����ϰ� �װ��� infoStorage[idx] ��� �迭�� ������
			PhoneInfo curInfo = infoStorage[idx];
		
		//�Ű������� �Է¹��� name�� ���� curInfo�� �Է¹��� �ν��Ͻ��� name ������ ���� ���� ���� ã����� �ݺ��ϸ� ã�� for���� idx���� ��ȯ, �ݺ��̾������ ������ -1�� ��ȯ
		//compareTo�� �ΰ��� ���ڿ��� ���� int ������ ���� ��ȯ��Ŵ (���� 0�ϰ�� ����)
		if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
	
}

class MenuViewer {
	//�Է� �޴� Scanner class keyboard
	public static Scanner keyboard = new Scanner(System.in);
	
	//�޴��� �����ִ� �޼ҵ�
	public  static void showMenu() {
		System.out.println("�����ϼ���..");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� : ");
	}
}
