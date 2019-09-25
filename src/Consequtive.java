import java.util.*;

public class Consequtive {
    public boolean iscons(String s) {
        String[] a = s.split(",");
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
            System.out.println(b[i]);
        }

        for (int i = 1; i < a.length; i++) {
            if (Math.abs(b[i] - b[i - 1]) != 1)
                return false;
        }
        return true;
    }
}
