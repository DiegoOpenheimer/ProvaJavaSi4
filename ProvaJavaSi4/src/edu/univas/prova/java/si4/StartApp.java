package edu.univas.prova.java.si4;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class StartApp extends JFrame { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel = null;

	public StartApp() {
		this.setTitle("Prova");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 450);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setPane();
		addComponents();
		this.setVisible(true);
	}
	
	public void setPane() {
		contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());
		this.setContentPane(contentPanel);
	}
	
	public void addComponents() {
		JPanel paneLeft = new JPanel();
		paneLeft.setBackground(Color.GRAY);
		paneLeft.setPreferredSize(new Dimension(140, 450));
		contentPanel.add(paneLeft, BorderLayout.WEST);
		
		addButton(paneLeft);
		
		JPanel gribag = new JPanel();
		gribag.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		JLabel nome = new JLabel();
		nome.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(12, 12, 12, 12);
		gribag.add(nome, gbc);
		
		JTextField campoNome = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		campoNome.setPreferredSize(new Dimension(260, 20));
		gribag.add(campoNome, gbc);
		
		JLabel email = new JLabel();
		email.setText("E-mail: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(12, 12, 12, 12);
		gribag.add(email, gbc);
		
		JTextField campoEmail = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		campoEmail.setPreferredSize(new Dimension(260, 20));
		gribag.add(campoEmail, gbc);
		
		
		JButton salvar = new JButton();
		salvar.setText("Salvar");

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.weightx = 0.0;
		
		gribag.add(salvar, gbc);
	
		gbc.anchor = GridBagConstraints.CENTER;
		String[] colunm = {"Nome", "CPF", "E-mail"};
		Object[][] data = {
				{"João", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},
				{"José", "333.333.333-33", "jose@gmail.com"}
		};
		
	
		JTable tabela = new JTable(data, colunm);
		tabela.setFillsViewportHeight(true);
		
		tabela.setFillsViewportHeight(true);
		
		JScrollPane scrollTabela = new JScrollPane(tabela);
		scrollTabela.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTabela.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollTabela.setPreferredSize(new Dimension(324, 100));
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.LINE_START;
	
	
		
		
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		
		
		
		
		gribag.add(scrollTabela, gbc);
		
		
		contentPanel.add(gribag, BorderLayout.CENTER);
		
		
		
	}
	
	public void addButton(JPanel pane) {
		for( int i = 0; i < 10; i++) {
			JButton button = new JButton();
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Eu sou responsável pelo meu futuro");
					
				}
			});
			button.setText("Botão " + (i + 1));
			pane.add(button);
		}
	}
	

}
