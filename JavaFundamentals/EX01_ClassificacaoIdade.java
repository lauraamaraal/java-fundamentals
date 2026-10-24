import java.util.Scanner;
public class EX01_ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        String nome;
        String classificacao;

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        idade = scanner.nextInt();

        System.out.println("Aluno: " + nome);

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        scanner.close();

    }
}