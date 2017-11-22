package command;

public class Main {
	public static void main(String[] args) {
		ElectronicDevice newDevice = new Television();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		TurnTVDown volDownCommand = new TurnTVDown(newDevice);

		DeviceButton onPressed = new DeviceButton(onCommand);
		DeviceButton offPressed = new DeviceButton(offCommand);
		DeviceButton upPressed = new DeviceButton(volUpCommand);
		DeviceButton downPressed = new DeviceButton(volDownCommand);

		onPressed.press();
		offPressed.press();
		
		upPressed.press();
		upPressed.press();
		upPressed.pressUndo();
		upPressed.pressUndo();
	}
}
