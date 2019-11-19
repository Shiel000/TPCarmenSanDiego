package vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaPrincipal extends JFrame {

	private JPanel contentPane;
	private vistaResolverMisterio siguiente = vistaResolverMisterio.getInterfaz();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaPrincipal frame = new vistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public vistaPrincipal() {
		setTitle("carmenSandiego");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidosAlJuego = new JLabel("BIENVENIDOS AL JUEGO: ¿DONDE ESTA CANMEN SANDIEGO?");
		lblBienvenidosAlJuego.setBounds(47, 0, 408, 52);
		contentPane.add(lblBienvenidosAlJuego);
		
		JButton btnResolverMisterio = new JButton("Resolver Misterio");
		btnResolverMisterio.setBounds(39, 121, 136, 25);
		contentPane.add(btnResolverMisterio);
		btnResolverMisterio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCaso();
				liberarRecurso();
				setVisible(false);
			}

		});
		
		JButton btnExpedientes = new JButton("Expedientes");
		btnExpedientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//mostrarExpedientes();
				liberarRecurso();
				setVisible(false);
				
			}
		});
		btnExpedientes.setBounds(256, 121, 136, 25);
		contentPane.add(btnExpedientes);
		
		JLabel lblQueEsLo = new JLabel("Que es lo que desea hacer detctive");
		lblQueEsLo.setBounds(107, 54, 208, 40);
		contentPane.add(lblQueEsLo);
	}
	private void mostrarCaso() {
		siguiente.lanzar();
	}
	private synchronized void liberarRecurso() {
		this.notifyAll();
	}

}
