package yaprnn.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuAddAction implements ActionListener {

	private GUI gui;

	MenuAddAction(GUI gui) {
		this.gui = gui;
		setEnabled(false);
		gui.getView().getMenuAdd().addActionListener(this);

		// TODO: Die Funktionen zum Hinzufügen von Layern wird zurzeit nicht
		// unterstützt, aber auch nicht dringend gebraucht.
		gui.getView().getMenuAdd().setVisible(false);
	}

	void setEnabled(boolean enabled) {
		gui.getView().getMenuAdd().setEnabled(enabled);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}