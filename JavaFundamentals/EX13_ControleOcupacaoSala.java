import java.util.Scanner;

public class EX13_ControleOcupacaoSala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] assentos = new int[4][3];

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== CONTROLE DA SALA ===");
            System.out.println("1 - Mostrar assentos");
            System.out.println("2 - Ocupar assento");
            System.out.println("3 - Liberar assento");
            System.out.println("4 - Encerrar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("0 = Livre | 1 = Ocupado");

                    for (int i = 0; i < assentos.length; i++) {
                        for (int j = 0; j < assentos[i].length; j++) {
                            System.out.print(assentos[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Digite a fileira (0 a 3): ");
                    int fileiraOcupar = scanner.nextInt();

                    System.out.print("Digite a coluna (0 a 2): ");
                    int colunaOcupar = scanner.nextInt();

                    if (fileiraOcupar < 0 || fileiraOcupar >= assentos.length ||
                            colunaOcupar < 0 || colunaOcupar >= assentos[0].length) {
                        System.out.println("Fileira ou coluna inválida!");
                    } else if (assentos[fileiraOcupar][colunaOcupar] == 1) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        assentos[fileiraOcupar][colunaOcupar] = 1;
                        System.out.println("Assento ocupado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.print("Digite a fileira (0 a 3): ");
                    int fileiraLiberar = scanner.nextInt();

                    System.out.print("Digite a coluna (0 a 2): ");
                    int colunaLiberar = scanner.nextInt();

                    if (fileiraLiberar < 0 || fileiraLiberar >= assentos.length ||
                            colunaLiberar < 0 || colunaLiberar >= assentos[0].length) {
                        System.out.println("Fileira ou coluna inválida!");
                    } else if (assentos[fileiraLiberar][colunaLiberar] == 0) {
                        System.out.println("Esse assento já está livre!");
                    } else {
                        assentos[fileiraLiberar][colunaLiberar] = 0;
                        System.out.println("Assento liberado com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}