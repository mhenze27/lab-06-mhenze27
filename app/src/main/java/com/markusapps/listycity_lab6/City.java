package com.markusapps.listycity_lab6;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Initializes the an instance of the city.
     * @param city
     * @param province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This method returns the city name.
     * @return
     *     city
     */
    String getCityName() {
        return this.city;
    }

    /**
     * This method returns the province name.
     * @return
     *     province
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * This method compares City objects based on their city name field.
     * @param o the object to be compared.
     * @return 0, -1, or 1 if two values are equal, less than or greater than
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }
}
