//package inheritance;
//
//public class DeckTest {
//	public static void main(String[] args) {
//		Deck d = new Deck(); // ī�带 �ѹ� �����
//		Card c = d.pick(0);   // ī�� �ϳ� ��
//		//System.out.println(c); // ��ī�尡 ����
//		 
//		d.shuffle();  //ī�� ����
//		c =d.pick(0); // ������ �߿��� ����
//		System.out.println(c);
//	}
//}
//class Deck{
//	final int CARD_NUM =52;
//	Card2 cardArr[] = new Card2[CARD_NUM];
//	int counter [] =new int[5];
//	
//	Deck() {
//		int i=0;
//		
//		for(int k =Card.KIND_MAX; k>0;k--) {
//			for(int n=0;n<Card.NUM_MAX;n++) {
//				cardArr[i++] = new Card2(k,n+1);
//			}
//		}
//	}
//	Card pick(int index) {
//		return cardArr[index];
//	}
//	Card pick() {
//		int index = (int)(Math.random()*CARD_NUM);
//	
//		return pick(index);
//	}
//	void shuffle() {
//		for(int i=0;i<cardArr.length;i++) {
//			int r= (int)(Math.random()*CARD_NUM);
//			
//			Card temp = cardArr[i];
//			cardArr[i] = cardArr[r];
//			cardArr[r]= temp;
//			
//		}
//		for(int i=0;i<4;i++) {
//			System.out.println(cardArr[i]);
//			
//		}
////		for(int i=0;i<cardArr.length;i++) {
////			counter[CARD_NUM]++;
////			System.out.println("aa");
////		}
//		
//	}
//
//}
//class Card2{
//	static final int KIND_MAX =4;
//	static final int NUM_MAX=13;
//	
//	static final int SPADE =4;
//	static final int DIAMOND =3;
//	static final int HEART = 2;
//	static final int CLOVER =1;
//	
//	int kind;
//	int number;
//	
//	Card2(){
//		this(SPADE,1);
//	}
//
//	Card2(int kind, int number) {
//		this.kind = kind;
//		this.number = number;
//	}
//	void rankCheck(int kind,int number) {
//		System.out.println("��");
//		String[] kinds= {"","CLOVER","HEART","DIAMOND","SPADE"};
//		String numbers ="0123456789JQK";//13�� �� 52��
//			if(numbers.equals(numbers.charAt(this.number))){
//				System.out.println("�����");
//			}
//			
//	}
//
//	@Override
//	public String toString() {
//		String[] kinds= {"","CLOVER","HEART","DIAMOND","SPADE"};
//		String numbers ="0123456789XJQK";//13�� �� 52��
//		return kinds[this.kind]+",number:"+numbers.charAt(this.number);
//	}
//	
//	
//	
//}
