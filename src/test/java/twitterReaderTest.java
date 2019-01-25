import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class twitterReaderTest {

    @Test
    public void getURL() {
        String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
        assertTrue("http://cnn.com".equals(twitterReader.getURL(testmsg)));
    }

    @Test
    public void getTopic() {
        String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
        assertTrue("http://cnn.com".equals(twitterReader.getURL(testmsg)));
    }

    @Test
    public void getMention() {
        String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
        assertTrue("http://cnn.com".equals(twitterReader.getURL(testmsg)));
    }

    @Test
    public void getRetweet() {
    }
}