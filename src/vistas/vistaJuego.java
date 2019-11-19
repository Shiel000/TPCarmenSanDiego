package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class vistaJuego extends JFrame {

	private JPanel contentPane;
	
	private static vistaJuego interfaz = new vistaJuego();
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaJuego frame = new vistaJuego();
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
	public vistaJuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPais = new JButton("pais1");
		btnPais.setBounds(58, 117, 97, 25);
		contentPane.add(btnPais);
		
		JButton btnPais_1 = new JButton("pais 2");
		btnPais_1.setBounds(58, 167, 97, 25);
		contentPane.add(btnPais_1);
		
		JButton btnPais_2 = new JButton("pais3");
		btnPais_2.setBounds(58, 224, 97, 25);
		contentPane.add(btnPais_2);
		
		JButton btnLugar = new JButton("lugar1");
		btnLugar.setBounds(285, 117, 97, 25);
		contentPane.add(btnLugar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(285, 167, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnL = new JButton("l3");
		btnL.setBounds(285, 225, 97, 25);
		contentPane.add(btnL);
		
		JLabel lblPaisEnEl = new JLabel("Pais en el que esta:");
		lblPaisEnEl.setBounds(12, 13, 118, 27);
		contentPane.add(lblPaisEnEl);
		
		JLabel lblPaisesALos = new JLabel("paises a los que puede viajar:");
		lblPaisesALos.setBounds(12, 53, 184, 45);
		contentPane.add(lblPaisesALos);
		
		JLabel lblLugaresALos = new JLabel("lugares a los  que se puede viajar:");
		lblLugaresALos.setBounds(237, 62, 206, 27);
		contentPane.add(lblLugaresALos);
	}

	public static vistaJuego getVistaJuegoInterfaz() {
		// TODO Auto-generated method stub
		return interfaz;
	}
	public void lanzar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
