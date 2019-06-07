package j190607;

class Orange {
	int sugerContent;
	public Orange(int suger) { sugerContent=suger;}
	public void showSugerContent() {
		System.out.println("당도 " + sugerContent);
	}
}
class Apple {
	int weight;
	public Apple(int weight) { this.weight = weight; }
	public void showAppleWeight() {
		System.out.println("무게 " + weight);
	}
}
class FruitBox <T> {
	T item;
	public void store(T item) {this.item = item;}
	public T pullOut() {return item;}
}

public class GenericBaseFruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Orange> orBox = new FruitBox<Orange>();
		
		orBox.store(new Orange(10));
		Orange org = orBox.pullOut();
		org.showSugerContent();
		
		FruitBox<Apple> apBox = new FruitBox<Apple>();
		apBox.store(new Apple(20));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
	}

}
