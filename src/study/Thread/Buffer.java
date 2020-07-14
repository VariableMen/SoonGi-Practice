package study.Thread;

public class Buffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData() {
		
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		empty = true;
		System.out.println("제품 사용 : " + data + "번째 제품이 사용되었습니다.");
		notify();
	}
	
	public synchronized void setData(int data) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.data = data;
		empty = false;
		System.out.println("제품 생산 : " + data + "번째 제품이 생산되었습니다.");
		notify();
	}
}
