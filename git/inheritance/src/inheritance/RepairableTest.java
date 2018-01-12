package inheritance;

public class RepairableTest {
 public static void main(String[] args) {
	 
	 Tank tank = new Tank();
	 Dropship dropship = new Dropship();
	 
	 SCv sCv = new SCv();
	 
	 sCv.repair(tank);
	 sCv.repair(dropship);
	 
}
}
interface Repairable{}
class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP= hp;
	}
	
}
class GroundUnit extends Unit{

	GroundUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}
class AirUnit extends Unit{

	AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}
class Tank extends GroundUnit implements Repairable{

	Tank() {
		
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank []";
	}
}
class Dropship extends GroundUnit implements Repairable{

	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship []";
	}
}
class SCv extends GroundUnit implements Repairable{

	SCv() {
		super(60);
		hitPoint = MAX_HP;
		// TODO Auto-generated constructor stub
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint !=u.MAX_HP) {
				
				u.hitPoint++;
			}
			System.out.println(u.toString()+"수리 완료 ");
		}
	}
	
}