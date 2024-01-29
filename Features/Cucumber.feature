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

      Scenario: The client will (POST) and create a new weather!
        #The scenario is for function (POST) postWeather()

      Given The client in this case "postman" will create a new weather by change the methode to (POST)

      When The client will add a new weather by write localhost:8080/weather , the client need to chose (body instead  pharams) then click on (raw) and chose (JSON) instead of (text)
      And write the variabels for each colum but without an (Id), its auto-generated in the database.

      Then in this case the client will click on send, moments later the weather is uploaded in the database.

      Scenario: The client will (PUT) and update an existing weather.

      Given The client  in this case "postman" will update a weather.

      When The client will use (PUT) as methode and localhost:8080/weather/{id} and chose witch  weather information to update by chose the id.
      And  the client need to chose (body instead  pharams) then click on (raw) and chose (JSON) instead of (text)

      Then The client will recieve true if the update was a succes.

        Scenario: The Client will use (Delete) and delete an existing weather by id.
          Given The client in this case the "postman" will delete a weather.

          When The client will use (DELETE) as methode and insert chosen id to delete the weather.
          And write localhost:8080/weather/{id} and the given id to delete the weather from the database.

          Then The client will recieve true if the delete was a succes.

          Scenario: The client has a given function for test 