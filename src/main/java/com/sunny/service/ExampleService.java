package com.sunny.service;

import java.util.List;
import com.sunny.domain.*;

public interface ExampleService {
    List<Country> getCountries();
    Country getCountry(int id);
    List<Country> createCountry(Country country);
    List<Country> deleteCountry(int id);
    List<Country> updateCountry(int id,Country countryInput);
    List<State> getStates();
    List<State> createState(State state);
    State getState(int id);
    List<State> deleteState(int id);
    List<State> updateState(int id,State stateInput);
    List<City> getCities();
    List<City> createCities(City city);
    City getCity(int id);
    List<City> deleteCity(int id);
    List<City> updateCities(int id, City cityInput);

}
