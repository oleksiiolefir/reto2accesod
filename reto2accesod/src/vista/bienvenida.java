package vista;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JButton;

public class bienvenida extends JPanel {
	

	private JPanel jpanel;
	public JButton btnBienvenida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bienvenida window = new bienvenida();
					window.jpanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bienvenida() {
		setLayout(null);
		
		JButton btnBienvenida = new JButton("BIENVENIDA");
		btnBienvenida.setBounds(163, 134, 111, 23);
		add(btnBienvenida);
	}	
}
	
