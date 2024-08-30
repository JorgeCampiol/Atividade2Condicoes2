import java.util.Scanner;

public class CalculoDeDesconto {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = scanner.nextDouble();


        double descontoPercentual = 0;
        double valorDesconto = 0;
        double valorFinal = valorTotal;


        if (valorTotal > 500) {
            descontoPercentual = 20;
        } else if (valorTotal >= 200) {
            descontoPercentual = 10;
        } else if (valorTotal >= 100) {
            descontoPercentual = 5;
        } else {
            descontoPercentual = 0;
        }


        valorDesconto = valorTotal * descontoPercentual / 100;
        valorFinal = valorTotal - valorDesconto;



        System.out.printf("Valor original: R$ %.2f%n", valorTotal);
        System.out.printf("Percentual de desconto: %.2f%%%n", descontoPercentual);
        System.out.printf("Valor descontado: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        scanner.close();
    }
    }

