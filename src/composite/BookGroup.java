package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookGroup extends BookComponent {
	private List<BookComponent> books;
	private String name;
	private String description;
	
	public BookGroup(String name, String description) {
		books = new ArrayList<>();
		
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(BookComponent book) {
		books.add(book);
	}

	@Override
	public void remove(BookComponent book) {
		books.remove(book);
	}

	@Override
	public BookComponent getComponent(int index) {
		return books.get(index);
	}

	@Override
	public void display() {
		System.out.println(String.format("group name: %s [%s]", name, description));
		
		Iterator<BookComponent> it = books.iterator();
		while (it.hasNext()) {
			BookComponent c = (BookComponent) it.next();
			c.display();
		}
	}

}
