Hello and welcome! 

The files and sub-directories under this directory belong to a sample 
application named, Time Expression.  This is built using:

- the Spring Framework (http://springframework.org/)
- Hibernate (http://hibernate.org/)
- HSQLDB (http://hsqldb.org)
- Display Tag (http://displaytag.sourceforge.net)

...and other open source Java tools.

The 3 key projects in this directory can be found under these sub-directories:

1. timex/ - Time Expression (timex/ sub-directory - through chapter 7)
2. timex2/ - Time Expression, refactored version (chapter 10)
3. springhibernate/ - Spring+Hibernate integration demo (Chapter 10)

These have been taken directly from Anil Hemrajani's book on Rapid Open Source
Java Development (details available at visualpatterns.com). The rest of this
page provides some additional information about these projects.


Enjoy,
Anil Hemrajani

------------------------------------------------------------------------------------------------
Note: You may wish to visit visualpatterns.com for potential updates.  
------------------------------------------------------------------------------------------------

 
1) timex/ and timex2/
=====================
See Chapter 2, "The Sample Application: An Online Timesheet System"
See Chapter 3, "XP and AMDD Based Architecture and Design Modeling"

This section is related to the sample application named, Time Expression
introduced in chapter 2 of book.  Note, timex2/ contains almost the same 
files as timex/, except refactored to leverage Spring's declarative 
transaction management, the displaytag tag library, etc.  Since both 
directories are very similar, I have only listed the key files/directories 
for timex/ next:

rapidjava/lib (stored here to make bookcode.zip smaller; typically under timex/)
rapidjava/timex/antextras.xml
rapidjava/timex/build.xml
rapidjava/timex/local.properties
rapidjava/timex/README.txt
rapidjava/timex/timexhsqldb.xml
rapidjava/timex/data
rapidjava/timex/dist
rapidjava/timex/src/java/com/visualpatterns/timex/controller
rapidjava/timex/src/java/com/visualpatterns/timex/job
rapidjava/timex/src/java/com/visualpatterns/timex/model
rapidjava/timex/src/java/com/visualpatterns/timex/test
rapidjava/timex/src/java/com/visualpatterns/timex/util
rapidjava/timex/src/java/com/visualpatterns/timex/view

Exploded web application directory:
rapidjava/timex/build/timex/WEB-INF/classes
rapidjava/timex/build/timex/WEB-INF/jsp
rapidjava/timex/build/timex/WEB-INF/lib

[To Test The Application]
1. Change directory (cd) to rapidjava/timex/
2. Build/deploy timex.war (or timex2.war) to web/application server 
   - Tweak deploy.dir key=value in local.properties file, as shown in this example:
           deploy.dir=/apache-tomcat-5.5.15/webapps
   - Run "ant deploy"
3. Start HSQLDB server (ant -f timexhsqldb.xml starthsql)
	See Chapter 5, "Using Hibernate For Persistent Objects"
4. Start Tomcat or your own web/application server
	See Chapter 7, "The Spring Web MVC Framework"
	See Chapter 8, "The Eclipse Phenomenon"
5. Connect using something like http://localhost:8080/timex/ (or timex2/).
6. Login using the following credentials:
   Employee id: 1
   Password: rapidjava
7. Other options:
   a. Run HSQLDB manager to browse our database:
      ant -f timexhsqldb.xml hsqldm
      Type: Server
      URL: jdbc:hsqldb:hsql://localhost:9005/timex
   b. See Chapter 8 for details on how to create an Eclipse project from 
      an existing Ant build file.  Eclipse will enable you to start Tomcat,
      build/deploy our war files, debug the application, browse/edit the
      Java code, explore the database, and much more -- all from within 
      one IDE!  For example, you can create 3 separate projects using the
      3 build.xml files found in the timex/, timex2 and springhibernate/
      directories. If you do create the projects in Eclipse (which I highly
      recommend doing), be sure to link our build.xml files in the "Ant"
      view and also "Add Spring Project Nature" for the 3 projects (see 
      Chapter 8 for details).
   c. Run ant -f timexhsqldb.xml execddl to recreate the test data
   
------------------------------------------------------------------------------------------------



2) springhibernate/
===================
See Chapter 10, "Beyond The Basics"

This directory files to demo how the Spring+Hibernate integration works.
By integrating Hibernate with Spring, you can a lot of benefits such as
declarative transaction management, easier testing by swapping out session
factory, and more.

The following are some key files/directories related to this demo:

rapidjava/lib (stored here to make bookcode.zip smaller; typically under springhibernate/)
rapidjava/springhibernate/build
rapidjava/springhibernate/conf
rapidjava/springhibernate/src
rapidjava/springhibernate/build/springhibernate/WEB-INF/classes
rapidjava/springhibernate/build/springhibernate/WEB-INF/jsp
rapidjava/springhibernate/build/springhibernate/WEB-INF/lib
rapidjava/springhibernate/build/springhibernate/WEB-INF/classes/controller
rapidjava/springhibernate/build/springhibernate/WEB-INF/classes/model
rapidjava/springhibernate/build/springhibernate/WEB-INF/classes/view
rapidjava/springhibernate/src/controller
rapidjava/springhibernate/src/model
rapidjava/springhibernate/src/view

[To Test The Application]
1. Change directory (cd) to rapidjava/springhibernate/
2. Build/deploy springhibernate.war to web/application server 
   - Tweak deploy.dir property in the build.xml file; as shown in this example:
          <property name="deploy.dir" value="/apache-tomcat-5.5.15/webapps" />
   - Run "ant deploy"
3. Start HSQLDB server from timex/ or timex2/ directory
   (ant -f timexhsqldb.xml starthsql)
	See Chapter 5, "Using Hibernate For Persistent Objects"
4. Start Tomcat or your own web/application server
	See Chapter 7, "The Spring Web MVC Framework"
	See Chapter 8, "The Eclipse Phenomenon"
5. Connect using something like 
	http://localhost:8080/springhibernate/timesheetsave1.htm
	http://localhost:8080/springhibernate/timesheetsave2.htm

   Note, if you invoke these URLs in sequence, you will be able to see a 
   demo of how Spring redirects mapped exceptions to web pages.  For example,
   timesheetsave1.htm will save a record; timesheetsave2 will try to add 
   the same record again thereby causing the following exception:

           org.springframework.dao.DataIntegrityViolationException

   Of course, this also demonstrates Spring's consistent data exception handling.
   Visit springframework.org for details.
------------------------------------------------------------------------------------------------
Visit http://visualpatterns.com for potential updates.