package bridge;

public abstract class RemoteBasic {
	private EntertainmentDevice theDevice;
	
	public RemoteBasic(EntertainmentDevice newDevice) {
		theDevice = newDevice;
	}

	public void buttonFivePressed() {
		theDevice.buttonFivePressed();
	}
	
	public void buttonSixPressed() {
		theDevice.buttonSixPressed();
	}
	
	public abstract void buttonNinePressed();

}
