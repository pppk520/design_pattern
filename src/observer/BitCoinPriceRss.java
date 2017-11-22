package observer;

import java.util.ArrayList;

public class BitCoinPriceRss implements Subject {

	private ArrayList<Observer> observers;
	private double price;

	public BitCoinPriceRss() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(price);
		}
	}

	public void setPrice(double price) {
		this.price = price;
		notifyObserver();
	}
}
