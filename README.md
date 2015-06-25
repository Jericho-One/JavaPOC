# JavaPOC
Proof Of Concept: Apache HttpComponents get request, Junit, JMockit, Basic Maven POM

Also includes Java 7+ try-with-resources statement that closes all the closeable resources without having to put them in a finally block.

#### Interesting things I learned 
In JMockit was "strict" Expectations vs NonStrictExpections. With "strict", the order of the expected code behavior matters immensely. 

Mocking up System time is a hairy proposition. It took me quite a lot of research to understand how to mock up just a single method ```System.currentTimeMillis()``` in JMockit. A pitfall I went down was mocking the entire ```System.class``` which led to something like 13 System method calls that I mocked up 13 responses to until I found the way to just mock up the response to ```currentTimeMillis()```

I started out by including ```.jar``` files in the class path until I was able to make a simple pom.xml file to take care of those dependencies. Also, the order of included dependencies make a difference.
