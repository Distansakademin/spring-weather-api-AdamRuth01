package com.example.spring_mysql_api;

import com.example.spring_mysql_api.controllers.WeatherController;
import com.example.spring_mysql_api.models.Weather;
import com.example.spring_mysql_api.services.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import java.util.ArrayList;
import java.util.Arrays;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.matches;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WeatherController.class)
public class WeatherControllerTests {
    @MockBean
    private WeatherService service;

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getAllWeathers() throws Exception {
        when(service.getAllWeathers()).thenReturn(getMockWeathers());
        mockMvc.perform(MockMvcRequestBuilders.get("/weather"))
        .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(4)));
    }

    private void andExpect(StatusResultMatchers status) {
    }

    private static Iterable<Weather> getMockWeathers() {
        Weather[] weathers = {
                new Weather("Sweden", "Stockholm", "The temprature is low", 5, 10, 75, "Feels like -1 celsius"),
                new Weather("Sweden", "Halmstad", "The temprature is low", 15, 15, 10, "Feels like -1 celsius"),
                new Weather("Poland", "Krakow", "The temprature is low", 25, 14, 30, "Feels like -1 celsius"),
                new Weather("Usa", "New York", "The temprature is low", 55, 1, 100, "Feels like -1 celsius")
        };
        return Arrays.stream(weathers).toList();
    }
    private static Iterable<Weather> getMockWeathers1(String country) {
        Iterable<Weather> all = getMockWeathers();
        ArrayList<Weather> result = new ArrayList<>();
        for (Weather obj: all) {
            if (obj.getCountry().equalsIgnoreCase(country))
                result.add(obj);
        }
        return result;
    }

    private static Iterable<Weather> getTempratureMockWeather(double temp){
        Iterable<Weather> all = getMockWeathers();
        ArrayList<Weather> result = new ArrayList<>();

        for (Weather obj: all){
            if (obj.getTemprature() >= temp)
                result.add(obj);
            }
        return result;
        }

    private static Iterable<Weather> getHumidityMockWeather(double humidity){
        Iterable<Weather> all = getMockWeathers();
        ArrayList<Weather> result = new ArrayList<>();

        for (Weather obj: all){
            if (obj.getHumidity() >= humidity)
                result.add(obj);
        }
        return result;
    }

    @Test
    public void getByCountry_ShouldReturnListOfCountrys() throws Exception {
        when(service.getByCountry("Sweden")).thenReturn(getMockWeathers1("Sweden")).getMock();

            mockMvc.perform(MockMvcRequestBuilders.get("/weather/Sweden/cities"))
                    .andExpect(status().isOk())

                    .andExpect(jsonPath("$", hasSize(2)));
    }
    @Test
    public void getByTemprature() throws Exception {

        when(service.getByTemp(12)).thenReturn(getTempratureMockWeather(12)).getMock();

        mockMvc.perform(MockMvcRequestBuilders.get("/weather/temp/12"))
                .andExpect(status().isOk())
                .andExpect((jsonPath("$",hasSize(3))));
    }
    @Test
    public void getByHumidity() throws Exception {
        when(service.getByHumi(40)).thenReturn(getHumidityMockWeather(40)).getMock();

        mockMvc.perform(MockMvcRequestBuilders.get("/weather/humidity/40"))
                .andExpect(status().isOk())
                .andExpect((jsonPath("$",hasSize(2))));
    }
    }


