//	import java.util.ArrayList;
//	
//	class Fruit {public String toString() {return "Fruit";}}
//	class Apple extends Fruit {public String toString() {return "Apple";}}
//	class Grape extends Fruit {public String toString() {return "Grape";}}
//	class Toy {public String toString() {return "Toy";}}
//	class FruitBoxEx1 {
//		public static void main(String[] args) {
//			Box<Fruit> fruitBox = new Box<Fruit>();
//			Box<Apple> apple  = new Box<Apple>();
//			Box<Toy> toyBox = new Box<Toy>();
//			//Box<Grape> grapeBox = new Box<Apple>(); // Ÿ�� ����ġ �� ����
//	
//			fruitBox.add(new Fruit());
//			fruitBox.add(new Apple());
//	
//			apple.add(new Apple());
//			apple.add(new Apple());
//	
//			toyBox.add(new Toy());
//			//toyBox.add(new Apple()); // ���ÿ��� ���� Ÿ�Ը� ���� �� ���� 
//	
//			System.out.println(fruitBox);
//			System.out.println(apple);
//			System.out.println(toyBox);
//		}
//	
//	}
//	class Box<T>{
//		ArrayList<T> list = new ArrayList<T>();
//		void add(T item) {list.add(item);	}
//		T get(int i) {return list.get(i);}
//		int size() {return list.size();}
//		public String toString() {
//			return list.toString();
//		}
//	}