package singleton;

public class GetLetterThread implements Runnable {

	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		
		System.out.println("instance ID = " + System.identityHashCode(singleton));
		System.out.println("get 2 letters = " + singleton.getLetters(2));
	}
}
