package Interface_graphique;


import java.awt.*;

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

import javax.swing.JLabel;
import javax.swing.SwingConstants;
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
import javax.swing.UIManager;

public class Model extends JFrame {


	public JTextArea log;

	public Model() {
		JFrame f = new JFrame("Console");
		log = new JTextArea();
		f.setSize(800, 600);
		f.add(log);
		f.setVisible(true);
		for (int i=0;i<10000;i++){
			prompt("hello");

		}
	}

	public void prompt(String msg) {
		log.append(msg + "\n");
	}


}
