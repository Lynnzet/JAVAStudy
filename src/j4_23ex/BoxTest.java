package j4_23ex;

class Box{
	int width, length, height;
	
	// 클래스와 같은이름으로 오버로딩함
	Box (int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	// Box 라는 class 를 obj라는 이름으로 참조 하여 obj에 있는 width, length, height를 참조함
	// Box에 값이 obj 에 받아온 인스턴스 box 값을 비교후 boolean 값을 return해줌
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
		
		//ojb1과 obj2의 값이 같으므로 true값이 return받아 출력됨
		System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
	}

}
