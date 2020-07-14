package study.Thread;

public class Consumer extends Thread{
	private Buffer criticalData;
	
	public Consumer(Buffer buffer) {
		this.criticalData = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			criticalData.getData();
		
			if(i == 5) {
				System.out.println("������ ��ǰ�� ���Ǿ����ϴ�.");
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
