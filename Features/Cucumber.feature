Feature: Weather api

  Scenario: The client will view weather data for a specific city

  Scenario: The client will view weather data for all cities in specific country


  Scenario: “API should have endpoints to fetch weather of different countries and cities.
  These should be fetched from a text file or database on the server.
  The following endpoints are required:
  GET: /api/{country}/cities - show all cities in the country
  GET: /api/weather/{city_id} - show the weather (eg “24c SUNNY” in the selected city)”

    Given The client in this case the "postman" will use port localhost:8080 to access the weather information.

    When The client will write the name in the in (country) column! Use localhost:8080/weather/Country/cities

    When  The client will write the (city_id) in the in  column! localhost:8080/weather/(city_id)

    Then localhost:8080/weather/{Country}/cities to access all the citys in the given country.

    Then  localhost:8080/weather/{city_id} to access the city you are looking for.
