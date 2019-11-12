package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PruebaCard extends JFrame {

	private JPanel contentPane;
	private Card1 card1;
	public Card2 card2;
	public  CardLayout cardLayout;
	private JLabel lblAa;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaCard frame = new PruebaCard();
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
	public PruebaCard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout = new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);
		
		card1 = new Card1();
		contentPane.add(card1, "1");
		
		lblAa = new JLabel("aa");
		card1.add(lblAa);
		card2 = new Card2();
		contentPane.add(card2, "2");
		card2.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(155, 102, 89, 23);
		card2.add(btnNewButton);
		
		cardLayout.show(this, "1");
	}

}
