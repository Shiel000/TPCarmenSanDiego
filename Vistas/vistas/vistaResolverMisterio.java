package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class vistaResolverMisterio extends JFrame {

	private JPanel contentPane;

	private static vistaResolverMisterio interfaz =new vistaResolverMisterio();

	public static vistaResolverMisterio getInterfaz() {
		return interfaz;
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaResolverMisterio frame = new vistaResolverMisterio();
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
	public vistaResolverMisterio() {
		setTitle("aca va el nombre del caso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
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
