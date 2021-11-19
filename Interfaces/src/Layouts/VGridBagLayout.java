package Layouts;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VGridBagLayout {

	public static void main(String[] args) {

		VentanaGbl2 ventana = new VentanaGbl2();
		ventana.setVisible(true);

	}

}

class VentanaGbl2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaGbl2() {
		super("Ventana con GBagLayout");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		setLayout(gb);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;

		JButton boton0 = new JButton("Botón 0"), boton1 = new JButton("Botón 1"), boton2 = new JButton("Botón 2"),
				boton3 = new JButton("Botón 3"), boton4 = new JButton("Botón 4"), boton5 = new JButton("Botón 5"),
				boton6 = new JButton("Botón 6"), boton7 = new JButton("Botón 7");

		gb.setConstraints(boton0, gbc);
		add(boton0);
		gb.setConstraints(boton1, gbc);
		add(boton1);
		gb.setConstraints(boton2, gbc);
		add(boton2);

		gbc.gridwidth = GridBagConstraints.REMAINDER;

		gb.setConstraints(boton3, gbc);
		add(boton3);

		gbc.weightx = 0.0;

		gb.setConstraints(boton4, gbc);
		add(boton4);
		gbc.gridwidth = GridBagConstraints.RELATIVE;

		gb.setConstraints(boton5, gbc);
		add(boton5);

		gbc.gridwidth = GridBagConstraints.REMAINDER;

		gb.setConstraints(boton6, gbc);
		add(boton6);

		gb.setConstraints(boton7, gbc);
		add(boton7);
	}
}
