import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroTelefone {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite seu numero de telefoneno formato: XX XXXXX-XXXX ");

            String numeroTelefone = scanner.nextLine();

            if (validarNumero(numeroTelefone)) {
                System.out.println("Número de telefone válido!");
            } else {
                System.out.println("Número de telefone inválido!");
                scanner.close();
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
    }    
        private static boolean validarNumero(String numeroTelefone){
            String regex = "^(\\d{2,3})?\\s?\\d{4,5}-\\d{4}$";
            return numeroTelefone.matches(regex);
    }
}
