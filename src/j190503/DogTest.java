package j190503;

class Animal{
	public void sound() {
		System.out.println("Animal: �Ҹ�����");
		
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		super.sound();
		System.out.println("Dog: �۸�!!");
		

	}
}
public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog d = new Dog();
			d.sound();
	}

}
