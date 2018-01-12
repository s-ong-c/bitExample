enum Transportation{
	BUS(100) {int fare (int distance){return distance*BASIC_FARE;}},  // �Ÿ� ���ϱ� ���
	TRAIN(150) {int fare (int distance){return distance*BASIC_FARE;}},
	SHIP(100) {int fare (int distance){return distance*BASIC_FARE;}},
	AIRPLANE(300) {int fare (int distance){return distance*BASIC_FARE;}};

	protected final int BASIC_FARE;  // ����� �����ϱ� ���ؼ� 
	
	private Transportation(int baseFare) {  // ������
	 BASIC_FARE = baseFare; 
	}
	public int getBasicFare() {return BASIC_FARE;}
	abstract int fare(int distance);  // �Ÿ� �������� ��  ��� 
}
public class EnumEx3 {
	public static void main(String[] args) {
		System.out.println("bus fare="+Transportation.BUS.fare(100));
		System.out.println("Train fare ="+Transportation.TRAIN.fare(100));
		System.out.println("ship fare ="+Transportation.SHIP.fare(100));
		System.out.println("airplane fare ="+Transportation.AIRPLANE.fare(100));
	}
}
