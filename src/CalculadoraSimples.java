import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();


            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Digite a operação desejada (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            scanner.close();

    }
}
