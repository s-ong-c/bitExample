package instanceex;
class Tv{
	//멤버
	String color;
	boolean power;
	int channel;
	
	void power()
	{
		power = ! power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
	
	
}
public class TvTest {

	public static void main(String[] args) {
		Tv t; // 변수 선언
		t =new Tv();
		t.channel =7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"입니다.");

	}

}
