import java.util.*;
public class TypesOfExeption {

    int[] array;
    int index;
    int result;
    int size;
    public boolean isNullpointExeption(int[] array,int index){
        this.array=array;
        this.index=index;
        try{
            result = array[index];
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception caught!");
            return true;
        }
        System.out.println(array[index]);
        return false;
    }
    public boolean isNegativeArrayExeption(int[] array,int size){
        this.array=array;
        this.size=size;
        try{
            array = new int[size];
            for(int i=0;i<size;i++){
                array[i]=i+1;
            }
        }
        catch (NegativeArraySizeException e){
            System.out.println("Negative Array Exception called!");
            return true;
        }
        for(int i=0;i<size;i++)
            System.out.println(array[i]+" ");
        return false;
    }
    public boolean isArrayIndexOutOfBoundsExeption(int[] array,int size,int index){
//        this.array=array;
//        this.index=index;
//        this.size=size;
        try{
            array = new int[size];
            result = array[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds Exception called!");
            return true;
        }
        System.out.println("Size="+size);
//        for(int i=0;i<size;i++)
//            System.out.println(array[i]);
        System.out.println("Array in bounds");
        return false;
    }
}
