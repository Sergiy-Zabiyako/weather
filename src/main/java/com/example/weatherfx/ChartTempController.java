package com.example.weatherfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import static com.example.weatherfx.WeatherController.rootWeather;

public class ChartTempController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private LineChart<String, Number> chart;
    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;
    /* We build a temperature graph. Create a new Stage, Scene, LineChart, XYSeries without using a preset in Scene Builder*/
    @FXML
    void initialize() {
        Stage stage = new Stage();
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Day");
        yAxis.setLabel("Temperature");
        final LineChart<String,Number> chart = new LineChart<String, Number>(xAxis,yAxis);
        chart.setTitle("Temperature Chart");
        XYChart.Series series = new XYChart.Series();
        ArrayList<String> xCoord = new ArrayList<>();
        ArrayList<Double> yCoord = new ArrayList<>();

        PrintWeather printWeather = new PrintWeather();
        int dayLength = (rootWeather.days).size();
        for (int i = 0; i < dayLength; i++) {
            xCoord.add(rootWeather.days.get(i).datetime);
            yCoord.add(rootWeather.days.get(i).temp);
            System.out.println(rootWeather.days.get(i));
            printWeather.writeToFile(String.valueOf(rootWeather.days.get(i)));
        }
        for (int i = 0; i < xCoord.size(); i++){
            series.getData().add(new XYChart.Data(xCoord.get(i), yCoord.get(i)));
        }
        chart.getData().add(series);
        series.setName(rootWeather.resolvedAddress);
        Scene scene = new Scene(chart, 1200, 400);
        stage.setScene(scene);
        stage.show();
    }
}
