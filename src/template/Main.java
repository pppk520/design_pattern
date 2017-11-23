package template;

public class Main {
	public static void main(String[] args) {
		Tea blackTea = new BlackTea();
		Tea greenTea = new GreenTea();
		
		blackTea.makeTea();
		
		System.out.println("------------------");
		
		greenTea.makeTea();
	}
}
