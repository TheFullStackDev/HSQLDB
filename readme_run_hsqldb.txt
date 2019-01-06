1. create server.properties file
	  server.database.0=file:hsqldb/db
	  server.dbname.0=testdb
2. dry run hsqldb.
	java -classpath lib/hsqldb.jar org.hsqldb.server.Server

3. stop and run the server created. 
	java -classpath lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:hsqldb/demodb --dbname.0 testdb
	
4. you can open the database home screen that is runManagerSwing.bat from C:\hsqldb-2.3.4\hsqldb\bin location

Need to type details:-
Type: HSQL Database Engine In-Memory
Driver: org.hsqldb.jdbcDriver
URL: jdbc:hsqldb:hsql://localhost/testdb
USER:SA
Password: