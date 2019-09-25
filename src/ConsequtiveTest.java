import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsequtiveTest {
    private static Consequtive consequtive;
    @Before
    public void setUp() throws Exception {
        consequtive =new Consequtive();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        String s = "98,96,95,94,93";
        Assert.assertFalse(consequtive.iscons(s));
    }

    @Test
    public void testcase2(){
        String s = "54,53,52,51,50,49,48";
        Assert.assertTrue(consequtive.iscons(s));
    }

    @Test
    public void testcase3(){
        String s = "1,2,3,4,5,6,6";
        Assert.assertFalse(consequtive.iscons(s));
    }

    @Test
    public void testcase4(){
        String s = "1,2,1,2,3,4";
        Assert.assertTrue(consequtive.iscons(s));
    }


}