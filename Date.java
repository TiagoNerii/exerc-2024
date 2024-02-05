import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {
        String texto = "A  Reunião está marcada dia 17/05/2004.";

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}";


        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Data encontrada: "+ matcher.group());
            
        }  
    }
}
