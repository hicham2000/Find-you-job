package Interface_graphique;

import java.awt.EventQueue;



import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.Authenticator;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Inscription {

	public JFrame frame;
    public JTextField txtMyDevelopJob;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription window1 = new Inscription();
					window1.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public void offreDropDown()  {
		
		
	
	}
	
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Inscription() {
		initialize();
		
	}



	
	
	/**
	 * Initialize the contents of the frame.
	  SetContentPane(frame);
		
		SetUnderorated(true);
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1253, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		offreDropDown();
		/* frame.setUndecorated(true);
       frame.setVisible(true);
       frame.setContentPane(frame); */
	   // frame.setVisible(true);
//	    frame.setUndecorated(true);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 26, 1290, 740);
		panel.add(panel_1);
		panel_1.setLayout(null);





		JPanel panel_3 = new JPanel();
		panel_3.setBounds(-11, 0, 201, 740);
		panel_3.setBackground(new Color(163, 145, 113));
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(41, 393, 157, 222);
		panel_3.add(lblNewLabel_1);


		ImageIcon imgz=new  ImageIcon(this.getClass().getResource("employer.png"));
		lblNewLabel_1.setIcon(imgz);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(21, -43, 150, 284);
		panel_3.add(lblNewLabel_3);
		ImageIcon imge=new  ImageIcon(this.getClass().getResource("freelance.png"));
		lblNewLabel_3.setIcon(imge);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(41, 571, 56, 16);
		panel_3.add(lblNewLabel_2);
		ImageIcon p=new  ImageIcon(this.getClass().getResource("emp.png"));
		lblNewLabel_3.setIcon(p);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(83, 571, 56, 16);
		panel_3.add(lblNewLabel_5);

		JLabel lblC = new JLabel("");
		lblC.setBounds(31, 187, 157, 216);
		panel_3.add(lblC);
		ImageIcon o=new  ImageIcon(this.getClass().getResource("freelance.png"));
		lblC.setIcon(o);




		ImageIcon ii=new  ImageIcon(this.getClass().getResource("s.png"));





		ImageIcon i=new  ImageIcon(this.getClass().getResource("s.png"));
		ImageIcon ig=new  ImageIcon(this.getClass().getResource("s.png"));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(180, -10, 1061, 168);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(550, 11, 500, 157);;
		panel_2.add(lblNewLabel);

		ImageIcon ij=new  ImageIcon(this.getClass().getResource("info.png"));
		lblNewLabel.setIcon(ij);

		txtMyDevelopJob = new JTextField();
		txtMyDevelopJob.setBounds(10, 0, 1051, 168);
		panel_2.add(txtMyDevelopJob);
		txtMyDevelopJob.setFont(new Font("Arial", Font.BOLD, 50));
		txtMyDevelopJob.setBackground(new Color(171, 196, 171));
		txtMyDevelopJob.setText("                Find your job");
		txtMyDevelopJob.setColumns(10);

		JTextPane textLogin = new JTextPane();
		textLogin.setBounds(536, 240, 158, 28);
		panel_1.add(textLogin);

		JTextArea textMdp = new JTextArea();
		textMdp.setBounds(536, 325, 158, 28);
		panel_1.add(textMdp);

		JLabel lblNewLabel_6 = new JLabel("Entrer un login");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_6.setBounds(268, 228, 186, 50);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Entrer un mot de pass");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_7.setBounds(268, 323, 201, 45);
		panel_1.add(lblNewLabel_7);

		JButton btnNewButton2 = new JButton("Loge in");
		btnNewButton2.setBounds(700, 415, 200, 61);
		btnNewButton2.setForeground(new Color(32, 178, 170));
		btnNewButton2.setFont(new Font("Arial Black", Font.BOLD, 15));
		panel_1.add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Authentification.main(null);
				frame.dispose();
			}
		});

		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(32, 178, 170));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){

				 try {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 System.out.println("Driver O.K.");
					 String url="jdbc:mysql://localhost:3306/test";
					 String user="root";
					  String  passwd="";
			          Connection con=DriverManager.getConnection(url, user, passwd);
			          Statement st=con.createStatement();
					if(textLogin.getText().isEmpty() || textMdp.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,"il faux remplir tout les champs");


					}
					else {
					String sql="INSERT INTO `profil`(`Login`, `Motpass`) VALUES ('"+textLogin.getText()+"','"+textMdp.getText()+"')";
				     int rs2=st.executeUpdate(sql);
				     Inscription window=new Inscription();
				     window.frame.setVisible(true);
				     JOptionPane.showMessageDialog(null,"inscription réussite!");
				     Authentification.main(null);
					 dispose();
					}
				}
				catch(Exception e1) {
					e1.getStackTrace();
				}


			}

			private void dispose() {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton.setBounds(268, 417, 179, 58);
		panel_1.add(btnNewButton);


		ImageIcon ik=new  ImageIcon(this.getClass().getResource("freelance.png"));


	
		
	}
  }
