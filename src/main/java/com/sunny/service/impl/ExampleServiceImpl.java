package com.sunny.service.impl;

import com.sunny.domain.*;
import com.sunny.service.ExampleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleServiceImpl implements ExampleService{
    private List<Country> countries = new ArrayList<Country>();
    private List<State> states = new ArrayList<State>();
    private List<City> cities = new ArrayList<City>();


    @Override
    public List<Country> createCountry(Country country) {
        countries.add(country);
        return countries;
    }

    @Override
    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public Country getCountry(int id) {

        Country finalCountry = null;

        for (Country country:countries) {
            if(country.getId()==id){
                finalCountry = country;
                break;

            }
        }
        return finalCountry;
    }

    @Override
    public List<Country> deleteCountry(int id) {



        for (Country country:countries) {
            if(country.getId()==id){
                countries.remove(country);
                break;

            }
        }

        return countries;
    }

    @Override
    public List<Country> updateCountry(int id,Country countryInput) {



        for (Country country:countries) {
            if(country.getId()==id){
                country.setId(countryInput.getId());
                country.setName(countryInput.getName());
                break;

            }
        }

        return countries;
    }

    @Override
    public List<State> getStates() {
        return states;
    }

    @Override
    public List<State> createState(State state) {
        states.add(state);
        return states;
    }

    @Override
    public State getState(int id) {

        State finalState = null;

        for (State state : states) {
            if (state.getId() == id) {
                finalState = state;
                break;

            }
        }
        return finalState;
    }

    @Override
    public List<State> deleteState(int id) {



        for (State state:states) {
            if(state.getId()==id){
                states.remove(state);
                break;

            }
        }

        return states;
    }

    @Override
    public List<State> updateState(int id,State stateInput) {



        for (State state:states) {
            if(state.getId()==id){
                state.setId(stateInput.getId());
                state.setName(stateInput.getName());
                break;

            }
        }

        return states;
    }

    @Override
    public List<City> getCities() {
        return cities;
    }

    @Override
    public List<City> createCities(City city) {
        cities.add(city);
        return cities;
    }

    @Override
   public City getCity(int id) {

        City finalCity = null;

        for (City city : cities) {
            if (city.getId() == id) {
                finalCity = city;
                break;

            }
        }
        return finalCity;
    }

    @Override
   public List<City> deleteCity(int id) {



        for (City city:cities) {
            if(city.getId()==id){
                cities.remove(city);
                break;

            }
        }
        return cities;
    }

    @Override
    public List<City> updateCities(int id,City cityInput) {



        for (City city:cities) {
            if(city.getId()==id){
                city.setId(cityInput.getId());
                city.setName(cityInput.getName());
                break;

            }
        }

        return cities;
    }
}
