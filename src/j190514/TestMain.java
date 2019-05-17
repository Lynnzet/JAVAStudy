package j190514;

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("TV¸¦ ÄÒ´Ù..");
	}
	public void turnOff() {
		System.out.println("TV¸¦ ²ö´Ù..");
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
