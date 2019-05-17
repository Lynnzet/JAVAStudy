package j4_23ex;

class Employee {
	private String name;
	private double salary;
	
	private static int count = 0;
	
	//�ν��Ͻ� ���������� Employee Ŭ������ �ҷ��� count++�� ������
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++;
	}
	
	// �ν��Ͻ� ���Ž� �پ�� Ŭ����
	protected void finalize() {
		count--;
	}
	
	// �� Ŭ�������� count���� return ����
	public static int getCount() {
		return count;
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("��ö��",35000);
		e2 = new Employee("�ּ�ö",50000);
		e3 = new Employee("��öȣ",20000);
		
		//getCount�� count ���� �޾ƿ�
		//���� �� ������ �ν��Ͻ��� 3���̹Ƿ� Employee�� �ִ� count++�� 3�� �����Ǿ� count�� 3�� ����� 
		int n = Employee.getCount();
		System.out.println("������ ������ = " + n);
	}
}
