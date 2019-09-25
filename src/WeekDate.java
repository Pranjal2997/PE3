import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class WeekDate {
    public List<String> getDate(){
        List<String> a=new ArrayList<>();
        Calendar cal = Calendar.getInstance();



        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String x=((df.format(cal.getTime())));
        a.add(x);
        for (int i = 0; i <6; i++) {
            cal.add(Calendar.DATE, 1);
        }
        String y= df.format(cal.getTime());
        a.add(y);
        return a;
    }
}
