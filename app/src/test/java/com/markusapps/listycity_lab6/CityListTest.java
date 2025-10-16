package com.markusapps.listycity_lab6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CityListTest {
    public City mockCity() {
        return new City("Edmonton", "AB");
    }

    public CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City c = new City("Regina", "SK");
        cityList.add(c);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));
    }

    @Test
    public void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City c = new City("Charlottetown", "PEI");
        cityList.add(c);
        assertEquals(0, c.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    public void testAddException() {
        CityList cityList = mockCityList();
        City c  = new City("Yellowknife", "NWT");
        cityList.add(c);
        assertThrows(IllegalArgumentException.class, () -> {cityList.add(c);});
    }

    @Test
    public void testHasCity() {
        CityList cityList = mockCityList();
        City c = new City("Vancouver", "BC");
        City c2 = new City("Toronto", "ON");
        cityList.add(c);
        assertEquals(true, cityList.hasCity(c));
        assertEquals(false, cityList.hasCity(c2));
    }

    @Test
    public void testDeleteCity() {
        CityList cityList = mockCityList();
        City c = new City("Sherwood Park", "AB");
        cityList.add(c);
        assertEquals(true, cityList.hasCity(c));
        cityList.deleteCity(c);
        assertEquals(false, cityList.hasCity(c));
    }

}
