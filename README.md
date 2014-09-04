## HawkSuite eCommerce Site

### Setup

The following software will need to be installed prior to running this project

1. [git](http://git-scm.com/download)
2. [Apache Maven](http://maven.apache.org/download.html)
3. [Apache Ant](http://ant.apache.org/bindownload.cgi)
4. [Apache Tomcat](http://tomcat.apache.org/download-70.cgi)
5. [JDK 1.7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
6. [PostgreSQL](http://www.postgresql.org/download/)
  *For Mac - use homebrew
    1. brew install postgresql
    2. postgres -D /usr/local/var/postgres &
    3. createuser -d -P postgres
    4. createuser -d -P *user_name*
    5. createdb *db_name* -U *user_name* -W

Once all of this software is installed follow these steps to get your workspace set up.

1. Clone this project into your workspace.
2. Clone the [Broadleaf Commerce](https://github.com/BroadleafCommerce/BroadleafCommerce) project into your workspace.
3. Create a database in PostgreSQL to hold the project's data (it doesn't matter what the name is)
4. Copy the server.xml from the setup folder into your tomcat/conf directory (overwrite your current server.xml)
5. Edit the server.xml file and input your database information.
6. Copy the postgresql-9.1-901.jdbc4.jar from the lib directory to your tomcat's lib directory
7. Copy the settings.xml from the setup folder into your ${user_home}/.m2 directory (backup your current setting.xml if you have one)
8. Create a .properties file in the build/user directory with your username on the current computer in the format ${username}.properties, using an existing file as a template
9. Run mvn install -DskipTests=true on the BLC project.
10. Run mvn install on this project AFTER the BLC project has been installed.
11. Run the "redeploy-tomcat-and-start" target on the build.xml file in the site directory
12. Once the site is up, run all of the sql scripts in the scripts/db/bootstrap directory in numberical order in the database
13. Go to the http://localhost:8080, the site should be up
