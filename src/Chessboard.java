import java.sql.SQLOutput;
import java.util.*;

public class Chessboard {
    public String ofOrder(int n){

        String a="";
        String b="";
        String x="WW|",y="BB|";
        for(int i=1;i<=n;i+=1){
            a+=x;
            i++;
            if(i<=n){
                a+=y;
            }
        }

        for(int i=1;i<=n;i++){
            b+=y;
            i++;
            if(i<=n){
                b+=x;
            }
        }
        String ans="";
        while(n>0){
            if(n==1)
                ans+=a;
            else if(n>1)
                ans+=a+"\n";
            n-=1;
            if(n>1)
                ans+=b+"\n";
            else if(n==1)
                ans+=b;
            n--;
        }

        System.out.println(ans);
        return ans;
    }
}
