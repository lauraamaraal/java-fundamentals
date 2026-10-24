import java.util.Scanner;

public class EX15_SistemaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[4][3];
        double[] medias = new double[4];

        double soma;
        double mediaGeral = 0;
        int aprovados = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < 3; j++) {
                boolean valida = false;

                while (!valida) {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    String texto = scanner.nextLine();

                    try {
                        double nota = Double.parseDouble(
                                texto.replace(",", ".")
                        );

                        if (nota >= 0 && nota <= 10) {
                            notas[i][j] = nota;
                            valida = true;
                        } else {
                            System.out.println(
                                    "Nota inválida! Digite de 0 a 10."
                            );
                        }

                    } catch (NumberFormatException e) {
                        System.out.println(
                                "Digite um número válido!"
                        );
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            soma = 0;

            for (int j = 0; j < 3; j++) {
                soma = soma + notas[i][j];
            }

            medias[i] = soma / 3;
            mediaGeral = mediaGeral + medias[i];

            if (medias[i] >= 7) {
                aprovados++;
            }
        }

        mediaGeral = mediaGeral / 4;

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Mostrar médias e situação");
            System.out.println("2 - Mostrar quantidade de aprovados");
            System.out.println("3 - Mostrar média geral da turma");
            System.out.println("4 - Encerrar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("Relatório da turma");

                        for (int i = 0; i < 4; i++) {
                            System.out.printf(
                                    "Aluno %d - Média: %.2f - ",
                                    i + 1, medias[i]
                            );

                            if (medias[i] >= 7) {
                                System.out.println("Aprovado");
                            } else {
                                System.out.println("Em recuperação");
                            }
                        }
                        break;

                    case 2:
                        System.out.println(
                                "Quantidade de aprovados: " + aprovados
                        );
                        break;

                    case 3:
                        System.out.printf(
                                "Média geral da turma: %.2f%n",
                                mediaGeral
                        );
                        break;

                    case 4:
                        System.out.println("Programa encerrado!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite uma opção numérica válida!");
            }
        }

        scanner.close();
    }
}
