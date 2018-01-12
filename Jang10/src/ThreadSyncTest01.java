
public class ThreadSyncTest01 {
	public static void main(String[] args) {
		Toilet t = new Toilet();
		Person p1 = new Person(t,"���1");
		Person p2 = new Person(t,"���2");
		Person p3 = new Person(t,"���3");
		Person p4 = new Person(t,"���4");
		Person p5 = new Person(t,"���5");
		Person p6 = new Person(t,"���6");
		Person p7 = new Person(t,"���7");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
	}


}
class Person extends Thread{
	Toilet toilet;
	String name;
	Person(Toilet toilet, String name) {
		this.toilet = toilet;
		this.name = name;
	}
	public void run() {
		toilet.openDoor(name);
	}
	
}
class Toilet{
	public synchronized void openDoor(String name){
		System.out.println(name);
		for(int i = 0;i<=1000000000;i++) {
			if(i==10000) {
				System.out.println(name+"�����");
			}
		}
		System.out.println("�������");
	}
}