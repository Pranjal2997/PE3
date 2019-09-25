import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks studentMarks;
    @Before
    public void setUp() throws Exception {
        studentMarks =  new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenTwoMatrixShouldAdd1(){
        int n=5;
        int[] a = {1,2,3,4,5};
        Assert.assertTrue(studentMarks.grades(n,a));
    }

    @Test
    public void givenTwoMatrixShouldAdd2(){
        int n=5;
        int[] a = {1,2,3,4,101};
        Assert.assertFalse(studentMarks.grades(n,a));
    }

    @Test
    public void givenTwoMatrixShouldAdd3(){
        int n=5;
        int[] a = {-1,2,3,4,5};
        Assert.assertFalse(studentMarks.grades(n,a));
    }

    @Test
    public void givenTwoMatrixShouldAdd4(){
        int n=5;
        int[] a = {99,98,97,100,18};
        Assert.assertTrue(studentMarks.grades(n,a));
    }
}