package Layouts;

import java.awt.*;
import javax.swing.*;

public class VFlowLayout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		VFlowLayout b = new VFlowLayout();
		b.setVisible(true);
		b.setLocationRelativeTo(null);

	}

	public VFlowLayout() {
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel(String.valueOf("Nombre:")));
		cp.add(new JTextField(10));
		getContentPane().add(new JButton("Aceptar"), BorderLayout.SOUTH);

	}
}
