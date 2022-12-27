package Interface_graphique;

import java.awt.EventQueue;

import Interface_graphique.Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class InterfaceAnnonce {

	public JFrame frame;
	public JTextField txtIntroductionToOwer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					
					InterfaceAnnonce window = new InterfaceAnnonce();
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
	public InterfaceAnnonce() {
		
		initialize();
		
		
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1267, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 188, 585);
		panel.setBackground(new Color(163, 145, 113));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(80, 9, 1, 1);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(86, 41, 1, -26);
		panel.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 0, 164, 188);
		panel.add(lblNewLabel);
		ImageIcon imge=new  ImageIcon(this.getClass().getResource("freelance.png"));
		lblNewLabel.setIcon(imge);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(22, 181, 188, 198);
		panel.add(lblNewLabel_1);
		ImageIcon o=new  ImageIcon(this.getClass().getResource("travailleur.png"));
		lblNewLabel_1.setIcon(o);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(22, 409, 154, 148);
		panel.add(lblNewLabel_2);
		ImageIcon d=new  ImageIcon(this.getClass().getResource("recrutement.png"));
		lblNewLabel_2.setIcon(d);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(189, 123, 1039, 550);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Apply now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(704, 365, 220, 66);
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		panel_4.add(btnNewButton);
		ImageIcon e=new  ImageIcon(this.getClass().getResource("info.png"));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(617, 365, 64, 66);
		panel_4.add(lblNewLabel_4);
		ImageIcon f=new  ImageIcon(this.getClass().getResource("cliquer.png"));
		lblNewLabel_4 .setIcon(f);
		
		JTextPane txtpnCandidate = new JTextPane();
		txtpnCandidate.setFont(new Font("Arial Nova", Font.BOLD, 25));

		txtpnCandidate.setText("Accès à un large éventail d'offres d'emploi.");
		txtpnCandidate.setBounds(85, 100, 927, 51);
		panel_4.add(txtpnCandidate);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(161, 409, 152, -14);
		panel_4.add(textPane);
		
		JTextPane txtpnWs = new JTextPane();
		txtpnWs.setFont(new Font("Arial Nova", Font.BOLD, 25));

		txtpnWs.setText("Permettre au candidat de rechercher facilement l'offre d'emploi correspondant à ses critères.");
		txtpnWs.setBounds(85, 184, 927, 44);
		panel_4.add(txtpnWs);
		
		JTextPane txtpnD = new JTextPane();
		txtpnD.setFont(new Font("Arial Nova", Font.BOLD, 25));

		txtpnD.setText("l'application peut offrir aux candidats la possibilité de postuler en ligne à des offres d'emploi.");
		txtpnD.setBounds(85, 258, 927, 70);
		panel_4.add(txtpnD);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(189, 0, 1039, 127);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(550, 0, 500, 126);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(e);
		
		txtIntroductionToOwer = new JTextField();
		txtIntroductionToOwer.setBounds(0, 0, 1039, 126);
		panel_2.add(txtIntroductionToOwer);
		txtIntroductionToOwer.setBackground(new Color(171, 196, 171));
		txtIntroductionToOwer.setFont(new Font("Arial Black", Font.ITALIC, 31));
		txtIntroductionToOwer.setForeground(new Color(0, 0, 0));
		txtIntroductionToOwer.setText("                Nos Services");
		txtIntroductionToOwer.setColumns(10);
		//frame.setUndecorated(true);
		
	
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
