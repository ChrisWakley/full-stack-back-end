# full-stack-back-end

This Project links with my other repo "full-stack-front-end" to create a full stack project.
The whole project links together to present an Single Page Application, a web based database that gives you a full breakdown of weaponry and armour statistics 
for the online game: Runescape 3.

This particular part of the project contains my API written in Java.

It contains commands to Call, Read, Update and Delete (CRUD) data objects from the central database which is held as a table on mySQL.
I used a CSV file as import data to fill the stats table in mySQL.

I utilised Postman to test the functions/methods as i wrote them and the API itself was written using SpringBoot to make threading it all together easy and neat.

To run this project the following steps need to be taken:

 - Download and install VSCode.
 - Download and install IntelliJ.
 - Download and install mySQL.

 - clone the repo for both front and back ends into a full stack container folder, open the front end project in VSCode in order to see the front end code. open the        back end project in IntelliJ to see the API code.
 - populate a table called: stats in mySQL and import the rs3db.csv file to fill it. Ensure mySQL is running.
 - Run the back end from IntelliJ to utilise the API calls (the front end wont populate at all without this running)
 - run the following commands in VSCode: npm install, npm run start. This will launch the front end website in your local browser.
