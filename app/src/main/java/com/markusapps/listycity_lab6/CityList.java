package com.markusapps.listycity_lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *     This is a candidate city to add
     * @throws IllegalArgumentException
     *     If the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This method sorts the list of cities
     * @return
     *     a sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a city is in the list.
     * @param city
     * @return
     *     True if the city is in the list, False if not
     */
    public Boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list
     * @param city
     */
    public void deleteCity(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
