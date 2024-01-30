

<!-- TABLE OF CONTENTS -->

## Table Of Contents
- --
* [About The Project](#about-the-project)
* [Description: When You Run The Program](#description-when-you-run-the-program)
* [Installation](#what-is-requiredinstallation)
* [GitHub Push/Pull](#github-pushpull-request)
* [Basic Overview](#basic-overview)
* [How To Use](#how-to-use)
* [UML](#uml)
* [Test class](#test-class)
* [Notes](#notes)
* [__Contacts__](#contact)
- --

## _About The Project_:

- The main purpose of this Springboot project, is to receive and display for the client __(*weathers*)__ for __country's__ and the *__cities__ in the __countrys__*.
- The client can run the application through a (_dockerfile_)[Docker](#how-to-use-docker)
- The (_Cucumber-file_) describe the scenarios the client is expecting for the function of the application. [Cucumber](#how-to-use)
-  ***building/development with TDD/BDD***.
- The deployment tests (_CI/CD_) has been through configuration by (_auto-update when a push from github-desktop is done_) the deployment is checked by (*ACTIONS*) on *GITHUB*. (directory)[Workflows](#how-to-use)
- The project has one repository
---
* (_directory_) [Repositories](#how-to-use)
- - **WeatherRepository**

- The project has six classes:
---
* (_directory_)[Controllers](#how-to-use)
- - **WeatherController**
---
* (_directory_) [Models](#how-to-use)
- - **Weather**
---
* (_directory_) [Services](#how-to-use)
- - **WeatherService**
- - **SpringMysqlApiApplication**
---
  - The project has one test class for WeatherController.
* (_directory_) [Tests](#how-to-use)

* [Test class](#test-class)
- - **SpringMysqlApiApplicationTests**
- - **WeatherControllerTests**
- --
## _Description: When You Run The Program_:

## Main description:
#### What you need general steps:
1. First of all you need to run the installation process --> [Installation](#what-is-requiredinstallation)
2. 

- - In the console there are five options
1. Create a recipe
2. Display the recipe
3. Search the by category
4. Search recipe by ingredient
5. Delete recipe
6. Close the book
- - This six choices makes us  be able to __add, display, different search options and delete recipes!__
- - Follow the instructions in the console after making the choices.
- - I don't have a file or database. So after each and evert run is finished the input data will be deleted because of the storage is in a __ArrayList__.

- -- 
## _What Is Required/Installation_:

1. Check in (_*Linux*_) or (_*Ubuntu*_) if java is installed by using command (__java -version__)
2. Installation  of (__Intellij__) or an integrated Development Environments (IDE).
3. Check in (_*Linux*_) or (_*Ubuntu*_) if the version exist by using command --version
4. Next designation to type in is: (__sudo apt install openjdk-19-jdk-headless__). You can install more types of java versions by enter
   designation __(sudo update-alternatives --config java__).
5. Then chose which version you want, auto or manual will of the versions will pop up as a choice! Please enter the  auto version.
- --
#### Installation of spring and requirement for the whole cycles domains for the application
1. Step one is to develop your spring environment I did it by using _(*Spring initializer*)_ [https://start.spring.io/;](https://start.spring.io/;)
2. Step two is to download DB-gate and _(*DB-gate*)_ [https://dbgate.org/](https://dbgate.org/)
3. Step three download mysql and use the tutorial on the website _(*MYsql*)_ [https://www.mysql.com/](https://www.mysql.com/)
4. Step four is to download the client/(_Postman_)! [https://www.postman.com/](https://www.postman.com/)
5. Step five is to download _*DOCKER*_ [https://hub.docker.com/](https://hub.docker.com/)
___
#### Other inclusions that are not dependent on installation
- _Short list of other_
1. For UML diagrams I used and recommend (_*Draw.io*_) [https://www.drawio.com/](https://www.drawio.com/)
---
##### Github Push/Pull request

The code is private but reach me in my contact link for fork/clone of the code.
- --
## _Basic Overview_:

###### __the meaning of the program is that we make a recipe book in order to create recipes in a recipe book. As well as come up with different methods to handle different options with the help of different methods. But the main part is TDD and test by Junit.__
- --
## _How To Use_:

## _How To Use Docker_:

- First of all you have to create a docker file in your project.
- In order for the docker file to work you need to have the right commands, you find them in my docker file.
#### General description for docker
_*Docker description*_: 
- `Docker is `

#### Short (_description_):
* How to use the code, you need to understand how its build. `Recommendations is to read the code or debug it to get an idea of the course of events.`
* Otherwise, if concerns or problems occurs, please contact me in my contacts links. _*Or ask AI*_


- --
## _UML_:

![Uml screenshot1.](img.png)
![Uml screenshot2.](img_1.png)
![Uml screenshot3.](img_2.png)
- --
## _Test class_:

* (__RecipeBook__) has four methods which were built through __tdd.__ To shape the program and using assert/assertEquals for the safety reasons for development of the program!
* #### _Methods_:
1. (`addRecipe()`) is used to test _add_ an object to a hashMap and then see that the number of objects matches how many there are in the hasMap.
2. (`searchByCategory()`) is used to test a _search_ for a category using assertEquals, we see if actual versus expected match each other, in this case steak is the category we are testing.
3. (`searchByIngredient()`) has the same pricebales as _searchCategory_ but in this case we have to jump in __UsedIngredient__ to reach the ingredient name as in this case in expected is _water_.
4. (`deleteRecipe`) first of all we create an object of RecipeBook in this case we call the object _book_ we use _book.addRecipe_ and add the object in the ArrayList.
   Next step is declare two int variables (and call _book.deleteRecipe_) then call in assetEquals the two int variables before and after.
   _int before_ (-1) because _int after_ is 0.
- --
## _Notes_:

- __The project was fun to work with and develop.__
- __It's important to follow the instructions in the console!__

- --
<!-- CONTACT -->
## Contact

Feel free to reach out to me with questions comments, or concerns at one of the ways below.

Email: adam.ruth01@gmail.com

LinkedIn Link: ${https://www.linkedin.com/in/adam-ruth-646580299?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BwjaXaQ2GTmSnOFVUzia3VA%3D%3D}

GitHub Link: https://github.com/AdamRuth01
- --