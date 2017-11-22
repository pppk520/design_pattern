package builder;

public class Window {
	private boolean dialog;
	private boolean modal;
	private boolean visible;
	
	public Window() {}
	
	public Window setDialog(boolean flag) {
		dialog = flag;
		return this;
	}
	
	public Window setModal(boolean flag) {
		modal = flag;
		return this;
	}

	public Window setVisible(boolean flag) {
		visible = flag;
		return this;
	}
	
}
