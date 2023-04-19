# How to use
If you have [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) and up installed you can:
- download the .jar executable from the release   
**OR**
- compile and run the repository as a Maven project with your method of choice.</br></br>
`mvn clean compile exec:java` to run from a command.  

### How the speech is generated  
- first the individual [ARPABET](https://en.wikipedia.org/wiki/ARPABET) phonemes needed were extracted manually using [Balabolka](https://balabolka.en.softonic.com/) and Audacity. Then using the [CMU ARPABET pronouncing dictionary](http://www.speech.cs.cmu.edu/cgi-bin/cmudict) the phonemes were combined into words.
