package singleton;

public class Main {
	public static void main(String[] args) {
		Runnable getLetter1 = new GetLetterThread();
		Runnable getLetter2 = new GetLetterThread();
		
		new Thread(getLetter1).start();
		new Thread(getLetter2).start();
	}

}
