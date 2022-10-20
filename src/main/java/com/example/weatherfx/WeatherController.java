package com.example.weatherfx;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import com.example.weatherfx.visualcrossingCite.Root;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class WeatherController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private Text address;

    @FXML
    private TextField city;

    public TextField getCity() {
        return city;
    }

    public void setCity(TextField city) {
        this.city = city;
    }

    @FXML
    private Text date;

    @FXML
    private Button getData;


    @FXML
    private Button buttonCartTemp;

    @FXML
    private Text press;

    @FXML
    private Text temp;

    @FXML
    private Text wind;

    @FXML
    private Text hum;

    @FXML
    private Text visible;

    /*We use one public variable rootWeather of the Root class*/
    public static Root rootWeather;

    @FXML
    void onWeatherButtonClick(ActionEvent event) {

    }
    /*Enter the city to query the weather in the TextField (city) field. Click on the getData button and parse the JSON with
     * Gson from weather site https://weather.visualcrossing.com in ParserCiteWeather class*/
    @FXML
    void initialize() {
        getData.setOnAction(actionEvent -> {
            try {
                String cityLabel = city.getText(); //получем строку с названием города
                ParserCiteWeather parserCiteWeather = new ParserCiteWeather();
                rootWeather = parserCiteWeather.getWeather(cityLabel.trim());   //получили класс Root

                float timeEpoch = (float) rootWeather.currentConditions.datetimeEpoch;  //нашли время эпохи в классе СurrentConditions
                Date date1 = new Date((long) timeEpoch * 1000);                         //получили текущую дату

                //Выводим данные в текстовые поля экранной формы
                date.setText("Date  " + date1);
                temp.setText("Temperature   " + String.valueOf(rootWeather.currentConditions.temp) + " C");
                press.setText("Pressure          " + String.valueOf(Math.round(rootWeather.currentConditions.pressure / 1.333)) + " mmHg");
                wind.setText("Wind speed    " + String.valueOf(rootWeather.currentConditions.windspeed) + " m/s");
                hum.setText("Humidity            " + rootWeather.currentConditions.humidity + " %");
                visible.setText("Visibility             " + rootWeather.currentConditions.visibility + " km");
                address.setText(rootWeather.resolvedAddress);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        /* Use the buttonCartTemp button to plot the temperature for the next 15 days.
         * The construction takes place in the ChartTempController class in the initialize method. Parse to get data
         *class Days*/

        buttonCartTemp.setOnAction(actionEvent -> {
            ChartTempController controller = new ChartTempController();
            controller.initialize();

/*
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("weatherChart.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent rootFXML = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(rootFXML));
              stage.show();
*/
        });
    }
}