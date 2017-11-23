package template;

public abstract class Tea {
	void addSugar() { System.out.println("add sugar");}
	void addWater() { System.out.println("add water");}
	void shake() { System.out.println("shake");}
	void putInCup() { System.out.println("put in cup");}
	
	abstract void addTeaLeaf();
	
	public final void makeTea() {
		addTeaLeaf();
		addSugar();
		addWater();
		shake();
		putInCup();
	}
}
