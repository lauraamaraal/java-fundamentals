import java.util.Scanner;

public class EX10_ConversaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valido = false;
        int idade;

        System.out.println("Digite sua idade: ");

        while (valido == false) {

            String idadeTxt = scanner.nextLine();

            try {
                idade = Integer.parseInt(idadeTxt);
                valido = true;
                System.out.println("Idade registrada: " + idade);

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite a idade usando números inteiros.");
            }

        }
    }
}
