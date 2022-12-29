package recommendation;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;



import java.io.FileReader;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;




/**
 * Hello world!
 *
 */
public class My_ML {

    public JTextArea log;

    public My_ML() throws Exception {
        JFrame f = new JFrame("Console");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel container = new JPanel();
        JScrollPane scrPane = new JScrollPane(container);
        f.add(scrPane);


        log = new JTextArea();
        f.setSize(1200, 1000);
        f.add(log);
        f.setVisible(true);
        emplois = loademplois("data/recommandation-coded.csv");

//		itemBased();
//		 userBased();
//		evaluateRecommender();

        HashMap<Integer, Double> itemScore = ItemSimilarity(emplois);
        ArrayList<Integer> listtt = recommendItems(itemScore);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver O.K.");
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String passwd = "";

            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement st1 = con.createStatement();

            for(int i = 0; i < listtt.size(); i++){


            String hi = "SELECT * FROM `jobs-scraper-v2` WHERE id IN (" + listtt.get(i) + ")";


            ResultSet rs1 = st1.executeQuery(hi);


            ResultSetMetaData resultMeta = rs1.getMetaData();
            while (rs1.next()) {
//                for (int j = 1; j <= resultMeta.getColumnCount(); j++) {
                    prompt(rs1.getObject(1).toString() + "|");//utilisé pour tester en console
                    prompt(rs1.getObject(resultMeta.getColumnCount()).toString() + "|");//utilisé pour tester en console
//                }

                // System.out.println("\n---------------------------------");//imprime les lignes//utilisé pour tester

            }

//            }




        } con.close();

        }
        catch (Exception e1) {
                e1.printStackTrace();
    }


    }


        public void prompt(String msg) {
            log.append(msg + "\n");
        }


    static HashMap<Integer,ArrayList<String>>  emplois;







    public static HashMap<Integer,ArrayList<String>> loademplois(String filename) throws Exception {

        HashMap<Integer,ArrayList<String>>  map = new  HashMap<Integer,ArrayList<String>>();
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = "";
        while ((line = in.readLine()) != null) {
            String parts[] = line.replace(" ", "_").split(",");
            ArrayList<String> values = new ArrayList<String>();
            values.add(parts[1]);
            values.add(parts[2]);
            values.add(parts[3]);
            map.put(Integer.parseInt(parts[0]),values);
        }
        in.close();
        return map;


    }

    //

    public static HashMap<Integer,Double> ItemSimilarity(HashMap<Integer,ArrayList<String>> map) {

        int i = 1;
        HashMap<Integer,Double> itemScore = new HashMap<Integer,Double>();
        HashMap<Integer,ArrayList<String>> itemMap = new HashMap<Integer,ArrayList<String>>();
        itemMap=map;
        ArrayList<String> user = map.get(0);

        itemMap.remove(0);
        for (ArrayList<String> value : itemMap.values()) {
            Double score =0.0;
            if(value.get(0) .equals(user.get(0))) {
                score += 0.5;
            }
            if(Integer.parseInt(value.get(1)) <= Integer.parseInt(user.get(1))) {
                score += 0.2;
            }
            if(Integer.parseInt(value.get(2)) <= Integer.parseInt(user.get(2))) {
                score += 0.2;
            }
            itemScore.put(i,score);
            i++;

        }


        return itemScore;

    }
   public static ArrayList<Integer> Ids = new ArrayList<Integer>();
    public static ArrayList<Integer> recommendItems(HashMap<Integer,Double> itemScore) {



        List<Map.Entry<Integer, Double>> list = new ArrayList<>(itemScore.entrySet());

        // Sort the list using a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Iterate over the sorted list in reverse order and add the key-value pairs to a new LinkedHashMap
        // in the desired order
        LinkedHashMap<Integer, Double> reversedMap = new LinkedHashMap<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            Map.Entry<Integer, Double> entry = list.get(i);
            reversedMap.put(entry.getKey(), entry.getValue());
        }

        // Return the top N items with the highest score
        List<Integer> recommendedItems = new ArrayList<>();
        int count = 0;
        for (Map.Entry<Integer, Double> entry : reversedMap.entrySet()) {
            recommendedItems.add(entry.getKey());
            count++;
            Ids.add(entry.getKey());
            if (count >= 40) {
                break;
            }
        }
        System.out.println("List"+Ids);
        return Ids;
    }
}