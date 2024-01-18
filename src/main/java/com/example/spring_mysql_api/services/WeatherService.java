package com.example.spring_mysql_api.services;

import com.example.spring_mysql_api.models.Weather;
import com.example.spring_mysql_api.repositories.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class WeatherService {

    @Autowired
    WeatherRepository repository;



    public Iterable<Weather> getAllWeathers() {
        return repository.findAll();
    }
    public Iterable<Weather> getByCountry(String country) {
        return repository.findByCountry(country);
    }
    public Iterable<Weather> getByTemp(double temp) {
        return repository.findByTemp(temp);
    }

    public Iterable<Weather> getByHumi(double humi) {
        return repository.findByHumidity(humi);
    }
    public Iterable<Weather> getCityTemprature(String city) {
        return repository.findCityTemprature(city);
    }
    public Weather getByCity_Id(String city_Id) {
       // int id = Integer.valueOf(city_Id);
        return repository.findById(Integer.valueOf(city_Id));
    }

    public Weather createWeather(Weather weather){
        return repository.save(weather);
    }
    public boolean updateWeatherById(Long id, Weather weather) {
        if (repository.existsById(id)){
            weather.setId(id);
            repository.save(weather);
            return true;
        }else
            return false;
    }
    public boolean deleteWeatherById(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }else
            return false;
    }


    public boolean seed() {
        try {
            Weather[] weathers = {
                    new Weather("Sweden","Stockholm","The temprature is low",5,10,75,"Feels like -1 celsius"),
                    new Weather("Sweden","Halmstad","The temprature is low",15,15,75,"Feels like -1 celsius"),
                    new Weather("Poland","Krakow","The temprature is low",25,14,75,"Feels like -1 celsius"),
                    new Weather("Usa","New York","The temprature is low",55,1,75,"Feels like -1 celsius")

            };
            var weatherList = Arrays.stream(weathers).toList();
            repository.saveAll(weatherList);

        }catch (Exception e){
            System.out.println(e.getMessage());
            return  false;
        }
        return true;
    }



}
