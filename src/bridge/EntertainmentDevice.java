package bridge;

public abstract class EntertainmentDevice {
	public int volumeLevel = 0;

	public abstract void buttonFivePressed();
	public abstract void buttonSixPressed();

	public void buttonSevenPressed() {
		volumeLevel++;
		System.out.println("Volume at: " + volumeLevel);
	}

	public void buttonEightPressed() {
		volumeLevel--;
		System.out.println("Volume at: " + volumeLevel);
	}
	
}
