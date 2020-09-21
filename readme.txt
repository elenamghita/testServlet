STEP 1 download and unzip tomcat

download from =>
https://tomcat.apache.org/download-90.cgi

unzip here =>
d:\tools\apache-tomcat-9.0.38\

STEP 2 start tomcat

run this =>
d:\tools\apache-tomcat-9.0.38\bin>catalina.bat start

STEP 3 deploy war on tomcat

copy war file from maven "target" folder to tomcat "d:\tools\apache-tomcat-9.0.38\webapps\" folder
check tomcat console and wait for deploy to finish

STEP 4 verify servlets
http://localhost:8080/testServlet-1.0-SNAPSHOT/hello
http://localhost:8080/testServlet-1.0-SNAPSHOT/sum?a=3&b=4

REMEMBER => lots of listeners for all sort of created by the application server objects