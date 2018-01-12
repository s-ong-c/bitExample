package inheritance;
class Card{
	final int NUMBER;
	final String KIND;
	static int width= 100;
	static int heigth = 200;
	Card(int num, String kind) {
		super();
		NUMBER = num;
		KIND = kind;
	}
	public Card() {
		this(10,"HEART");
		
	}
	@Override
	public String toString() {
		return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
	}
	
	
}
public class FinalCardTest {
	public static void main(String[] args) {
		
	Card c = new Card(10,"HEART");
	
	System.out.println(c.KIND);
	System.out.println(c.NUMBER);
	System.out.println(c);
	System.out.println(c.toString());

	}
	

}
