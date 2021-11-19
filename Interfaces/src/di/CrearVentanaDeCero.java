package di;

import javax.swing.JFrame;

public class CrearVentanaDeCero {

	public static void main(String[] args) {

		CreaFrame myFrame = new CreaFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Hola mundo");
		myFrame.setResizable(false);

	}
}

class CreaFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreaFrame() {
		// setLocation(100,100);
		// setSize(1000,600);
		setBounds(100, 100, 1000, 600);

	}

}
