package composite;

public abstract class BookComponent {
	public void add(BookComponent book) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(BookComponent book) {
		throw new UnsupportedOperationException();
	}
	
	public BookComponent getComponent(int index) {
		throw new UnsupportedOperationException();
	}
	
	public void display() {
		throw new UnsupportedOperationException();
	}
}
