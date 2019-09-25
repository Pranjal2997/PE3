import java.util.*;

public class pe32 {
    int[][] mat1;
    int[][] mat2;
    int row,col;
    public int[][] matrix(int row,int col,int[][] mat1,int[][] mat2){

        this.row=row;
        this.col=col;

        this.mat1=mat1;
        this.mat2=mat2;

        int[][] mat3 = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }

        return mat3;
    }
}
