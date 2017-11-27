package iterator;

import java.util.Iterator;

public class ComicBooks {
	private ComicBook[] books;
	private int count;
	
	public ComicBooks(int maxSize) {
		books = new ComicBook[maxSize];
		count = 0;
	}
	
	public int appendBook(ComicBook book) {
		books[count++] = book;		
		return count;
	}
	
	public ComicBook getBookAt(int index) {
		return books[index];
	}
	
	public int getLength() {
		return count;
	}
	
	public Iterator iterator() {
		return new ComicBookIterator(this);
	}
	
}
