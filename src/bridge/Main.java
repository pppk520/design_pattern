package bridge;

public class Main {
	public static void main(String[] args) {
		RemoteBasic theTVRemote = new TVRemoteMute(new TVDevice());
		RemoteBasic theDVDRemote = new DVDRemote(new DVDDevice());

		System.out.println("----------- TV Remote Mute -----------");
		theTVRemote.buttonFivePressed();
		theTVRemote.buttonSixPressed();
		theTVRemote.buttonNinePressed();
		
		System.out.println("----------- DVD Remote Basic -----------");
		theDVDRemote.buttonFivePressed();
		theDVDRemote.buttonSixPressed();
		theDVDRemote.buttonNinePressed();
	}
}
