//package inheritance;
//
//public class FighterTest {
//	public static void main(String[] args) {
//		
//		
//		Fighter f = new Fighter();
//		if(f instanceof Unit1)
//			System.out.println("f�� Unit�� �ڼ��Դϴ�.");
//		if(f instanceof Fightable) 
//			System.out.println("f�� Fightable��  �������̽��� �����մϴ�.");
//		if(f instanceof Movable)
//			System.out.println("f�� Movable�� �������̽��� �����մϴ�,");
//		if(f instanceof Attackable)
//			System.out.println("f �� Attackable �������̽��� �����մϴ�");
//		if(f instanceof Object)
//			System.out.println("f �� Objcet�� �ڼ��Դϴ�");
//	}
//
//}
//class Fighter extends Unit1 implements Fightable{
//	@Override
//	public void attack(Unit1 u) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void move(int x, int y) {
//		// TODO Auto-generated method stub
//		
//	}
//}
//class Unit1{
//	int curentHP;
//	int x;
//	int y;
//}
//interface Fightable extends Movable, Attackable{}
//interface Movable{void move(int x, int y);}
//interface Attackable{void attack(Unit u);}