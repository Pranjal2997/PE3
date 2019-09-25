import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class CountriesTest {
    private static Countries countries;
    @Before
    public void setUp() throws Exception {
        countries = new Countries();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testcase1(){
        String[] country ={"India","United States","Germany","Egypt", "Portugal"};
        String[] ans={"Ind","Untd Stts","Grmny","Egypt","Prtgl"};

        Assert.assertEquals(ans,countries.vowel(country));
    }

    @Test
    public void testcase2(){
        String[] country ={"Angora","Combodia","Italy","Nepal", "Australia"};
        String[] ans={"Angr","Cmbd","Itly","Npl","Astrl"};

        Assert.assertEquals(ans,countries.vowel(country));
    }

    @Test
    public void testcase3(){
        String[] country ={"Angora","Combodia","Italy","Nepal", "Australia"};
        String[] ans={"Angr","Cmbod","Itly","Npl","Astrl"};

        Assert.assertThat(ans, not(equalTo(countries.vowel(country))));
    }



}