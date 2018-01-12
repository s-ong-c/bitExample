import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class Card{

	static final int KIND_MAX=4;
	static final int NUM_MAX=4;

	static final int SPADE = 4;
	static final int DIAMOND =3;
	static final int HERAT =2;
	static final int  CLOVER =1;

	int kind;
	int number;

	Card(){
		this(SPADE,1);
	}
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		String [] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String   numbers="23456789XJQKA";//13
							//a2345678910 11 12 13
											// J Q K
		return  kinds[this.kind]+ ",=" + numbers.charAt(this.number);
	}



}


class PokerTest {

	@Test
	void test() {
		Card[] cards = { new Card(1,1), new Card(2,3),new Card(3,3),new Card(4,5),new Card(3,7)};
		assertTrue(rankCheck(cards).equals("one Pair")); // 원페
	}
	@Test
	void test1() {
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,3),new Card(4,3),new Card(3,7)};

		assertTrue(rankCheck(cards).equals("twoPair")); // 원페
	}
	@Test
	void test2() {//트리
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,1),new Card(4,3),new Card(3,7)};
		assertTrue(rankCheck(cards).equals("triple")); // 원페
	}
	@Test
	void test3() {//포카
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,1),new Card(4,1),new Card(3,7)};

		assertTrue(rankCheck(cards).equals("FOURCARD")); // 원페
	}
	@Test
	void test4() {//풀하우
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,1),new Card(4,2),new Card(3,2)};
		assertTrue(rankCheck(cards).equals("fullhouse")); // 원페
	}
	@Test
	void test5() {//플러쉬
		Card[] cards = { new Card(1,1), new Card(1,5),new Card(1,6),new Card(1,2),new Card(1,11)};
		assertTrue(rankCheck(cards).equals("flush")); // 플러
	}
	@Test
	void test6() {//str
		Card[] cards = { new Card(1,1), new Card(1,2),new Card(4,3),new Card(1,4),new Card(3,5)};
		assertTrue(rankCheck(cards).equals("str")); // 플러
	}

	@Test
	void test7() {//strflu
		Card[] cards = { new Card(1,1), new Card(1,2),new Card(1,3),new Card(1,4),new Card(1,5)};
		assertTrue(rankCheck(cards).equals("strflu")); // 플러
	}
	@Test
	void test8() {//rsrt
		Card[] cards = { new Card(1,8), new Card(1,9),new Card(1,10),new Card(1,11),new Card(1,12)};
														//8==텐임
		
		assertTrue(rankCheck(cards).equals("rstr")); // 플러
	}


	String rankCheck(Card [] cards) {


		int count [] = new int [13];
		int countK[] = new int[5];

		int sum =0;
		int sum2=0;
		int ss=0;
		int str=0;
		int kum=0;
		for(int i= 0;i<cards.length;i++) {
			count[cards[i].number]++;
		}
		for(int i =0;i<count.length;i++) {

			if(count[i]==2) {
				sum++; //같은거두개더해지
			}
			else if(count[i]==3) {// 숫자같은 거3
				sum2++;
			}
			else if(count[i]==4) {
				System.out.println("포카드");
				return "FOURCARD";
			}
			else if(count[i]==1) {
				ss++;
				if(ss==5&&cards[0].number+1==cards[1].number) {
					str++;
				}
			}
		}

		if(sum==1&&sum2==0) {//1쌍이면 
			System.out.println("원페");
			return "one Pair";
		}else if (sum==2){//2쌍이
			System.out.println("투페");
			return "twoPair";
		}else if(sum==1 && sum2==1) {
			System.out.println("풀하우스");
			return "fullhouse";
		}else if(sum2==1 && sum==0) {
			System.out.println("트리플");
			return "triple";
		}
		
		//스트레이트 플러쉬
		for(int j= 0;j<cards.length;j++) {
			countK[cards[j].kind]++;
		}
		for(int j =0;j<countK.length;j++) {
			if(countK[j]==5){
				kum++;
			}
		}
		if(kum==1&&str==1&&cards[0].number==8) {
			System.out.println("로얄스트레이트 플러쉬");
			return "rstr";
		}
		else if(kum==1&&str==0) {
			System.out.println("플래쉬");
			return "flush";
		}
		else if(kum==1&&str==1) {
			System.out.println("스트레이트 플러");
			return "strflu";
		}
		else if(kum==0&&str==1) {
			System.out.println("스트레이트");
			return "str";
		}

		sum =0;
		kum=0;
		sum2=0;
		ss=0;
		
		//변수초기화 
		// 플래쉬

		return "No Rank";
	}

}

