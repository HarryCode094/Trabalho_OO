package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.ImageIcon;
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtSenha;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 667);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite as informações de login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(337, 283, 204, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnBotao1 = new JButton("Login");
		btnBotao1.setForeground(Color.WHITE);
		btnBotao1.setBackground(Color.BLACK);
		btnBotao1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal d = new TelaPrincipal();
			if(txtEmail.getText().equals("harrysoncamposmartins@yahoo.com.br") && txtSenha.getText().equals("306021")) {
				d.setVisible(true);
				dispose();
			}else {
				
				JOptionPane.showMessageDialog(null, "Usuario não encontrado");
			}
				
			}
		});
		btnBotao1.setBounds(390, 422, 89, 23);
		contentPane.add(btnBotao1);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(351, 363, 166, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("l");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\harry\\OneDrive\\Imagens\\Capturas de tela\\alaogin2.png"));
		lblNewLabel_1.setBounds(390, 140, 89, 100);
		contentPane.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(351, 332, 166, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisitante x = new TelaVisitante();
				x.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(10, 22, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("© 1959-2023,Amazen.com,Inc. ou seus afiliados");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(304, 603, 299, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\harry\\OneDrive\\Imagens\\Capturas de tela\\Amazen.png"));
		lblNewLabel_3.setBounds(351, 545, 70, 47);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRASIL");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(471, 578, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Administrador");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrador a = new Administrador();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(765, 22, 131, 23);
		contentPane.add(btnNewButton_1);
	}
}
