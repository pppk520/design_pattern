package observer;

public class Main {
	public static void main(String[] args) {
		BitCoinPriceRss subject = new BitCoinPriceRss();
		StackHolder user1 = new StackHolder(); 
		StackHolder user2 = new StackHolder();
		
		subject.register(user1);
		subject.register(user2);
		
		subject.setPrice(100);
		subject.setPrice(200);
		
	}
}
