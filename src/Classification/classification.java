package Classification;


import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.InfoGainAttributeEval;
import weka.attributeSelection.Ranker;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.Utils;
import weka.experiment.InstanceQuery;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

import javax.swing.*;
import java.util.Random;

public class classification{

	public static void main(String[] args) throws Exception {

	
		
		InstanceQuery query;
        query = new InstanceQuery();
        query.setDatabaseURL("jdbc:mysql://localhost:3306/test");
        query.setUsername("root");
        query.setPassword("");
        query.setQuery("select * from `jobs-scraper-v2`");
        Instances data = query.retrieveInstances();
		String[] opts = new String[] {"-R", "1" };
		Remove remove = new Remove();
		
		remove.setOptions(opts);
		remove.setInputFormat(data);
		data = Filter.useFilter(data, remove);
		
		remove.setOptions(opts);
		remove.setInputFormat(data);
		data = Filter.useFilter(data, remove);
		
		
		remove.setOptions(opts);
		remove.setInputFormat(data);
		data = Filter.useFilter(data, remove);
		
		remove.setOptions(opts);
		remove.setInputFormat(data);
		data = Filter.useFilter(data, remove);
		
		remove.setOptions(opts);
		remove.setInputFormat(data);
		data = Filter.useFilter(data, remove);
		
		System.out.println(data.toString());

		/*
		 * Feature selection
		 */
		AttributeSelection attSelect = new AttributeSelection();
		InfoGainAttributeEval eval = new InfoGainAttributeEval();
		Ranker search = new Ranker();
		attSelect.setEvaluator(eval);
		attSelect.setSearch(search);
		attSelect.SelectAttributes(data);
		int[] indices = attSelect.selectedAttributes();
		System.out.println("Selected attributes: "+Utils.arrayToString(indices));

		/*
		 * Build a decision tree
		 */
		String[] options = new String[1];
		options[0] = "-U";
		J48 tree = new J48();
		tree.setOptions(options);
		tree.buildClassifier(data);
		System.out.println(tree);

		/*
		 * Classify new instance.
		 */
//		Instance test = new SparseInstance(5);
//		test.setValue(data.attribute(0),0);
//		test.setValue(data.attribute(1),1);
//		test.setValue(data.attribute(2),1);
//		test.setValue(data.attribute(3),1);
//		test.setValue(data.attribute(4),1);
		
		Instance test = new SparseInstance(3);
		test.setValue(data.attribute(0),0);
		test.setValue(data.attribute(1),1);
		test.setValue(data.attribute(2),1);
	    
	    
		//Assosiate your instance with Instance object in this case dataRaw
		test.setDataset(data); 
		System.out.println(test);
		double label = tree.classifyInstance(test);
	    System.out.println(data.classAttribute().value((int) label));

		 //Visualize decision tree
		
		TreeVisualizer tv = new TreeVisualizer(null, tree.graph(),
		new PlaceNode2());
		JFrame frame = new javax.swing.JFrame("Tree Visualizer");
		frame.setSize(1900, 1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(tv);
		frame.setVisible(true);
		tv.fitToScreen();

		/*
		 * Evaluation
		 */
		

		Classifier cl = new J48();
		Evaluation eval_roc = new Evaluation(data);
		eval_roc.crossValidateModel(cl, data, 10, new Random(1));
		System.out.println(eval_roc.toSummaryString());
		// Confusion matrix
		double[][] confusionMatrix = eval_roc.confusionMatrix();
		System.out.println(eval_roc.toMatrixString());
		
	
		/*
		 * Bonus: Plot ROC curve
		 */

//		ThresholdCurve tc = new ThresholdCurve();
//		int classIndex = 0;
//		Instances result = tc.getCurve(eval_roc.predictions(), classIndex);
//		// plot curve
//		ThresholdVisualizePanel vmc = new ThresholdVisualizePanel();
//		vmc.setROCString("(Area under ROC = " + tc.getROCArea(result) + ")");
//		vmc.setName(result.relationName());
//		PlotData2D tempd = new PlotData2D(result);
//		tempd.setPlotName(result.relationName());
//		tempd.addInstanceNumberAttribute();
//		// specify which points are connected
//		boolean[] cp = new boolean[result.numInstances()];
//		for (int n = 1; n < cp.length; n++)
//			cp[n] = true;
//		tempd.setConnectPoints(cp);
//
//		// add plot
//		vmc.addPlot(tempd);
//		// display curve
//		JFrame frameRoc = new javax.swing.JFrame("ROC Curve");
//		frameRoc.setSize(800, 500);
//		frameRoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frameRoc.getContentPane().add(vmc);
//		frameRoc.setVisible(true);

	}
}

