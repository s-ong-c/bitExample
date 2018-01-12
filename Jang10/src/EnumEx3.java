enum Transportation{
	BUS(100) {int fare (int distance){return distance*BASIC_FARE;}},  // 거리 곱하기 요금
	TRAIN(150) {int fare (int distance){return distance*BASIC_FARE;}},
	SHIP(100) {int fare (int distance){return distance*BASIC_FARE;}},
	AIRPLANE(300) {int fare (int distance){return distance*BASIC_FARE;}};

	protected final int BASIC_FARE;  // 상수로 접근하기 위해서 
	
	private Transportation(int baseFare) {  // 생성자
	 BASIC_FARE = baseFare; 
	}
	public int getBasicFare() {return BASIC_FARE;}
	abstract int fare(int distance);  // 거리 바탕으로 한  요금 
}
public class EnumEx3 {
	public static void main(String[] args) {
		System.out.println("bus fare="+Transportation.BUS.fare(100));
		System.out.println("Train fare ="+Transportation.TRAIN.fare(100));
		System.out.println("ship fare ="+Transportation.SHIP.fare(100));
		System.out.println("airplane fare ="+Transportation.AIRPLANE.fare(100));
	}
}
