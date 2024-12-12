package pruebaEntornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Boton 1");
		contentPane.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		contentPane.add(spinner);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, "name_8901331110500");
	}

}
