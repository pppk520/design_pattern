package iterator;

import java.util.Iterator;

public class ComicBookIterator implements Iterator {
	private ComicBooks comicBooks;
	private int index;
	
	public ComicBookIterator(ComicBooks comicBooks) {
		this.comicBooks = comicBooks;
		this.index = 0;
	}
	
	public boolean hasNext() {
		if (index < comicBooks.getLength()) {
			return true;
		}
		
		return false;
	}

	public Object next() {
		ComicBook book = comicBooks.getBookAt(index++);
		return book;
	}

}
