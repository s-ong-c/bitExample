import javax.swing.JOptionPane;


public class ThreadEx14 {
	public static void main(String[] args) throws Exception {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하시오");
		System.out.println("입력하신 "+input+"입니다.");
		th1.interrupt();
		System.out.println("isInterrupted(): "+th1.isInterrupted());
	}
}
class ThreadEx14_1 extends Thread{
	public void run() {
		int i = 10;
		
		while(i !=0 &&  !isInterrupted()) {
			System.out.println("isInterrupted(): "+isInterrupted());
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				interrupt();
				System.out.println("isInterrupted(): "+isInterrupted());
				//System.out.println("asd");
			}
		}
		System.out.println("카운트가 종료 되었습니다.");
	}
}