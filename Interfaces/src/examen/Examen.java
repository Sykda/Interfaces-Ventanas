package examen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Examen {

	public static void main(String[] args) {

		Ventana ventana = new Ventana();

	}

}

class Ventana extends JFrame {

	public Ventana() {

		String textolabel = "0";

		setSize(350, 250);
		setTitle("Calculadora");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container cp = getContentPane();
		cp.setLayout(new GridLayout(3, 1,5,5));	
		

		JLabel label= new JLabel(textolabel);
		cp.add(label);
		
		JButton resultado= new JButton("resultado");
		resultado.addActionListener(new ClickEnBoton1(label));
		cp.add(resultado);
			

		Container cp2 = new Container();
		cp2.setLayout(new GridLayout(4, 4, 5, 5));
		cp.add(cp2);

		JButton siete= new JButton("7");
		siete.addActionListener(new ClickEnBoton1(label));		
		cp2.add(siete);
		
		cp2.add(new JButton("8"));
		cp2.add(new JButton("9"));
		cp2.add(new JButton("/"));

		cp2.add(new JButton("4"));
		cp2.add(new JButton("5"));
		cp2.add(new JButton("6"));
		cp2.add(new JButton("*"));

		cp2.add(new JButton("1"));
		cp2.add(new JButton("2"));
		cp2.add(new JButton("3"));
		cp2.add(new JButton("-"));

		cp2.add(new JButton("*"));
		cp2.add(new JButton("0"));
		cp2.add(new JButton("#"));
		cp2.add(new JButton("+"));

		cp.add(cp2);

	}

}

class ClickEnBoton1 implements ActionListener {

	JLabel label;

	Integer iclicks = 0;

	public ClickEnBoton1(JLabel label) {

		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		label.setText(iclicks.toString());

	}
}
