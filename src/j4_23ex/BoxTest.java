package j4_23ex;

class Box{
	int width, length, height;
	
	// Ŭ������ �����̸����� �����ε���
	Box (int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	// Box ��� class �� obj��� �̸����� ���� �Ͽ� obj�� �ִ� width, length, height�� ������
	// Box�� ���� obj �� �޾ƿ� �ν��Ͻ� box ���� ���� boolean ���� return����
	boolean isSameBox(Box obj) {
		if((obj.width == width) & (obj.length == length) & (obj.height == height))
			return true;
		else
			return false;
	}
}

public class BoxTest {

	public static void main(String[] args) {
		Box obj1 = new Box(10,20,50);
		Box obj2 = new Box(10,20,50);
		
		//ojb1�� obj2�� ���� �����Ƿ� true���� return�޾� ��µ�
		System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
	}

}
