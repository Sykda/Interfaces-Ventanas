package di;

import javax.swing.JFrame;

public class CrearVentana {

	public static void main(String[] args) {

		Ventana miVentana = new Ventana();
		miVentana.setVisible(true);
		miVentana.setTitle("Mi primera ventana");
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void ventana() {
		setSize(500, 300);
	}
}
