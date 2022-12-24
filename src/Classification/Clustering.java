package Classification;

import java.util.Random;

import weka.clusterers.ClusterEvaluation;
import weka.clusterers.EM;
import weka.core.Instances;
import weka.experiment.InstanceQuery;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

public class Clustering {

	public Clustering() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
		
		
		System.out.println(data.toString());

		EM model = new EM();
		// build the clusterer
		model.buildClusterer(data);
		System.out.println(model);
		
		double logLikelihood = ClusterEvaluation.crossValidateModel(model,data,10, new Random(1));
		System.out.println(logLikelihood);
	}

}
