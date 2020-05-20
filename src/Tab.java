import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Tab extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	// VARIABLES DE JUEGO ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	static private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private PalabraOculta palabra = new PalabraOculta();
	private final byte intentos = 5;
	private byte aciertos = 0;
	private byte errores = 0;
	private JLabel lblIngreseLetra;
	private JTextField textFieldLetra;
	private JButton btnProbar;
	private JLabel lblMostrar;

	// VARIABLES DE JUEGO ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tab frame = new Tab(jugadores);
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
	public Tab(ArrayList<Jugador> j) {

		this.jugadores = j;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String po = passwordField.getText();
				System.out.println(po);
				palabra.setPalabra(po);
			}
		});
		btnNewButton.setBounds(287, 47, 135, 44);

		passwordField = new JPasswordField();
		passwordField.setBounds(10, 47, 267, 44);

		JLabel lblNewLabel = new JLabel("Ingrese palabra oculta:");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 5, 412, 31);
		contentPane.setLayout(null);

//		frame.getContentPane().setLayout(null);		
		contentPane.add(btnNewButton);
		contentPane.add(passwordField);
		contentPane.add(lblNewLabel);
		
		lblIngreseLetra = new JLabel("Ingrese letra:");
		lblIngreseLetra.setFont(new Font("Roboto", Font.BOLD, 14));
		lblIngreseLetra.setBounds(10, 128, 412, 31);
		contentPane.add(lblIngreseLetra);
		
		textFieldLetra = new JTextField();
		textFieldLetra.setBounds(10, 170, 113, 44);
		contentPane.add(textFieldLetra);
		textFieldLetra.setColumns(10);
		
		btnProbar = new JButton("Probar");
		btnProbar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String l = textFieldLetra.getText();
				String adivinado = palabra.verificarLetras(l.charAt(0));
				textFieldLetra.setText("");
				textFieldLetra.requestFocus();
				lblMostrar.setText(adivinado);
			}
		});
		btnProbar.setBounds(137, 170, 135, 44);
		contentPane.add(btnProbar);
		
		lblMostrar = new JLabel("");
		lblMostrar.setFont(new Font("Roboto", Font.BOLD, 14));
		lblMostrar.setBounds(10, 240, 412, 31);
		contentPane.add(lblMostrar);
	}

}
