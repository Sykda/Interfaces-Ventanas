package ejercicio;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class RegistroUsuario extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		RegistroUsuario ru = new RegistroUsuario();
		ru.setVisible(true);
		ru.setLocationRelativeTo(null);
		

		
	}

	public RegistroUsuario() {
		
		setSize(350,250);
		setTitle("Crear usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4,2,5,35));
		
		
		Container cp2 = new Container();
		cp2.setLayout(new FlowLayout());
		
		
		cp.add(new JLabel(String.valueOf("Nombre:")));
		cp.add(new JTextField(10));		
		cp.add(new JLabel(String.valueOf("DNI:")));
		cp.add(new JTextField(10));
		
		
		
		cp.add(new JLabel(String.valueOf("Fecha de nacimiento:")));
		cp.add(cp2);
		
		cp2.add(new JTextField(2));
		cp2.add(new JLabel("/"));
		cp2.add(new JTextField(2));
		cp2.add(new JLabel("/"));
		cp2.add(new JTextField(4));
		
		Container cp3 = new Container();
		cp3.setLayout(new BorderLayout());
		cp.add(cp3);
		cp3.add(new JButton("Aceptar"), BorderLayout.EAST);
		
		
		Container cp4 = new Container();
		cp4.setLayout(new BorderLayout());
		cp.add(cp4);
		cp4.add(new JButton("Cancelar"), BorderLayout.WEST);
	}
}



