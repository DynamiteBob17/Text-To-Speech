# How the speech is generated  
- first the individual [ARPABET](https://en.wikipedia.org/wiki/ARPABET) phonemes needed were extracted manually using [Balabolka](https://balabolka.en.softonic.com/) and Audacity. Then, using the [CMU ARPABET pronouncing dictionary](http://www.speech.cs.cmu.edu/cgi-bin/cmudict) the phonemes were combined into words
- after the text to be spoken is analyzed from the input and words in the pronouncing dictionary are matched, the individual phoneme audio streams are combined and reproduced sequentially, but it does sound very primitive and some words are barely audible
- also has some artificial stops in speech for punctuation marks
- [live demo](https://drive.google.com/file/d/1X8o_n2irPIp9sYsSNtM-_Bten73SXCI3/view)

# How to use
If you have [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) and up installed you can:
- download the .jar executable from the release   
**OR**
- compile and run the repository as a Maven project with your method of choice.
  
`mvn clean compile exec:java` to run from a command.
