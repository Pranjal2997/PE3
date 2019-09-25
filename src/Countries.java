import java.util.*;

public class Countries {
    public String[] vowel(String[] country){
        String[] a=new String[country.length];
        for(int i=0;i<country.length;i++){

            String s=country[i];
            String t="";
            t = t+s.charAt(0);
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)=='i'||s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    continue;
                }
                else{
                    t+=s.charAt(j);
                }
            }
            a[i]=t;
        }
        return a;
    }
}
