package com.example.spring_mysql_api;

import com.example.spring_mysql_api.controllers.WeatherController;
import com.example.spring_mysql_api.models.Weather;
import com.example.spring_mysql_api.services.WeatherService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
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
    public void getAllWeathers_ShouldReturnListOfWeathers() throws Exception {
        when(service.getAllWeathers()).thenReturn(getMockWeathers());

        mockMvc.perform(MockMvcRequestBuilders.get("/weather"))
        .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(4)));
    }

    private void andExpect(StatusResultMatchers status) {
    }

    private static Iterable<Weather> getMockWeathers() {
        Weather[] weathers = {
                new Weather("Test weather 1", "Stockholm", "The temprature is low", 5, 10, 75, "Feels like -1 celsius"),
                new Weather("Test weather 2", "Halmstad", "The temprature is low", 15, 15, 10, "Feels like -1 celsius"),
                new Weather("Test weather 3", "Krakow", "The temprature is low", 25, 14, 30, "Feels like -1 celsius"),
                new Weather("Test weather 4", "New York", "The temprature is low", 55, 1, 100, "Feels like -1 celsius")
        };
        return Arrays.stream(weathers).toList();
    }
}
