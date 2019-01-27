import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class twitterReaderTest {

    @Test
    public void getURLs() {
        String testmsg = "@franky and @Eugene go to #hollywood and #Paris. See http://cnn.com as well as http://abc.com.";
        String[] tester = twitterReader.getURLs(testmsg);
        assertTrue("http://cnn.com".equals(tester[0]));
        assertTrue("http://abc.com".equals(tester[1]));
    }

    @Test
    public void getTopics() {
        String testmsg = "@franky and @Eugene go to #hollywood and #Paris. See http://cnn.com as well as http://abc.com.";
        String[] tester = twitterReader.getTopics(testmsg);
        assertTrue("#hollywood".equals(tester[0]));
        assertTrue("#Paris".equals(tester[1]));
    }

    @Test
    public void getMentions() {
        String testmsg = "@franky and @Eugene go to #hollywood and #Paris. See http://cnn.com as well as http://abc.com.";
        String[] tester = twitterReader.getMentions(testmsg);
        assertTrue("@franky".equals(tester[0]));
        assertTrue("@Eugene".equals(tester[1]));
    }

    @Test
    public void getRetweet() {
    }
}