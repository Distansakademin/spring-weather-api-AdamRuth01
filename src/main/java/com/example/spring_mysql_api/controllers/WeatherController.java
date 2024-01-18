package com.example.spring_mysql_api.controllers;

import com.example.spring_mysql_api.models.Weather;
import com.example.spring_mysql_api.services.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    //GET: localhost8080:/weather
  @GetMapping
    public Iterable<Weather> getAllWeathers(){
        return weatherService.getAllWeathers();
    }
    @GetMapping("/{country}/cities")
    public Iterable<Weather> getByCountry(@PathVariable String country){
        return weatherService.getByCountry(country);
    }
    @GetMapping("/temp/{temp}")
    public Iterable<Weather> getByTemprature(@PathVariable String temp){
      double tmp = Double.valueOf(temp);
        return weatherService.getByTemp(tmp);
    }
    @GetMapping("/humidity/{humidity}")
    public Iterable<Weather> getByHumidity(@PathVariable String humidity){
    double humi = Double.valueOf(humidity);
    return weatherService.getByHumi(humi);
    }
  @GetMapping("/{city_Id}")
  public Weather getCityWeather(@PathVariable String city_Id){
    System.out.println("In get city weather"+city_Id);
    return weatherService.getByCity_Id(city_Id);
  }
    //POST: localhost8080:/weather
    @PostMapping
    public Weather postWeather(@RequestBody Weather weather){
     return weatherService.createWeather(weather);
    }

    @PutMapping("/{id}")
    public boolean putWeather(@PathVariable Long id, @RequestBody Weather weather){
      return weatherService.updateWeatherById(id,weather);
    }

    @DeleteMapping("/{id}")
    public boolean deleteWeather(@PathVariable Long id){
      return weatherService.deleteWeatherById(id);
    }


    @PutMapping("/seed")
    public boolean posSeedWeather(){
      return weatherService.seed();
    }







}
