import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessboardTest {
    private static Chessboard chessboard;
    @Before
    public void setUp() throws Exception {
        chessboard = new Chessboard();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        int n=8;
        String chess = "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|";
        Assert.assertEquals(chess,chessboard.ofOrder(n));
    }

    @Test
    public void testcase2(){
        int n=9;
        String chess = "WW|BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|BB|\n"+
                "WW|BB|WW|BB|WW|BB|WW|BB|WW|";
        Assert.assertEquals(chess,chessboard.ofOrder(n));
    }

    @Test
    public void testcase3(){
        int n=8;
        String chess = "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n"+
                "WW|BB|WW|BB|WW|BB|WW|BB|";
        Assert.assertNotEquals(chess,chessboard.ofOrder(n));
    }


}