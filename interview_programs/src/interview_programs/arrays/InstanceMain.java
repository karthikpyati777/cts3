package interview_programs.arrays;

public class InstanceMain {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			new Thread(()->{
			Logger logger=Logger.getInstance();
			
			logger.log("Message from thread " + Thread.currentThread().getName());
		}).start();
	}
	}
}
