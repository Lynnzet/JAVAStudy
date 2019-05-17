
import java.util.Scanner;


class Friend 
{
	//ó�� Friend ��ü �Ӽ� ����
	String name;
	String phoneNum;
	String addr;
	
	//Friend set
	public Friend(String name, String phone, String addr)
	{
		this.name=name;
		this.phoneNum=phone;
		this.addr=addr;
	}
	
	//Friend ��¿� (get)
	public void showData()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
		System.out.println("�ּ� : "+addr);
	}
	//�������̵��� �� Ŭ���� ����
	public void showBasicInfo(){}
}

//����б� ģ��
//�Ӽ��� ���� Friend Ŭ������ ��� �ް�����
class HighFriend extends Friend		// ����â
{
	//�߰��� ������ �޾ƿ� ����
	String work;
	
	//Friend���� ������ �޾ƿ� ������ + ������ �޾ƿ�
	public HighFriend(String name, String phone, String addr, String job)
	{
		//�θ� �ִ� ������ ȣ���ϱ����ؼ� ���
		super(name, phone, addr);
		work=job;		
	}
	
	//ģ�� showData + �������� ����ϱ����� �������̵�
	public void showData()
	{
		super.showData();
		System.out.println("���� : "+work);
	}
	
	//@override HighFriend.showBasicInfo()�� ��µǴ� ����
	public void showBasicInfo()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
	}
}

	//���� ģ�� �Է��� ���� Ŭ����
	//���� ���������� Friend Ŭ������ ��� �ް�����
class UnivFriend extends Friend 	// ���е���
{
	//�߰��� �����а��Է��� ���� ���� ����
	String major;		// �����а�
	
	public UnivFriend(String name, String phone, String addr, String major)
	{
		//Friend ������ ����ϱ� ���� super
		super(name, phone, addr);
		//�߰� �����а��� �Է¹���
		this.major=major;
	}
	
	//Friend ��� + �����а� ��¹�
	public void showData()
	{
		super.showData();
		System.out.println("���� : "+major);
	}
	
	//@override UnivFriend.showBasicInfo() �� ��µ� ������ �Է�
	public void showBasicInfo()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
		System.out.println("���� : "+major);
	}
}

//�������� �Ŵ����� ���ִ� Ŭ����
class FriendInfoHandler
{
	//ģ������ �Ӽ����� ���� myFriends �̸��� �迭 ����
	private Friend[] myFriends;
	private int numOfFriends;
	
	//�Ű����� num���� �޾ƿ� ����ŭ(�Է¹���ģ����) �迭�� �������
	//numOfFriends(�Է¹���ģ����)�� ó���� 0������ �ʱ�ȭ������
	//������
	public FriendInfoHandler(int num)
	{
		myFriends=new Friend[num];
		numOfFriends=0;
	}
	
	//Friend�� �������ִ� �Ӽ��� �����޾� (fren) ������ ������� myFriends �迭�� �ҷ��ö����� numOfFriends++�� �ڸ����� �Է¹���
	private void addFriendInfo(Friend fren)
	{
		myFriends[numOfFriends++]=fren;
	}
	
	//�������� �Է¹޴� �޼ҵ�
	public void addFriend(int choice)
	{
		//�̸�,��ȭ��ȣ, �ּҸ� �Է¹���
		String name, phoneNum, addr, job, major;
		Scanner sc=new Scanner(System.in);		
		System.out.print("�̸� : "); name=sc.nextLine();
		System.out.print("��ȭ : "); phoneNum=sc.nextLine();
		System.out.print("�ּ� : "); addr=sc.nextLine();
		
		//�Ű������� �Ѿ��  choice�� 1(HighFriend)�ϰ�� ������ �Է¹����� �Ʊ� �Է¹��� ��� �������� 
		//addFriendInfo �޼ҵ��� �ν��Ͻ��� ����, �������� �Ű������� �Ѱ��ְԵ�
		if(choice==1)
		{
			System.out.print("���� : "); job=sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}
		//���� �������� �۾������� choice�� 2�̹Ƿ� �̹����� ���� ģ��(univFriend)�� ������ �Է�,�Ѱ��ְԵ�
		else	// if(choice==2)
		{
			System.out.print("�а� : "); major=sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("�Է� �Ϸ�! \n");
	}
	
	//��� �Է¹��� �������� �Ʊ� ������ ������� myFriends�迭�� showData�� ������ �����.
	//for���� ģ���� �߰��ɶ����� 1�� �����ϴ� numOfFriends(�ԷµǾ��ִ� ��� ģ����)���� �ݺ���
	public void showAllData()
	{
		for(int i=0; i<numOfFriends; i++)
		{
			myFriends[i].showData();
			System.out.println("");
		}
	}
	//���� �������������� ����ȭ �������� @override��Ų showBasicInfo�� ������ �����
	public void showAllSimpleData()
	{
		for(int i=0; i<numOfFriends; i++)
		{
			myFriends[i].showBasicInfo();
			System.out.println("");
		}
	}
}

//����Ŭ������ �ִ°�
class MyFriendInfoBook
{
	public static void main(String[] args)
	{
		//ģ�� ������ �Է¹��� ���� �Ű躯���� �Ѱ���(10)
		//10�� �Ѱ��ֹǷ� 10��ŭ�� �迭�� �������
		FriendInfoHandler handler=new FriendInfoHandler(10);
		
		while(true)
		{			
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �� ���� ����");
			System.out.println("2. ���� ģ�� ����");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");			
			System.out.println("5. ���α׷� ����");
			System.out.print("����>> ");
			
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			//FriendInfoHandler�� �ִ� ���� �Ŵ����� handler��� �̸��� �ν��Ͻ�����
			//switch������ ���� handler���ִ� Ŭ������(�޴���)�� �ҷ���
			switch(choice)
			{
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showAllSimpleData();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
