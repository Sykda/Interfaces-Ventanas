package di;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujarEnMarco {

	public static void main(String[] args) {

		MarcoConDibujos marcoDibujo = new MarcoConDibujos();
		marcoDibujo.setVisible(true);
		marcoDibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {

		setTitle("Marco Con Dibujos");
		setBounds(100, 100, 800, 400);
		CapasConFiguras pnlCapa = new CapasConFiguras();
		add(pnlCapa);

	}
}

class CapasConFiguras extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawRect(50, 50, 100, 50);
		g.drawLine(50, 50, 150, 100);
		g.drawArc(50, 100, 200, 200, 120, 150);
	}
}