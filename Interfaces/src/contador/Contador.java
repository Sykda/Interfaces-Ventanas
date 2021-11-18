package contador;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Contador {

	public static void main(String[] args) {

		Pulsacion1 ventana = new Pulsacion1();
		ventana.setVisible(true);

	}
}

class Pulsacion1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Pulsacion1() {

		JPanel pnl1 = new JPanel();
		JButton btn1 = new JButton("Haz click");
		JTextField txtfld1 = new JTextField(String.valueOf(0), 5);

		setTitle("Contar Clicks en boton");
		setSize(500, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnl1.setLayout(new FlowLayout());
		pnl1.add(new JLabel("Nº Clicks:"));

		// Creación del objeto liostener en el botón Click
		btn1.addActionListener(new ClickEnBoton1(txtfld1));

		// Añadir los componentes al panel
		pnl1.add(txtfld1);
		pnl1.add(btn1);

		Container cp = getContentPane();// Obtención del Content Pane
		cp.add(pnl1);// Se añade el panel al Content Pane

	}
}

class ClickEnBoton1 implements ActionListener {

	JTextField txtfld1;

	Integer iclicks = 0;

	public ClickEnBoton1(JTextField txtfld1) {

		this.txtfld1 = txtfld1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			iclicks = Integer.parseInt(txtfld1.getText()) + 1;
			txtfld1.setText(iclicks.toString());
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null,"Solo puedes meter números", "Error",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}