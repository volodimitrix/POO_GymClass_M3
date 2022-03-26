package gimnasAplicacio;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String args[]){
        ArrayList<String> email = new ArrayList<String>();
        email.add("example@domain.com");
        email.add("exampletwo@domain.com");
        email.add("12@domain.com");
        email.add("@helloworld.com"); 
        String regx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
        Pattern pattern = Pattern.compile(regx);
        for(String email1 : email){ 
            Matcher matcher = pattern.matcher(email1);
            System.out.println(email1 +" : "+ matcher.matches()+"\n");
        }
    }
}