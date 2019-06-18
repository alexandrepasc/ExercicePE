# ExercicePE

Java 8u211 <br>
https://www.java.com/pt_BR/download/ <br>
<br>
Maven 3.6.1 <br>
http://maven.apache.org/download.cgi <br>
<br>
Selenium Java 3.141.59 <br>
https://www.seleniumhq.org/ <br>
<a href="https://bit.ly/2zm3ZzF">Download</a> <br>
<br>
Geckodriver 0.24.0 <br>
https://github.com/mozilla/geckodriver/releases <br>
<br>
ChromeDriver 75.0.3770.90 <br>
https://chromedriver.storage.googleapis.com/index.html?path=75.0.3770.90/ <br>
<br><br>
<h3>Parameters</h3><br>
If none of the parameters are passed, by default it will run with Firefox and NO gui (headless). <br>
<br>
<b>browser:</b> firefox/chrome <br>
<b>gui:</b> yes/no <br>
<br>
Examples <br>
mvn clean install -Dbrowser=chrome <br>
mvn clean install -Dgui=yes <br>
mvn clean install -browser=chrome -Dgui=yes <br>
<br><br>
<h3>Run Test or Suite</h3><br>
<b>Run Suite (class):</b> <br>
mvn clean install -Dtest=className <br>
<b>Run Test (method):</b> <br>
mvn clean install -Dtest=className#methodName <br>
<b>Just compile and run no tests:</b> <br>
mvn clean install -DskipTests <br>