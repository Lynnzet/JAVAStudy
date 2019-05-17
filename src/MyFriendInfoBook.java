
import java.util.Scanner;


class Friend 
{
	//처음 Friend 객체 속성 저장
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
	
	//Friend 출력용 (get)
	public void showData()
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+phoneNum);
		System.out.println("주소 : "+addr);
	}
	//오버라이딩용 빈 클래스 생성
	public void showBasicInfo(){}
}

//고등학교 친구
//속성은 기존 Friend 클래스를 상속 받고있음
class HighFriend extends Friend		// 고교동창
{
	//추가로 직업을 받아올 변수
	String work;
	
	//Friend에서 정의한 받아올 정보들 + 직업도 받아옴
	public HighFriend(String name, String phone, String addr, String job)
	{
		//부모에 있는 변수를 호출하기위해서 사용
		super(name, phone, addr);
		work=job;		
	}
	
	//친구 showData + 직업까지 출력하기위한 오버라이딩
	public void showData()
	{
		super.showData();
		System.out.println("직업 : "+work);
	}
	
	//@override HighFriend.showBasicInfo()시 출력되는 정보
	public void showBasicInfo()
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+phoneNum);
	}
}

	//대학 친구 입력을 위한 클래스
	//위와 마찬가지로 Friend 클래스를 상속 받고있음
class UnivFriend extends Friend 	// 대학동기
{
	//추가로 전공학과입력을 위한 변수 선언
	String major;		// 전공학과
	
	public UnivFriend(String name, String phone, String addr, String major)
	{
		//Friend 변수를 사용하기 위한 super
		super(name, phone, addr);
		//추가 전공학과를 입력받음
		this.major=major;
	}
	
	//Friend 출력 + 전공학과 출력문
	public void showData()
	{
		super.showData();
		System.out.println("전공 : "+major);
	}
	
	//@override UnivFriend.showBasicInfo() 시 출력될 정보들 입력
	public void showBasicInfo()
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+phoneNum);
		System.out.println("전공 : "+major);
	}
}

//여러가지 매뉴들이 모여있는 클래스
class FriendInfoHandler
{
	//친구라은 속성들을 가진 myFriends 이름의 배열 생성
	private Friend[] myFriends;
	private int numOfFriends;
	
	//매개변수 num으로 받아온 수만큼(입력받을친구수) 배열을 만들어줌
	//numOfFriends(입력받은친구수)를 처음인 0값으로 초기화시켜줌
	//생성자
	public FriendInfoHandler(int num)
	{
		myFriends=new Friend[num];
		numOfFriends=0;
	}
	
	//Friend가 가지고있는 속성을 참조받아 (fren) 위에서 만들어준 myFriends 배열에 불러올때마다 numOfFriends++로 자리마다 입력받음
	private void addFriendInfo(Friend fren)
	{
		myFriends[numOfFriends++]=fren;
	}
	
	//정보들을 입력받는 메소드
	public void addFriend(int choice)
	{
		//이름,전화번호, 주소를 입력받음
		String name, phoneNum, addr, job, major;
		Scanner sc=new Scanner(System.in);		
		System.out.print("이름 : "); name=sc.nextLine();
		System.out.print("전화 : "); phoneNum=sc.nextLine();
		System.out.print("주소 : "); addr=sc.nextLine();
		
		//매개변수로 넘어온  choice가 1(HighFriend)일경우 직업도 입력받은뒤 아까 입력받은 모든 정보들을 
		//addFriendInfo 메소드의 인스턴스를 생성, 정보들을 매개변수로 넘겨주게됨
		if(choice==1)
		{
			System.out.print("직업 : "); job=sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}
		//위와 마찬가지 작업이지만 choice가 2이므로 이번에는 대학 친구(univFriend)의 정보를 입력,넘겨주게됨
		else	// if(choice==2)
		{
			System.out.print("학과 : "); major=sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("입력 완료! \n");
	}
	
	//모든 입력받은 정보들을 아까 위에서 만들어준 myFriends배열을 showData를 참조해 출력함.
	//for문은 친구가 추가될때마다 1씩 증가하는 numOfFriends(입력되어있는 모든 친구수)까지 반복함
	public void showAllData()
	{
		for(int i=0; i<numOfFriends; i++)
		{
			myFriends[i].showData();
			System.out.println("");
		}
	}
	//위와 마찬가지이지만 간략화 목적으로 @override시킨 showBasicInfo를 참조해 출력함
	public void showAllSimpleData()
	{
		for(int i=0; i<numOfFriends; i++)
		{
			myFriends[i].showBasicInfo();
			System.out.println("");
		}
	}
}

//메인클래스가 있는곳
class MyFriendInfoBook
{
	public static void main(String[] args)
	{
		//친구 정보를 입력받을 수를 매계변수로 넘겨줌(10)
		//10을 넘겨주므로 10만큼의 배열이 만들어짐
		FriendInfoHandler handler=new FriendInfoHandler(10);
		
		while(true)
		{			
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교 정보 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");			
			System.out.println("5. 프로그램 종료");
			System.out.print("선택>> ");
			
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			//FriendInfoHandler에 있는 여러 매뉴들을 handler라는 이름의 인스턴스생성
			//switch문으로 여러 handler에있는 클래스들(메뉴들)을 불러옴
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
