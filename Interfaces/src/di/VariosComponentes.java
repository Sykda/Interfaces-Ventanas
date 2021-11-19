package di;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VariosComponentes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Botones b = new Botones();
		b.setVisible(true);
		b.setLocationRelativeTo(null);

	}
}

class Botones extends JFrame {

	/*
	 * private JButton
	 * 
	 * b.setVisible(true); b.setSize(300,100); b.setLocationRelativeTo(null);
	 * b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * 
	 * b1= new JButton("Boton 1"), b2= new JButton("Boton 2");
	 * 
	 * 
	 * public Botones() { FlowLayout fl = new FlowLayout();
	 * 
	 * setLayout(fl); fl.setHgap(50); fl.setVgap(5);
	 * 
	 * add(b1); add(b2); }
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Botones() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		GridLayout gl = new GridLayout(4, 3);
		gl.setHgap(5);
		gl.setVgap(5);
		cp.setLayout(gl);

		for (int i = 1; i <= 9; i++) {
			cp.add(new JButton(String.valueOf(i)));
		}

		cp.add(new JButton(String.valueOf("*")));
		cp.add(new JButton(String.valueOf(0)));
		cp.add(new JButton(String.valueOf("#")));
	}
}
