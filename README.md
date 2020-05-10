# tableView_v1
Dashboard

A Tableview that runs queries via a SQL backend. This application is for users who do not wish to use SQL queries to obtain information.

**Steps to get application started.**<br><br>
      1. Upon download of the application; install Wamp server (or any server software you prefer).<br>
            http://www.wampserver.com/en/<br><br>
      2. Open the application with whatever IDE you prefer( I used IntelliJ Idea community version). Also be sure to have the jdbc.driver installed.<br>
            https://www.jetbrains.com/idea/download/#section=windows<br>
            https://dev.mysql.com/downloads/connector/j/<br><br>
      3. Once the application is opened in your IDE; navigate to the dbConnection method found in the Controller.java file. Once there; set your path in the String url variable, your username and password which by default is "root" and "passsword" ( change information once logged in).<br><br>
      ![Screen](https://github.com/fowler-mychale/tableView_v1/blob/master/dbConnect.PNG?raw=true)<br><br>
      4. Once this step is completed; Open the Wamp server application and run the program.By clicking on the "query_1" button located on the left of the application. If your tables are set to correspond with what is in the sample.xml and Controller.java file; the information should populate. In my case it is MemberID, FullName, EmailAddress, DateOfBirth, MailingAddress, and Registered(Note: you will need to set this information in phpmyadmin. You can access this by right clikcing in wamp server icon located at the bottom right of the windows taskbar and locating the phpMyAdmin option)<br><br>
      
      
      Populated table.
![Screen](https://github.com/fowler-mychale/tableView_v1/blob/master/Capture.PNG?raw=true)

### Tools used for this project
-Java
-JavaFX/CSS
-MYSQL Workbench
