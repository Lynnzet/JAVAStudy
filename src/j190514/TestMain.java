package j190514;

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("TV�� �Ҵ�..");
	}
	public void turnOff() {
		System.out.println("TV�� ����..");
	}
}

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television t = new Television();
		t.turnOn();
		t.turnOff();
	}

}
