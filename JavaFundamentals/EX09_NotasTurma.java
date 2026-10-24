import java.util.Scanner;

public class EX09_NotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[3][2];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota da avaliação " + (j + 1) + ": ");

                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            double soma = 0;

            for (int j = 0; j < notas[i].length; j++) {
                soma = soma + notas[i][j];
            }

            double media = soma / 2;

            System.out.println("Aluno " + (i + 1) + ": Avaliação 1 = " + notas[i][0]  + " | Avaliação 2 = " + notas[i][1] + " | Média = " + media);
        }

        scanner.close();
    }
}