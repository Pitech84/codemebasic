package pl.codeme.oop;

public class MyThread implements Runnable {

	private int sleepTime;
	private ThreadData td;
	
	public MyThread(int sleepTime, ThreadData td) {
		this.sleepTime = sleepTime;
		this.td = td;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(sleepTime);
			
			synchronized (td) {
			td.threadNumber++;
			}
			
			System.out.println("Finished: " + sleepTime);
		} catch (InterruptedException e) { /* jezeli watek bedzie spal, a my go przerwiemy to bedziemy mieli interupt exeption*/
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
