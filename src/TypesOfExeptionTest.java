import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.channels.AsynchronousServerSocketChannel;

import static org.junit.Assert.*;

public class TypesOfExeptionTest {
    public static TypesOfExeption typesOfExeption;
    @Before
    public void setUp() throws Exception {
        typesOfExeption = new TypesOfExeption();
    }

    @After
    public void tearDown() throws Exception {
    }
    int result = 0;
    int arraySize = 3;
    int badSize = -1;
    int[] array = null;
    @Test
    public void testcase1(){
        Assert.assertTrue(typesOfExeption.isNullpointExeption(array,0));
    }

    @Test
    public void testcase2(){
        Assert.assertTrue(typesOfExeption.isNegativeArrayExeption(array,badSize));
    }

    @Test
    public void testcase3(){
        Assert.assertTrue(typesOfExeption.isArrayIndexOutOfBoundsExeption(array,arraySize,arraySize));
    }

    @Test
    public void testcase4(){

        array= new int[]{1, 2, 3};
        Assert.assertFalse(typesOfExeption.isNullpointExeption(array,0));
    }

    @Test
    public void testcase5(){
        badSize=3;
        Assert.assertFalse(typesOfExeption.isNegativeArrayExeption(array,badSize));
    }

    @Test
    public void testcase6(){
        array= new int[]{1, 2, 3};
        arraySize=3;
//        for(int i=0;i<arraySize;i++)
//            System.out.println(array[i]);

        Assert.assertFalse(typesOfExeption.isArrayIndexOutOfBoundsExeption(array,arraySize,1));

    }




}