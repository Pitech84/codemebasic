package pl.codeme.oop;

public class ThreadExample {

	public static void main(String[] args) {
//		MyThread mt = new MyThread(1000);
//		
//		Thread t = new Thread(mt); /* do tego momentu wszystko wykonuje się w jednym wątku*/
//		t.start(); /*od tego miejsca zaczyna sie wykonywac rownolegle, to co tu i to co w MyThread*/
//		t.join(); /*join powoduje ze czekamy az watek sie skonczy i dopiero pozniej wykonuje dalej program */
		ThreadData td = new ThreadData();
		Thread[] ths = new Thread[1000];
		
		for (int i = 0; i < 1000; i++) {
//			(new Thread(new MyThread(100, td))).start();
			// (new MyThread(100)).run();
			
			ths[i]= new Thread(new MyThread(100, td));
			ths[i].start();
		
		}
		
		for (int i = 0; i < 1000; i++) {
			try {
				ths[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(td.threadNumber);

	}

}
