package com.example.spring_mysql_api;

import com.example.spring_mysql_api.controllers.WeatherController;
import com.example.spring_mysql_api.models.Weather;
import com.example.spring_mysql_api.repositories.WeatherRepository;
import com.example.spring_mysql_api.services.WeatherService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

@SpringBootTest
class SpringMysqlApiApplicationTests {


	@Test
	void contextLoads() {
	}

}
