import java.util.*;

public class StudentMarks {
    int numOfStudents,flag=0;
    int[] stuGrades;

    public boolean grades(int n,int[] arr){
        this.numOfStudents = n;
        this.stuGrades=arr;


        for (int i = 0; i < numOfStudents; i++) {
            int x = stuGrades[i];
            if (x < 0 || x > 100) {
                System.out.println("Invalid Input");
                i--;
                return false;
            }
            stuGrades[i] = x;
        }
        for (int i : stuGrades) {
            System.out.println(i);
        }
        return true;
    }
}
