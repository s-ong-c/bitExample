package lamda;
@FunctionalInterface
interface MyFuction{
	void myMethod();
}
public class LamdaEx2 {
	public static void main(String[] args) {
		MyFuction f =()->{};
		Object obj = (MyFuction)( ()->{});
		String str = ((Object)(MyFuction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		
		
		System.out.println((MyFuction)( ()->{}));
		//System.out.println((MyFuction)(()->{}).toString);
		System.out.println(((Object)(MyFuction)(()->{})).toString());
		
		
	}
}
