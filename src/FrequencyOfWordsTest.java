import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {
    private static FrequencyOfWords frequencyOfWords;
    @Before
    public void setUp() throws Exception {
        frequencyOfWords = new FrequencyOfWords();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1() throws IOException {
        File path = new File("abc.txt");
        String content = "i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.";
        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(content.getBytes());
        outputStream.close();
        String check="i";
        Assert.assertEquals(3,frequencyOfWords.checkfreq(path,check));
    }

    @Test
    public void testcase2() throws IOException {
        File path = new File("abc.txt");
        String content = "hi this is avinash ,\n" +
                "here is stackroute ,\n" +
                "it is in koramangala which is in bangalore.";
        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(content.getBytes());
        outputStream.close();
        String check="is";
        Assert.assertEquals(4,frequencyOfWords.checkfreq(path,check));
    }

}