package com.example.weatherfx.visualcrossingCite;

import java.util.ArrayList;
/*Class included in Root for getting current weather readings
 */
public class CurrentConditions {
    public String datetime;
    public float datetimeEpoch;
    public double temp;
    public double feelslike;
    public double humidity;
    public double dew;
    public double precip;
    public double precipprob;
    public double snow;
    public double snowdepth;
    public Object preciptype;
    public double windgust;
    public double windspeed;
    public double winddir;
    public double pressure;
    public double visibility;
    public double cloudcover;
    public double solarradiation;
    public Object solarenergy;
    public double uvindex;
    public double severerisk;
    public String conditions;
    public String icon;
    public ArrayList<String>  stations;
    public String source;
    public String sunrise;
    public double sunriseEpoch;
    public String sunset;
    public double sunsetEpoch;
    public double moonphase;

    public CurrentConditions() {
    }

    public CurrentConditions(String datetime, float datetimeEpoch, double temp, double feelslike, double humidity, double dew, double precip, double precipprob, double snow, double snowdepth, Object preciptype, double windgust, double windspeed, double winddir, double pressure, double visibility, double cloudcover, double solarradiation, Object solarenergy, double uvindex, double severerisk, String conditions, String icon, ArrayList<String> stations, String source, String sunrise, double sunriseEpoch, String sunset, double sunsetEpoch, double moonphase) {
        this.datetime = datetime;
        this.datetimeEpoch = datetimeEpoch;
        this.temp = temp;
        this.feelslike = feelslike;
        this.humidity = humidity;
        this.dew = dew;
        this.precip = precip;
        this.precipprob = precipprob;
        this.snow = snow;
        this.snowdepth = snowdepth;
        this.preciptype = preciptype;
        this.windgust = windgust;
        this.windspeed = windspeed;
        this.winddir = winddir;
        this.pressure = pressure;
        this.visibility = visibility;
        this.cloudcover = cloudcover;
        this.solarradiation = solarradiation;
        this.solarenergy = solarenergy;
        this.uvindex = uvindex;
        this.severerisk = severerisk;
        this.conditions = conditions;
        this.icon = icon;
        this.stations = stations;
        this.source = source;
        this.sunrise = sunrise;
        this.sunriseEpoch = sunriseEpoch;
        this.sunset = sunset;
        this.sunsetEpoch = sunsetEpoch;
        this.moonphase = moonphase;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public float getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(float datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(double feelslike) {
        this.feelslike = feelslike;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getDew() {
        return dew;
    }

    public void setDew(double dew) {
        this.dew = dew;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }

    public double getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(double precipprob) {
        this.precipprob = precipprob;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(double snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Object getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(Object preciptype) {
        this.preciptype = preciptype;
    }

    public double getWindgust() {
        return windgust;
    }

    public void setWindgust(double windgust) {
        this.windgust = windgust;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }

    public double getWinddir() {
        return winddir;
    }

    public void setWinddir(double winddir) {
        this.winddir = winddir;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public double getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(double solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Object getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(Object solarenergy) {
        this.solarenergy = solarenergy;
    }

    public double getUvindex() {
        return uvindex;
    }

    public void setUvindex(double uvindex) {
        this.uvindex = uvindex;
    }

    public double getSevererisk() {
        return severerisk;
    }

    public void setSevererisk(double severerisk) {
        this.severerisk = severerisk;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ArrayList<String> getStations() {
        return stations;
    }

    public void setStations(ArrayList<String> stations) {
        this.stations = stations;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public double getSunriseEpoch() {
        return sunriseEpoch;
    }

    public void setSunriseEpoch(double sunriseEpoch) {
        this.sunriseEpoch = sunriseEpoch;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public double getSunsetEpoch() {
        return sunsetEpoch;
    }

    public void setSunsetEpoch(double sunsetEpoch) {
        this.sunsetEpoch = sunsetEpoch;
    }

    public double getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(double moonphase) {
        this.moonphase = moonphase;
    }

    @Override
    public String toString() {
        return "CurrentConditions{" +
                "datetime='" + datetime + '\'' +
                ", datetimeEpoch=" + datetimeEpoch +
                ", temp=" + temp +
                ", feelslike=" + feelslike +
                ", humidity=" + humidity +
                ", dew=" + dew +
                ", precip=" + precip +
                ", precipprob=" + precipprob +
                ", snow=" + snow +
                ", snowdepth=" + snowdepth +
                ", preciptype=" + preciptype +
                ", windgust=" + windgust +
                ", windspeed=" + windspeed +
                ", winddir=" + winddir +
                ", pressure=" + pressure +
                ", visibility=" + visibility +
                ", cloudcover=" + cloudcover +
                ", solarradiation=" + solarradiation +
                ", solarenergy=" + solarenergy +
                ", uvindex=" + uvindex +
                ", severerisk=" + severerisk +
                ", conditions='" + conditions + '\'' +
                ", icon='" + icon + '\'' +
                ", stations=" + stations +
                ", source='" + source + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunriseEpoch=" + sunriseEpoch +
                ", sunset='" + sunset + '\'' +
                ", sunsetEpoch=" + sunsetEpoch +
                ", moonphase=" + moonphase +
                '}';
    }
}
