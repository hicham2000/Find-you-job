package Interface_graphique;

import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import recommendation.My_ML;

import javax.swing.JLabel;
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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Interface {

	public JFrame frame;
    public JComboBox ComboxEtude ;
    public JComboBox comboExperience ;
    public JComboBox comboContrat;
    public JTable table;
    public JTextField txtMyDevelopJob;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window1 = new Interface();
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
	
	
	
	public Interface() {
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
		/** frame.setUndecorated(true);
       frame.setVisible(true);
       frame.setContentPane(frame); */
	   // frame.setVisible(true);
	    //frame.setUndecorated(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 26, 1290, 740);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		ImageIcon img=new  ImageIcon(this.getClass().getResource("info.png"));
		
	
		
		
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
		lblC.setBounds(5, 187, 180, 216);
		panel_3.add(lblC);
		ImageIcon o=new  ImageIcon(this.getClass().getResource("freelance.png"));
		lblC.setIcon(o);
		
		JLabel lblDomaine = new JLabel("Niveau d'\u00E9tude");
		lblDomaine.setForeground(new Color(32, 178, 170));
		lblDomaine.setBounds(197, 171, 160, 50);
		lblDomaine.setFont(new Font("Arial", Font.BOLD, 20));
		lblDomaine.setBackground(new Color(32, 178, 170));
		panel_1.add(lblDomaine);
		
		
		
		ImageIcon ii=new  ImageIcon(this.getClass().getResource("s.png"));
		
		ComboxEtude = new JComboBox();
		
				
		
				
		
		ComboxEtude.setBounds(345, 181, 147, 34);
		panel_1.add(ComboxEtude);
		ImageIcon i=new  ImageIcon(this.getClass().getResource("s.png"));
		ImageIcon ig=new  ImageIcon(this.getClass().getResource("s.png"));
		
		JScrollPane scrollPane = new JScrollPane();
		
	
		
		
		
		scrollPane.setBounds(192, 292, 1049, 448);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAfficher = new JButton("Search");
		btnAfficher.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAfficher.setForeground(new Color(32, 178, 170));
		btnAfficher.setBounds(1068, 228, 147, 51);
		panel_1.add(btnAfficher);
		
		JLabel lblNewLabel_7 = new JLabel("Niveau Exp\u00E9rience");
		lblNewLabel_7.setForeground(new Color(32, 178, 170));
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_7.setBounds(523, 176, 183, 41);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Type de contrat");
		lblNewLabel_8.setForeground(new Color(32, 178, 170));
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8.setBounds(879, 176, 174, 41);
		panel_1.add(lblNewLabel_8);
		
		comboExperience = new JComboBox();
		comboExperience.setBounds(718, 181, 149, 34);
		panel_1.add(comboExperience);
		
		 comboContrat = new JComboBox();
		comboContrat.setBounds(1058, 181, 160, 34);
		panel_1.add(comboContrat);
		//lblNewLabel_3.setIcon(ii);
		//reccuperation de l'element selectionner dans combox
		
		
		JLabel lblNewLabel_4 = new JLabel("  ");
		lblNewLabel_4.setBounds(1022, 227, 48, 50);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 System.out.println("Driver O.K.");
					 String url="jdbc:mysql://localhost:3306/test";
					 String user="root";
					  String  passwd="";	 
			Connection con=DriverManager.getConnection(url, user, passwd);
			int ligne = table.getSelectedRow();
			//reccuperation de l'element selectionner dans combox
			String SelectedRowEtude	=ComboxEtude.getSelectedItem().toString();
			String selectedRowexperience=comboExperience.getSelectedItem().toString();
			String selectedRowcontrat=comboContrat.getSelectedItem().toString();
			
			Statement st=con.createStatement();
			/*String nomOffre=ComboxOffre.getSelectedItem().toString();*/
			//String sql="SELECT * FROM `offres` WHERE `niveau_etude`='"+ComboxEtude.getSelectedItem().toString()+"' AND `niveau_experience`='"+comboExperience.getSelectedItem().toString()+"'";
String sql ="select * from `jobs-scraper-v2`";
			ResultSet r=st.executeQuery(sql);
			
			while(r.next()) {
			String nomoffre=table.getModel().getValueAt(ligne, 1).toString();
			String Secteur=table.getModel().getValueAt(ligne, 2).toString();
			String type_Contrat=table.getModel().getValueAt(ligne, 3).toString();
			String nom_entreprise=table.getModel().getValueAt(ligne, 4).toString();
			String competences=table.getModel().getValueAt(ligne, 5).toString();
			String Niveau_etude=table.getModel().getValueAt(ligne, 6).toString();
			String Niveau_experience=table.getModel().getValueAt(ligne, 7).toString();


			}
			table.setModel(DbUtils.resultSetToTableModel(r));

			
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
		});
		lblNewLabel_4.setBackground(new Color(109, 76, 61));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_4.setIcon(ii);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(180, -10, 1061, 168);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(550, 11, 500, 157);
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
		
		JButton btnNewButton = new JButton("Classify");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(109, 76, 61));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new My_ML();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
				dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(222, 232, 135, 49);
		panel_1.add(btnNewButton);
		
		ImageIcon ik=new  ImageIcon(this.getClass().getResource("freelance.png"));
		
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateTable();
			}
		});
	
		
		try {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver O.K.");
		 String url="jdbc:mysql://localhost:3306/test";
		 String user="root";
		  String  passwd="";	 
          Connection con=DriverManager.getConnection(url, user, passwd);		
          Statement st1=con.createStatement();
          Statement st2=con.createStatement();
          Statement st3=con.createStatement();
          //ResultSet rs=st.executeQuery("SELECT DISTINCT `Type_contrat`,`niveau_etude`,`niveau_experience` FROM `offre`");
          ResultSet rs1=st1.executeQuery("SELECT DISTINCT `niveau_etude` FROM `jobs-scraper-v2`");
          ResultSet rs2=st2.executeQuery("SELECT DISTINCT `Niveau_experience` FROM `jobs-scraper-v2`");
          ResultSet rs3=st3.executeQuery("SELECT DISTINCT `type_Contrat` FROM `jobs-scraper-v2`");
         while(rs1.next())
         {
        	 String etude=rs1.getString("Niveau_etude");
  	         ComboxEtude.addItem(etude);
         }
         while(rs2.next())
         {
  	       String experience=rs2.getString("Niveau_experience");
  	        comboExperience.addItem(experience);
		}
			comboContrat.addItem("All");
		 while(rs3.next())
		 {
  	       String contrat=rs3.getString("type_Contrat");
  	         comboContrat.addItem(contrat);
  	      }

  	     con.close(); 

	}catch(Exception e1){
		e1.printStackTrace();	
		
	}
	}
		public void UpdateTable()
		{
			
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 System.out.println("Driver O.K.");
				 String url="jdbc:mysql://localhost:3306/test";
				 String user="root";
				  String  passwd="";	 
		          Connection con=DriverManager.getConnection(url, user, passwd);		
		          Statement st=con.createStatement();
		   // ResultSet rr =st.executeQuery("SELECT * FROM `offre`");
		  //reccuperation de l'element selectionner dans combox
			String SelectedRowEtude	= ComboxEtude.getSelectedItem().toString();
			String selectedRowexperience = comboExperience.getSelectedItem().toString();
			String selectedRowcontrat = comboContrat.getSelectedItem().toString();
			/*String nomOffre=ComboxOffre.getSelectedItem().toString();*/
				if(selectedRowcontrat.equals("All")){
					String sql="SELECT * FROM `jobs-scraper-v2` WHERE niveau_etude='"+SelectedRowEtude+
							"' AND Niveau_experience='"+selectedRowexperience+"'";
					ResultSet rr=st.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rr));
					table.add("hicham",new Container());

				}
				else {
					String sql="SELECT * FROM `jobs-scraper-v2` WHERE niveau_etude='"+SelectedRowEtude+
							"' AND Niveau_experience='"+selectedRowexperience+
							"' AND type_Contrat='"+selectedRowcontrat+"'";
					ResultSet rr=st.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rr));
				}



			}
			catch(Exception ee){
	    		ee.printStackTrace();
	    		
	    	}
	  // table.setModel(DbUtils.resultSetToTableModel(rs));
	  //con.close();
	  
	  }
  }
