package bridge;

public class TVDevice extends EntertainmentDevice {

	@Override
	public void buttonFivePressed() {
		System.out.println("Channel Down");
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Channel Up");
	}
	

}
