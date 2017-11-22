package strategy;

public class Animal {
	Flys flyingType;
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingType(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
