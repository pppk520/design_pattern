package bridge;

public class DVDDevice extends EntertainmentDevice {
	@Override
	public void buttonFivePressed() {
		System.out.println("Previous Chapter");
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Next Chapter");
	}
	
}
