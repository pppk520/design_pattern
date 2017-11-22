package singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {
	private volatile static Singleton instance;
	
	private String[] letters = {"a", "b", "c", "d", "e"};
	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(letters)); 
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	public LinkedList<String> getLetters(int count) {
		LinkedList<String> ret = new LinkedList<>();
		
		for (int i=0; i<count; i++) {
			ret.add(letterList.removeFirst());
		}
		
		return ret;
	}
}
