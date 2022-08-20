# hwurobolab

# HOW TO INSTALL AND RUN HWU ROBOLAB FOR DEVELOPERS AND SYSTEM ADMINISTRATORS:
•	Cloning the Application
Begin by cloning the application repository with:
Gitclone- “$git clone https://github.com/Godfrey2712/hwurobolab.git”

•	Installing the dependencies
It is highly recommended to use a Linux machine. Here is a list of dependencies you need to have on your machine:
1.	Maven:- “sudo apt install maven”
2.	Java SDK:- “sudo apt install default-jdk”
3.	Npm:- “sudo apt install nodejs npm” 

•	Building the Application
After the application is cloned, it should be built out using maven. First get into the application path : “~/openroberta-lab”
Then build the application by using:
“$mvn clean install –DskipTests”
The “-DskipTests” ensure that errors are not thrown during build.

•	Cloning the file-saver
The node js server is inside the cloned directory and named “file-saver”. Enter the directory path.
Once done, build it out by using this command once you are in the server path:
“$npm build”

•	Starting the Web Application and node js Server
The web application is started by:
1.	Get into the application path
2.	Write this command “$./ora.sh start-godfrey-project”
3.	The web application server runs at an IP of 0.0.0. and a port of 1999
4.	You can visualise the application by going to this URL on a web browser:
“http://localhost:1999”            
The node js server is started by:
1.	Get into the file-saver path
2.	Write the command “$npm run”
3.	The server starts and is listening at a port of 500 to the API in the Application
