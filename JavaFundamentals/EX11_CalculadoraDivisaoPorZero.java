import java.util.Scanner;

public class EX11_CalculadoraDivisaoPorZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        System.out.println("Escolha a operação (+, -, *, /");
        String operacao = scanner.next();

        switch (operacao) {
            case "+":
                int soma = n1 + n2;
                System.out.println("Resultado: " + soma);
                break;

            case "-":
                int subtracao = n1 - n2;
                System.out.println("Resultado: " + subtracao);
                break;

            case "*":
                int multiplicacao = n1 * n2;
                System.out.println("Resultado: " + multiplicacao);
                break;

            case "/":
                if ( n2 == 0) {
                    System.out.println("Não é possível dividir um número inteiro por zero.");
                } else {
                    int divisao = n1 / n2;
                    System.out.println("Resultado: " + divisao);
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }
}