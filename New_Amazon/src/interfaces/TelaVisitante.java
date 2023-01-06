package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.TelaInicial;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class TelaVisitante extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisitante frame = new TelaVisitante();
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
	public TelaVisitante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				TelaCadastro c = new TelaCadastro();
				c.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(768, 24, 113, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Mais vendidos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(57, 198, 126, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Novidades");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(314, 198, 126, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Promoções");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(193, 198, 126, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnMaisSobreNos = new JButton("Mais sobre nos");
		btnMaisSobreNos.setForeground(Color.WHITE);
		btnMaisSobreNos.setBackground(Color.BLACK);
		btnMaisSobreNos.setBounds(768, 92, 113, 23);
		contentPane.add(btnMaisSobreNos);
		
		JButton btnFaleConosco = new JButton("Fale conosco");
		btnFaleConosco.setForeground(Color.WHITE);
		btnFaleConosco.setBackground(Color.BLACK);
		btnFaleConosco.setBounds(768, 126, 113, 23);
		contentPane.add(btnFaleConosco);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\harry\\OneDrive\\Imagens\\Capturas de tela\\2023-01-06 (2).png"));
		lblNewLabel.setBounds(0, 0, 215, 139);
		contentPane.add(lblNewLabel);
		
		JButton btnLogar = new JButton("Entrar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin x = new TelaLogin();
				x.setVisible(true);
				dispose();
				
			}
		});
		btnLogar.setForeground(Color.WHITE);
		btnLogar.setBackground(Color.BLACK);
		btnLogar.setBounds(768, 58, 113, 23);
		contentPane.add(btnLogar);
	}
}
