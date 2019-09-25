import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class pe32Test {
    private static pe32 pe32;

    @org.junit.Before
    public void setUp() throws Exception {
        pe32 = new pe32();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        int row=2,col=2;
//        int[][] mat1 = new int[row][col];
//        int[][] mat2 = new int[row][col];

        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{4,3},{2,1}};
        int[][] mat3 = {{5,5},{5,9}};
        Assert.assertEquals(mat3,pe32.matrix(row,col,mat1,mat2));
    }

    @Test
    public void testcase2(){
        int row=2,col=2;
//        int[][] mat1 = new int[row][col];
//        int[][] mat2 = new int[row][col];

        int[][] mat1 = {{1,2},{3,7}};
        int[][] mat2 = {{4,3},{2,1}};
        int[][] mat3 = {{5,5},{5,9}};
//        Assert.assert(mat3,pe32.matrix(row,col,mat1,mat2));
        Assert.assertThat(mat3, not(equalTo(pe32.matrix(row,col,mat1,mat2))));
    }

    @Test
    public void testcase3(){
        int row=2,col=2;
//        int[][] mat1 = new int[row][col];
//        int[][] mat2 = new int[row][col];

        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{4,3},{2,1}};
        int[][] mat3 = {{5,5},{5,5}};
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
        Assert.assertNotSame(mat3,pe32.matrix(row,col,mat1,mat2));
    }

}