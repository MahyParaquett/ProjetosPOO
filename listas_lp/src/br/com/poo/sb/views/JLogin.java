package br.com.poo.sb.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class JLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCPF;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setTitle("Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(179, 201, 234));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLogin = new JLabel("Login");
		tituloLogin.setBounds(176, 11, 78, 30);
		tituloLogin.setForeground(new Color(128, 0, 255));
		tituloLogin.setFont(new Font("Arial", Font.BOLD, 25));
		contentPane.add(tituloLogin);
		
		textCPF = new JTextField();
		textCPF.setBounds(140, 71, 161, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(140, 118, 161, 20);
		contentPane.add(textSenha);
		
		JLabel LabelCPF = new JLabel("CPF");
		LabelCPF.setBounds(140, 57, 46, 14);
		contentPane.add(LabelCPF);
		
		JLabel LabelSenha = new JLabel("Senha");
		LabelSenha.setBounds(140, 103, 46, 14);
		contentPane.add(LabelSenha);
		
		JButton BotaoEntrar = new JButton("Entrar");
		BotaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = textCPF.getText();
				String senha = new String(textSenha.getPassword());
				if(cpf != null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(BotaoEntrar, "Bem-vindo(a), "+ cpf);
				} else {
					JOptionPane.showMessageDialog(BotaoEntrar, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		BotaoEntrar.setBounds(176, 184, 89, 23);
		contentPane.add(BotaoEntrar);
	}
}
