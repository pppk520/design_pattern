package observer;

public class StackHolder implements Observer {
	
	private double price;
	
	@Override
	public void update(double price) {
		this.price = price;
		System.out.println(String.format("[%s] Get notify of price change, new price = %s", this.hashCode(), price));
	}

}
