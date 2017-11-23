package bridge;

public class TVRemotePause extends RemoteBasic {

	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV was Paused");
	}

}
