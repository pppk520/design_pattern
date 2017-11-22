package decorator;

public class Main {
	public static void main(String[] args) {
		Pizza myPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + myPizza.getDescription());
		System.out.println("Price: " + myPizza.getCost());
	}
}
