package j4_23ex;

class Employee {
	private String name;
	private double salary;
	
	private static int count = 0;
	
	//인스턴스 생성때마다 Employee 클래스를 불러와 count++로 증가함
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++;
	}
	
	// 인스턴스 제거시 줄어들 클래스
	protected void finalize() {
		count--;
	}
	
	// 이 클레스에서 count값을 return 해줌
	public static int getCount() {
		return count;
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("김철수",35000);
		e2 = new Employee("최수철",50000);
		e3 = new Employee("김철호",20000);
		
		//getCount로 count 값을 받아옴
		//지금 위 생성된 인스턴스가 3개이므로 Employee에 있는 count++이 3번 생성되어 count에 3이 저장됨 
		int n = Employee.getCount();
		System.out.println("현재의 직원수 = " + n);
	}
}
