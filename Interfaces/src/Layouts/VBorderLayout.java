package Layouts;

import java.awt.*;
import javax.swing.*;

public class VBorderLayout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		VBorderLayout b = new VBorderLayout();
		b.setVisible(true);
		b.setLocationRelativeTo(null);

	}

	public VBorderLayout() {
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout(4, 3));

		getContentPane().add(new JButton("Norte"), BorderLayout.NORTH);
		getContentPane().add(new JButton("Sur"), BorderLayout.SOUTH);
		getContentPane().add(new JButton("Centro"), BorderLayout.CENTER);
		getContentPane().add(new JButton("Este"), BorderLayout.EAST);
		getContentPane().add(new JButton("Oeste"), BorderLayout.WEST);
	}
}
