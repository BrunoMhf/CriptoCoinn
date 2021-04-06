package imagensprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JanelaDoGrafico extends JFrame {

	private JPanel jpnGrafico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDoGrafico frame = new JanelaDoGrafico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaDoGrafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		jpnGrafico = new JPanel();
		jpnGrafico.setBorder(new EmptyBorder(5, 5, 5, 5));
		jpnGrafico.setLayout(new BorderLayout(0, 0));
		setContentPane(jpnGrafico);
		
		//importante
		
		ArrayList<Price> listaDePrice = new ArrayList<>();
		
		listaDePrice.add(new Price("Price", "Volume", null));
		
		GraficoDeLinha graficoDeLinha = new GraficoDeLinha();
		 
		this.jpnGrafico.setLayout(new BorderLayout());
		
		this.jpnGrafico.add(graficoDeLinha.criarGrafico(listaDePrice));
		
		pack();
	}

}
