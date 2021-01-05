import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.security.Key;
import java.util.*;

public class BarChartSample extends Application {

    //Read and edit all at once
    private String s = ReadFile.editData(ReadFile.readData());
    private String[] splited = s.split(" ");
    //Builds a HashMap and sorts it into a LinkedList
    private List<Map.Entry<String, Integer>> words = Build.sort(Build.BuildHash(splited));




    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<>(xAxis,yAxis);
        bc.setTitle("Word Frequency");
        xAxis.setLabel("Word");
        yAxis.setLabel("# of Uses");

        List<String> keyList = new ArrayList<String>();
        //keyList.addAll(keys);
        XYChart.Series series1 = new XYChart.Series();

       for (int i = words.size()-1; i >= 0; i--){
           //series1.getData().add(new XYChart.Data(keyList.get(i), words.get(keyList.get(i))));
           series1.getData().add(new XYChart.Data(words.get(i).getKey(), words.get(i).getValue()));
       }

        Scene scene  = new Scene(bc,1600,1200);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();


        for (int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}