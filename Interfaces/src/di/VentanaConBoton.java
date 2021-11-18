package di;

import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaConBoton extends JFrame {

	public static void main(String[] args) {

		VentanaConBoton boton = new VentanaConBoton();
		System.out.println(LocalDateTime.now());

	}

	public VentanaConBoton() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		JButton boton = new JButton();
		boton.setText("Presióname");
		boton.setBounds(135, 150, 130, 50);
		this.add(boton);
		this.setVisible(true);
	}
}
