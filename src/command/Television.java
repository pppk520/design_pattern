package command;

public class Television implements ElectronicDevice {
	private int volume = 0;
	
	
	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Volume up, current is " + volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Volume down, current is " + volume);
	}
	

}
