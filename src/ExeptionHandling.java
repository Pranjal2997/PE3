import java.util.*;

public class ExeptionHandling {

    private String message;
    public ExeptionHandling(String message){
        this.message = message;
    }
    public void printMessage(){
        System.out.println(message);
        int a = 0;
        int b = 1/a;
    }
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }

}
