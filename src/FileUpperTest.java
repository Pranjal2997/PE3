import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class FileUpperTest {
    public static FileUpper file;
    @Before
    public void setUp() throws Exception {
        file = new FileUpper();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1() throws IOException {
//        String filename = "Documents/abc.txt";
        File path = new File("abc.txt");
        String content = "hello pranjal!";
        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(content.getBytes());
        outputStream.close();
        Assert.assertTrue(file.toUppercase(path));
    }

    @Test
    public void testcase2() throws IOException{
        File path = new File("abc2.txt");
        String content = "stackroute";
        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(content.getBytes());
        outputStream.close();
        String match  ="STACKROUTE";
        Assert.assertEquals(match,file.toUppercasestr(path));
    }

}