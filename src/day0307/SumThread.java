package day0307;

public class SumThread extends Thread{ // Runnable interface 를 구현하는 객체 Thread 를 상속
	
	private long sum;
	
	public void setSum(long sum) { //set
		this.sum = sum;
	}
	
	
	public long getSum() {		//get
		return sum;
	}
	
	
	@Override
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum +=i;
		}
	}
}
