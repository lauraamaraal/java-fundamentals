import java.util.Scanner;
import java.util.Random;

public class EX14_SorteioParticipantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] alunos = new String[6];
        String[] sorteados = new String[3];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
        }

        System.out.println("Participantes cadastrados: " + alunos.length);

        int quantidade = 0;

        while (quantidade < 3) {
            int numero = random.nextInt(6);
            String nome = alunos[numero];

            boolean repetido = false;

            for (int i = 0; i < quantidade; i++) {
                if (nome.equals(sorteados[i])) {
                    repetido = true;
                }
            }

            if (repetido == false) {
                sorteados[quantidade] = nome;
                quantidade++;
            }
        }

        System.out.println("Resultado do sorteio:");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + sorteados[i]);
        }

        scanner.close();
    }
}
