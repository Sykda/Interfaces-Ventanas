package Layouts;

import java.awt.*;

import javax.swing.*;

public class VGridLayout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		VGridLayout b = new VGridLayout();
		b.setVisible(true);
		b.setLocationRelativeTo(null);

	}

	public VGridLayout() {
		setTitle("12 botones");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 4, 3, 3));

		for (int i = 1; i <= 12; i++) {
			getContentPane().add(new JButton(String.valueOf(i)));
		}
	}
}
