package study.Thread;

public class Producer extends Thread{
	private Buffer criticalData;
	
	public Producer(Buffer buffer) {
		this.criticalData = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 4; i++) {
			criticalData.setData(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
