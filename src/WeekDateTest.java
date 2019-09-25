import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WeekDateTest {
    private static WeekDate w;
    @Before
    public void setUp() throws Exception {
        w=new WeekDate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        List<String> a = new ArrayList<>();
        a.add("Mon 09/09/2019");
        a.add("Sun 15/09/2019");
        assertEquals(a,w.getDate());
    }
}