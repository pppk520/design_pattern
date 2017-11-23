package bridge;

public class TVRemoteMute extends RemoteBasic {

	public TVRemoteMute(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV was Muted");
	}

}
