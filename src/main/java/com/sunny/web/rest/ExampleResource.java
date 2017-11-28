package com.sunny.web.rest;


import com.sunny.domain.City;
import com.sunny.domain.Country;
import com.sunny.domain.State;
import com.sunny.service.ExampleService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleResource {

    @Inject
    private ExampleService exampleService;

    @GetMapping("/countries")
    List<Country>getCountries() {
        return exampleService.getCountries();
    }
    @GetMapping("/countries/{id}")
    Country getCountry(@PathVariable int id) {

        return exampleService.getCountry(id);

    }

    @PostMapping("/countries")
    List<Country> createCountry(@RequestBody Country country){
        return exampleService.createCountry(country);
    }
    @DeleteMapping("/countries/{id}")
    List<Country>deleteCountry(@PathVariable int id) {
        return exampleService.deleteCountry(id);
    }
    @PutMapping("/countries/{id}")
    List<Country> updateCountry(@PathVariable int id, @RequestBody Country countryInput) {


        return exampleService.updateCountry(id,countryInput);
    }

    @GetMapping("/states")
    List<State> getStates() {
        return exampleService.getStates();
    }
    @PostMapping("/states")
    List<State> createState(@RequestBody State state) {
        return exampleService.createState(state);
    }

    @GetMapping("/states/{id}")
    State getState(@PathVariable int id) {

        return exampleService.getState(id);
    }
    @DeleteMapping("/states/{id}")
    List<State> deleteState(@PathVariable int id) {

        return exampleService.deleteState(id);
    }
    @PutMapping("/states/{id}")
    List<State> updateState(@PathVariable int id, @RequestBody State stateInput) {

        return exampleService.updateState(id,stateInput);
    }

    @GetMapping("/cities")
    List<City> getCities() {
        return exampleService.getCities();
    }

    @PostMapping("/cities")
    List<City> createCities(@RequestBody City city) {
        return exampleService.createCities(city);
    }
    @GetMapping("/cities/{id}")
    City getCity(@PathVariable int id) {

        return exampleService.getCity(id);
    }
    @DeleteMapping("/cities/{id}")
    List<City> deleteCity(@PathVariable int id) {
        return exampleService.deleteCity(id);
    }
    @PutMapping("/cities/{id}")
    List<City> updateCities(@PathVariable int id, @RequestBody City cityInput) {

        return exampleService.updateCities(id,cityInput);
    }

}
