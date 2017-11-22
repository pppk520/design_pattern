package factory;

public class EnemyShip {
	private String name;
	private double damage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void followHeroShip(){
		System.out.println(getName() + " is following the hero");
	}

	public void display(){
		System.out.println(getName() + " is on the screen");
	}

	public void shoot(){
		System.out.println(getName() + " is shooting");
	}
}
