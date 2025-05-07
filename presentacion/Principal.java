package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import logica.Parcial;

public class Principal extends JFrame implements ActionListener{
	private JLabel resultado;
	private JButton botonCalcular;
	private JPanel panel;
	private Parcial parcial;
	private int b;
	private int exp;

	public Principal() {
		this.parcial = new Parcial(b, exp);
		
		this.setTitle("Parcial 2: Calcular Potencias");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(700, 700);
		this.setLayout(new BorderLayout());	
		
		this.resultado = new JLabel("0", SwingConstants.RIGHT);
		this.resultado.setBackground(Color.white);
		this.resultado.setOpaque(true);
		
		this.add(this.resultado, BorderLayout.SOUTH);
		
		this.panel = new JPanel();
		this.add(this.panel);
		
		this.botonCalcular = new JButton();

		this.botonCalcular.setText("Calcular potencia");

		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Principal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton botonPresionado = (JButton)e.getSource();
		int result = this.parcial.potencia(b, exp);
		String resultadoString = parse(result);
		this.resultado.setText(resultadoString);
	}
}
