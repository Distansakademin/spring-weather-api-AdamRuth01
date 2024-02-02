package com.example.spring_mysql_api.controllers;

import com.example.spring_mysql_api.exception.MissingForecastException;
import com.example.spring_mysql_api.models.Weather;
import com.example.spring_mysql_api.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
    public Collection<Weather> getByCountry(@PathVariable String country){
      Collection<Weather> result = (Collection<Weather>) weatherService.getByCountry(country);
     if (result.isEmpty()){
       throw new MissingForecastException("No weather data found for country : " + country);
     }else
       return result;
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
    Weather result = weatherService.getByCity_Id(city_Id);
    if (result == null){
      throw new MissingForecastException("No weather data found for city id : " + city_Id);
    }else
      return result;
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
  @ExceptionHandler(MissingForecastException.class)
  public ResponseEntity handleCustomeException(final MissingForecastException ex){
    return new ResponseEntity<>(ex.getMessage(),HttpStatus.OK);
  }
}


