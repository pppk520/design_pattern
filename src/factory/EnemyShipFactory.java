package factory;

public class EnemyShipFactory {
	public EnemyShip makeEnemyShip(String newShipType){
		if (newShipType.equals("U")){
			return new UFOEnemyShip();
		} else if (newShipType.equals("B")) {
			return new BigEnemyShip();
		}
		
		return null;
	}
}
