package com.example.weatherfx.visualcrossingCite;

import java.util.ArrayList;
/*Class, incoming array Days - CurrentCondition - Root, to get readings for the next 15 days
 */
public class Day {
    public String datetime;
    public int datetimeEpoch;
    public double tempmax;
    public double tempmin;
    public double temp;
    public double feelslikemax;
    public double feelslikemin;
    public double feelslike;
    public double dew;
    public double humidity;
    public double precip;
    public double precipprob;
    public double precipcover;
    public Object preciptype;
    public double snow;
    public double snowdepth;
    public double windgust;
    public double windspeed;
    public double winddir;
    public double pressure;
    public double cloudcover;
    public double visibility;
    public double solarradiation;
    public double solarenergy;
    public double uvindex;
    public double severerisk;
    public String sunrise;
    public double sunriseEpoch;
    public String sunset;
    public double sunsetEpoch;
    public double moonphase;
    public String conditions;
    public String description;
    public String icon;
    public ArrayList<String> stations;
    public String source;
    public ArrayList<Hour> hours;

    public Day() {
    }

    public Day(String datetime, int datetimeEpoch, double tempmax, double tempmin, double temp, double feelslikemax, double feelslikemin, double feelslike, double dew, double humidity, double precip, double precipprob, double precipcover, Object preciptype, double snow, double snowdepth, double windgust, double windspeed, double winddir, double pressure, double cloudcover, double visibility, double solarradiation, double solarenergy, double uvindex, double severerisk, String sunrise, double sunriseEpoch, String sunset, double sunsetEpoch, double moonphase, String conditions, String description, String icon, ArrayList<String> stations, String source, ArrayList<Hour> hours) {
        this.datetime = datetime;
        this.datetimeEpoch = datetimeEpoch;
        this.tempmax = tempmax;
        this.tempmin = tempmin;
        this.temp = temp;
        this.feelslikemax = feelslikemax;
        this.feelslikemin = feelslikemin;
        this.feelslike = feelslike;
        this.dew = dew;
        this.humidity = humidity;
        this.precip = precip;
        this.precipprob = precipprob;
        this.precipcover = precipcover;
        this.preciptype = preciptype;
        this.snow = snow;
        this.snowdepth = snowdepth;
        this.windgust = windgust;
        this.windspeed = windspeed;
        this.winddir = winddir;
        this.pressure = pressure;
        this.cloudcover = cloudcover;
        this.visibility = visibility;
        this.solarradiation = solarradiation;
        this.solarenergy = solarenergy;
        this.uvindex = uvindex;
        this.severerisk = severerisk;
        this.sunrise = sunrise;
        this.sunriseEpoch = sunriseEpoch;
        this.sunset = sunset;
        this.sunsetEpoch = sunsetEpoch;
        this.moonphase = moonphase;
        this.conditions = conditions;
        this.description = description;
        this.icon = icon;
        this.stations = stations;
        this.source = source;
        this.hours = hours;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(int datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public double getTempmax() {
        return tempmax;
    }

    public void setTempmax(double tempmax) {
        this.tempmax = tempmax;
    }

    public double getTempmin() {
        return tempmin;
    }

    public void setTempmin(double tempmin) {
        this.tempmin = tempmin;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelslikemax() {
        return feelslikemax;
    }

    public void setFeelslikemax(double feelslikemax) {
        this.feelslikemax = feelslikemax;
    }

    public double getFeelslikemin() {
        return feelslikemin;
    }

    public void setFeelslikemin(double feelslikemin) {
        this.feelslikemin = feelslikemin;
    }

    public double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(double feelslike) {
        this.feelslike = feelslike;
    }

    public double getDew() {
        return dew;
    }

    public void setDew(double dew) {
        this.dew = dew;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
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

    public double getPrecipcover() {
        return precipcover;
    }

    public void setPrecipcover(double precipcover) {
        this.precipcover = precipcover;
    }

    public Object getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(Object preciptype) {
        this.preciptype = preciptype;
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

    public double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(double solarradiation) {
        this.solarradiation = solarradiation;
    }

    public double getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(double solarenergy) {
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

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ArrayList<Hour> getHours() {
        return hours;
    }

    public void setHours(ArrayList<Hour> hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Day{" +
                "datetime='" + datetime + '\'' +
                ", datetimeEpoch=" + datetimeEpoch +
                ", tempmax=" + tempmax +
                ", tempmin=" + tempmin +
                ", temp=" + temp +
                ", feelslikemax=" + feelslikemax +
                ", feelslikemin=" + feelslikemin +
                ", feelslike=" + feelslike +
                ", dew=" + dew +
                ", humidity=" + humidity +
                ", precip=" + precip +
                ", precipprob=" + precipprob +
                ", precipcover=" + precipcover +
                ", preciptype=" + preciptype +
                ", snow=" + snow +
                ", snowdepth=" + snowdepth +
                ", windgust=" + windgust +
                ", windspeed=" + windspeed +
                ", winddir=" + winddir +
                ", pressure=" + pressure +
                ", cloudcover=" + cloudcover +
                ", visibility=" + visibility +
                ", solarradiation=" + solarradiation +
                ", solarenergy=" + solarenergy +
                ", uvindex=" + uvindex +
                ", severerisk=" + severerisk +
                ", sunrise='" + sunrise + '\'' +
                ", sunriseEpoch=" + sunriseEpoch +
                ", sunset='" + sunset + '\'' +
                ", sunsetEpoch=" + sunsetEpoch +
                ", moonphase=" + moonphase +
                ", conditions='" + conditions + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", stations=" + stations +
                ", source='" + source + '\'' +
                ", hours=" + hours +
                '}';
    }
}
