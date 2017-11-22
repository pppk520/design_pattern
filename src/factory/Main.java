package factory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EnemyShipFactory esFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of ship? (U / B)");
		
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = esFactory.makeEnemyShip(typeOfShip);

			if (theEnemy != null) {
				theEnemy.display();
				theEnemy.followHeroShip();
				theEnemy.shoot();
			} else {
				System.out.print("Please enter U or B");
			}
		}
	}
}
