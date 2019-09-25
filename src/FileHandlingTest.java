import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class FileHandlingTest {
    private static FileHandling fileHandling;
    @Before
    public void setUp() throws Exception {
        fileHandling=new FileHandling();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1() throws IOException {
//        String s="/home/cgi/Downloads";
        Assert.assertEquals("",fileHandling.filches("/home/cgi/Downloads"));
    }
}