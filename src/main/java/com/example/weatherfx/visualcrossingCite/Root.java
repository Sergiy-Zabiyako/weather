package com.example.weatherfx.visualcrossingCite;

import java.util.ArrayList;

/*Basic class for parsing Json
 */
public class Root {
    public double queryCost;
    public double latitude;
    public double longitude;
    public String resolvedAddress;
    public String address;
    public String timezone;
    public double tzoffset;
    public String description;
    public ArrayList<Day> days;
    public ArrayList<Object> alerts;
    public CurrentConditions currentConditions;

    public Root() {
    }

    public Root(double queryCost, double latitude, double longitude, String resolvedAddress, String address, String timezone, double tzoffset, String description, ArrayList<Day> days, ArrayList<Object> alerts, CurrentConditions currentConditions) {
        this.queryCost = queryCost;
        this.latitude = latitude;
        this.longitude = longitude;
        this.resolvedAddress = resolvedAddress;
        this.address = address;
        this.timezone = timezone;
        this.tzoffset = tzoffset;
        this.description = description;
        this.days = days;
        this.alerts = alerts;
        this.currentConditions = currentConditions;
    }

    public double getQueryCost() {
        return queryCost;
    }

    public void setQueryCost(double queryCost) {
        this.queryCost = queryCost;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getResolvedAddress() {
        return resolvedAddress;
    }

    public void setResolvedAddress(String resolvedAddress) {
        this.resolvedAddress = resolvedAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public double getTzoffset() {
        return tzoffset;
    }

    public void setTzoffset(double tzoffset) {
        this.tzoffset = tzoffset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public ArrayList<Object> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<Object> alerts) {
        this.alerts = alerts;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    @Override
    public String toString() {
        return "Root{" +
                "queryCost=" + queryCost +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", resolvedAddress='" + resolvedAddress + '\'' +
                ", address='" + address + '\'' +
                ", timezone='" + timezone + '\'' +
                ", tzoffset=" + tzoffset +
                ", description='" + description + '\'' +
                ", days=" + days +
                ", alerts=" + alerts +
                ", currentConditions=" + currentConditions +
                '}';
    }
}

