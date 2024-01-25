Feature: Weather api
#This scenario is for function (Get) allWeathers() in controller ( localhost:8080/weather )
  Scenario: The client's purpose is to receive all the weather information, (in this case all the weathers objects in the database)

    Given The client in this case postman will use port localhost:8080 to access the weather information.

    When The client in this case "postman" will use (Get) port localhost:8080/weather

    Then localhost:8080/weather will receive all existing weathers and display them for the client.


#This scenario is for function (Get) getByCountry() in controller ( localhost:8080/weather/{country}/cities)
  Scenario: The client will view weather data for a specific Country and the given country will show all cities in the country

    Given The client in this case the "postman" will use port localhost:8080 to access the weather information.

    When The client will write the name in the in {country} column! Use (Get) localhost:8080/weather/{Country}/cities

    Then localhost:8080/weather/{Country}/cities to access all the citys in the given country.



  Scenario: The client will view weather data for all cities in specific country
#This scenario is for function (Get) getCityWeathers()  for given city_id in controller ( localhost:8080/weather/{city_id} )
    Given The client in this case the "postman" will use port localhost:8080 to access the weather information.

    When The client will write the {city_id} in the in  column!Use (Get) localhost:8080/weather/{city_id}

    Then localhost:8080/weather/{city_id} to access the city you are looking for.



    Scenario: The client will view weather data for all the tempratures that is greater then the given number
      #This scenario is for function (GET) getTemprature() if temprature is greater the function will sort the given objects receive the matching weathers
      Given The client in this case "postman" will use port localhost:8080 to access the weather information.

      When The client will write the {temprature} in the colum! Use (Get) localhost:8080/weather/temp/{temp}

      Then localhost:8080/weather/temp/{temp} to access the tempraures  and where they are located

      Scenario: The client will view weather data for all the tempratures that is greater then the given number
        #This scenario is for function (GET) getByHumidity() if humidity is greater the function will sort the given objects and receive the matching weathers
      Given The client in this case "postman" will use port localhost:8080 to access the weather information.

      When When The client will write the {humidity} in the colum! Use (Get) localhost:8080/weather/humidity/{humidity}

      Then  localhost:8080/weather/humidity/{humidity} to access the humidity you are looking for and where the humidity are located






