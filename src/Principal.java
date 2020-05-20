import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class Principal extends JFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// VARIABLES DE JUEGO ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		// VARIABLES DE JUEGO ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

		frame = new JFrame();
		frame.setBounds(100, 100, 477, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 461, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ingrese nombre de jugador:");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 284, 57);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(10, 62, 284, 49);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				Jugador j = new Jugador(nombre);
				jugadores.add(j);
				textField.setText("");
				textField.requestFocus();
			}
		});
		btnNewButton.setBounds(304, 61, 145, 49);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Finalizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tab tab = new Tab(jugadores);
				tab.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(UIManager.getColor("ColorChooser.foreground"));
		btnNewButton_1.setBackground(UIManager.getColor("ColorChooser.foreground"));
		btnNewButton_1.setBounds(303, 169, 144, 57);
		panel.add(btnNewButton_1);
	}
}
