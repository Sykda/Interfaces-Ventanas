package di;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CrearVentanaCentrada {

	public static void main(String[] args) {

		VentanaCentrada miVentana = new VentanaCentrada();
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class VentanaCentrada extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaCentrada() {

		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;
		int altoPantalla = sizePantalla.height;

		setSize(anchoPantalla / 2, altoPantalla / 2);
		setLocation(anchoPantalla / 4, altoPantalla / 4);
	}
}
