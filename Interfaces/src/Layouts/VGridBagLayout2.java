package Layouts;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VGridBagLayout2 {

	public static void main(String[] args) {
		VentanaGbl3 ventana = new VentanaGbl3();
		ventana.setVisible(true);
	}

}

class VentanaGbl3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	GridBagLayout gb = new GridBagLayout();

	public VentanaGbl3() {
		super("Ventana con GBagLayout");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lb1 = new JLabel("Nombre"), lb2 = new JLabel("Apellidos");

		JTextField tx1 = new JTextField(20), tx2 = new JTextField(20);

		JButton bt1 = new JButton("Aceptar");

		getContentPane().setLayout(gb);

		ponComponente(lb1, 0, 0, 1, 1);
		ponComponente(tx1, 1, 0, 2, 1);
		ponComponente(lb2, 0, 1, 1, 1);
		ponComponente(tx2, 2, 1, 1, 1);
		ponComponente(bt1, 2, 2, 1, 1);

	}

	void ponComponente(JComponent comp, int gridx, int gridy, int gridw, int gridh) {
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridw;
		gbc.gridheight = gridh;

		gb.setConstraints(comp, gbc);
		add(comp);
	}
}
