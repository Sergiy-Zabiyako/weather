package com.example.weatherfx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*Write the weather data for the next 15 days to the day.csv file*/
public class PrintWeather {
    public void writeToFile(String str){
        try {
            File file= new File("day.csv");
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(str+"\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
