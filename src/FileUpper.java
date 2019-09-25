import java.io.*;
import java.util.*;

public class FileUpper {
    public static boolean toUppercase(File filename) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String str = br.readLine();
        br.close();
        System.out.println(str.toUpperCase());
        System.out.println("Length of file="+str.length());


//        FileReader fr = new FileReader(filename);
//        int i;
//        while((i=fr.read())!=-1){
//            char c=(char)i;
//            System.out.print(Character.toUpperCase(c));
//        }
//        return true;
        return true;
    }


    public String toUppercasestr(File filename) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String str = br.readLine();
        br.close();
        System.out.println(str.toUpperCase());
        System.out.println("Length of file="+str.length());
        return str.toUpperCase();
    }


}
