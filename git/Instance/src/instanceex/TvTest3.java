package instanceex;

	
	
	

public class TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
	System.out.println("t1의 채널은값은"+t1.channel+"입니다");
	System.out.println("t2의 채널은값은"+t2.channel+"입니다");
	
		t2=t1;
		t1.channel =7;
		System.out.println("현재 t1의 채널은 7로 변경합니다.");
		System.out.println("t1의 채널은값은"+t1.channel+"입니다");
		System.out.println("t2의 채널은값은"+t2.channel+"입니다");

	}

}
