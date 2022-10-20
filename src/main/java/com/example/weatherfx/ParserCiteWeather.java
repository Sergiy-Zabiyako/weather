package com.example.weatherfx;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import com.example.weatherfx.visualcrossingCite.CurrentConditions;
import com.example.weatherfx.visualcrossingCite.Day;
import com.example.weatherfx.visualcrossingCite.Hour;
import com.example.weatherfx.visualcrossingCite.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

/* We take JSON data on the site https://weather.visualcrossing.com upon registration, we received the key WGPRB8FQ6XXEJ443NNFGRMYLC*/
public class ParserCiteWeather {
    public Root getWeather(String city) throws IOException {
        String keyCite = "WGPRB8FQ6XXEJ443NNFGRMYLC";
        String cityUrl = city;
        String url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + cityUrl + "?unitGroup=metric&key=" + keyCite + "&contentType=json";
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        Root root = gson.fromJson(jsonReader, Root.class);          //распарсили JSON в класс Root
        //    System.out.println(root);
        return root;

    }
}
