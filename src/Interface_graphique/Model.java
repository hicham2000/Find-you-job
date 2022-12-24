package Interface_graphique;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Classification.classification;
import Classification.TextAreaOutputStream;
import Classification.TextBubbleBorder;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Instances;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Model extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Model frame = new Model();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Model() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 673);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel FermerPage = new JLabel("X");
		FermerPage.setBounds(971, 10, 45, 41);
		FermerPage.setForeground(new Color(255, 255, 255));
		FermerPage.setFont(new Font("Tahoma", Font.BOLD, 20));
		FermerPage.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(FermerPage);
		
		JLabel placeBack = new JLabel("");
		placeBack.setBounds(0, 10, 88, 61);
		placeBack.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(placeBack);
		setUndecorated(true);
		//placeBack.setIcon(new ImageIcon(imageBack));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 118, 1006, 545);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
		scrollPane.setViewportView(textArea);
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(SystemColor.textInactiveText);
		JScrollPane scroll = new JScrollPane (textArea);
		scroll.setBounds(5, 115, 0, 2);
        scroll.setSize( 1020, 550 );
        getContentPane().add(scroll);
		/******************************/
        TextAreaOutputStream taos = new TextAreaOutputStream( textArea );
    	AbstractBorder brdrLeft = new TextBubbleBorder(new Color(149, 209, 204),2,16,16);
        AbstractBorder brdrRight = new TextBubbleBorder(Color.BLACK,2,16,16,false);
        JLabel lblClassificationKnearest = new JLabel("Classification : decision tree algorithm");
        lblClassificationKnearest.setHorizontalAlignment(SwingConstants.CENTER);
        lblClassificationKnearest.setForeground(new Color(0, 0, 0));
        lblClassificationKnearest.setBorder(brdrLeft);
        lblClassificationKnearest.setFont(new Font("Tahoma", Font.ITALIC, 24));
        lblClassificationKnearest.setBackground(new Color(255, 0, 51));
        lblClassificationKnearest.setBounds(251, 29, 555, 78);
        contentPane.add(lblClassificationKnearest);
        
        JLabel placeWelcome = new JLabel("");
        placeWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        placeWelcome.setBounds(164, 10, 95, 103);
        contentPane.add(placeWelcome);
      //  placeWelcome.setIcon(new ImageIcon(imageWelcome));
        
        /**************** Afficher le console ***************/
        PrintStream ps = new PrintStream( taos );
        System.setOut( ps );
        System.setErr( ps );
		 /*BufferedReader traind = new BufferedReader(new FileReader("./comp.arff"));
		  //BufferedReader testd = new BufferedReader(new FileReader("D:\\Test.arff"));
		  FileWriter fw =new FileWriter("E:Output.txt");
		  double kk[];
		  Instances train = new Instances(traind);
		  //Instances test = new Instances(testd);
	          train.setClassIndex(train.attribute("domain").index());
		  //train.setClassIndex(train.numAttributes()-1);
		  //test.setClassIndex(test.numAttributes()-1);
		  traind.close();
//		  testd.close();
		  IBk nb = new IBk();
		  
		  nb.buildClassifier(train);
		  Evaluation eval = new Evaluation(train);
		  eval.crossValidateModel(nb, train, 10, new Random(1));
		  System.out.println(eval.toSummaryString("\nResult\n==========\n",true));
		  System.out.println(eval.toClassDetailsString());
		  System.out.println(eval.toMatrixString());
		  System.out.println(eval.fMeasure(1)+" "+eval.precision(1)+" "+eval.recall(1));*/
		  /********************************/
        classification knn = new classification();
		knn.main(null);
		
		/* Quand vous cliquez sur X pour fermer la fen�tre */
		FermerPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Model.this.dispose();
			}
		});
	}


}
