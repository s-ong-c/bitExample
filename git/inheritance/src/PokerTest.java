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
		assertTrue(rankCheck(cards).equals("one Pair")); // ����
	}
	@Test
	void test1() {
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,3),new Card(4,3),new Card(3,7)};

		assertTrue(rankCheck(cards).equals("twoPair")); // ����
	}
	@Test
	void test2() {//Ʈ��
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,1),new Card(4,3),new Card(3,7)};
		assertTrue(rankCheck(cards).equals("triple")); // ����
	}
	@Test
	void test3() {//��ī
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,1),new Card(4,1),new Card(3,7)};

		assertTrue(rankCheck(cards).equals("FOURCARD")); // ����
	}
	@Test
	void test4() {//Ǯ�Ͽ�
		Card[] cards = { new Card(1,1), new Card(2,1),new Card(3,1),new Card(4,2),new Card(3,2)};
		assertTrue(rankCheck(cards).equals("fullhouse")); // ����
	}
	@Test
	void test5() {//�÷���
		Card[] cards = { new Card(1,1), new Card(1,5),new Card(1,6),new Card(1,2),new Card(1,11)};
		assertTrue(rankCheck(cards).equals("flush")); // �÷�
	}
	@Test
	void test6() {//str
		Card[] cards = { new Card(1,1), new Card(1,2),new Card(4,3),new Card(1,4),new Card(3,5)};
		assertTrue(rankCheck(cards).equals("str")); // �÷�
	}

	@Test
	void test7() {//strflu
		Card[] cards = { new Card(1,1), new Card(1,2),new Card(1,3),new Card(1,4),new Card(1,5)};
		assertTrue(rankCheck(cards).equals("strflu")); // �÷�
	}
	@Test
	void test8() {//rsrt
		Card[] cards = { new Card(1,8), new Card(1,9),new Card(1,10),new Card(1,11),new Card(1,12)};
														//8==����
		
		assertTrue(rankCheck(cards).equals("rstr")); // �÷�
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
				sum++; //�����ŵΰ�������
			}
			else if(count[i]==3) {// ���ڰ��� ��3
				sum2++;
			}
			else if(count[i]==4) {
				System.out.println("��ī��");
				return "FOURCARD";
			}
			else if(count[i]==1) {
				ss++;
				if(ss==5&&cards[0].number+1==cards[1].number) {
					str++;
				}
			}
		}

		if(sum==1&&sum2==0) {//1���̸� 
			System.out.println("����");
			return "one Pair";
		}else if (sum==2){//2����
			System.out.println("����");
			return "twoPair";
		}else if(sum==1 && sum2==1) {
			System.out.println("Ǯ�Ͽ콺");
			return "fullhouse";
		}else if(sum2==1 && sum==0) {
			System.out.println("Ʈ����");
			return "triple";
		}
		
		//��Ʈ����Ʈ �÷���
		for(int j= 0;j<cards.length;j++) {
			countK[cards[j].kind]++;
		}
		for(int j =0;j<countK.length;j++) {
			if(countK[j]==5){
				kum++;
			}
		}
		if(kum==1&&str==1&&cards[0].number==8) {
			System.out.println("�ξ⽺Ʈ����Ʈ �÷���");
			return "rstr";
		}
		else if(kum==1&&str==0) {
			System.out.println("�÷���");
			return "flush";
		}
		else if(kum==1&&str==1) {
			System.out.println("��Ʈ����Ʈ �÷�");
			return "strflu";
		}
		else if(kum==0&&str==1) {
			System.out.println("��Ʈ����Ʈ");
			return "str";
		}

		sum =0;
		kum=0;
		sum2=0;
		ss=0;
		
		//�����ʱ�ȭ 
		// �÷���

		return "No Rank";
	}

}

