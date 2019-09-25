import java.io.*;
import java.util.*;

public class FileHandling {
    public String filches(String s) throws IOException {
        File path = new File(s);
        String ans="";
        File[] listOfFiles = path.listFiles();
        for(File f:listOfFiles){
            System.out.println("Element");
            if(f.isFile()){
                if(f.getName().contains(".txt")){
                    String secondpath = s+"/"+ f.getName();
                    BufferedReader br = new BufferedReader(new FileReader(secondpath));
                    String st;

                    ans+=br.readLine();

                }
            }
        }
        return ans;
    }
}
