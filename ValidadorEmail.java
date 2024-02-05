import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorEmail {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um endereço de e-mail: ");
            String email = scanner.nextLine();

            if (validarEmail(email)) {
                System.out.println("O e-mail é válido.");
            } else {
                System.out.println("O e-mail não é válido.");
            }

            scanner.close();
        }
    }

    private static boolean validarEmail(String email) {
        String regex = "[A-Za-z0-9._+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}