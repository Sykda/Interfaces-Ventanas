package di;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujarComponentes2 {

	public static void main(String[] args) {

		FijarMarco frmPrincipal = new FijarMarco();
		frmPrincipal.setVisible(true);

	}
}

class FijarMarco extends JFrame {

	public FijarMarco() {

		setTitle("Fijar Marco");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// setLayout(null);

		FijarCapa pnlCapa = new FijarCapa();
		add(pnlCapa);

	}
}

class FijarCapa extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; // refundicion, llevas una variable de un tipo a otro tipo
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 500, 150);
		g2.draw(rectangulo);

		g2.draw(new Line2D.Double(100, 100, 600, 250));

		Ellipse2D elipse = new Ellipse2D.Double(50, 50, 500, 150);
		g2.draw(elipse);

		Rectangle2D rectangulo2 = new Rectangle2D.Double(50, 50, 150, 150);
		elipse.setFrame(rectangulo2);

		g2.draw(elipse);

	}
}