import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calculadora Simples");
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");

            int escolha = scanner.nextInt();
            double resultado = 0;

            if (escolha == 1) {
                resultado = num1 + num2;
            } else if (escolha == 2) {
                resultado = num1 - num2;
            } else if (escolha == 3) {
                resultado = num1 * num2;
            } else if (escolha == 4) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
            } else {
                System.out.println("Opção inválida.");
                return;
            }

            System.out.println("Resultado: " + resultado);

            scanner.close();
        }
    }
}
