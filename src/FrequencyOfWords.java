import java.io.*;
import java.util.*;

public class FrequencyOfWords {
    public int checkfreq(File path, String check) throws IOException {
        int counts=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String str = br.readLine();
//        String b[]=str.split(" ");
//        for(int j=0;j<b.length;j++){
//            System.out.print(b[j]+"  ");
//            if(b[j]==check){
//                counts++;
//            }
//        }
        while(str!=null){
            String b[]=str.split(" ");
            for(int j=0;j<b.length;j++){
                System.out.print(b[j]+"  ");
                if(b[j].equals(check)){
                    counts++;
                }
            }
            str = br.readLine();
        }
        br.close();
        return counts;
    }
}
