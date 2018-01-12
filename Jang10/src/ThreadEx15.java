
public class ThreadEx15 {
	public static void main(String[] args) {
		RunImplEx15 r = new RunImplEx15();
		Thread th1 = new Thread(r,"*");
//		Thread th2 = new Thread(r,"**");
//		Thread th3 = new Thread(r,"***");
		
		th1.start();
	//	th2.start();
	//	th3.start();
		
		try {
			Thread.sleep(8000);
			System.out.println();
//			th1.suspend();  // 1¿·±Ò ∏ÿ√Á
//			Thread.sleep(2000);
//			th2.suspend();   // //2∏¶ ∏ÿ√Á
//			Thread.sleep(3000);
			
//			th1.resume();    //1¿ª ¥ŸΩ√ Ω∫≈∏∆Æ
//			Thread.sleep(3000);
//			th1.stop();  
//			th2.stop();
//			Thread.sleep(2000);
//			th3.stop();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
}
class RunImplEx15 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
}
