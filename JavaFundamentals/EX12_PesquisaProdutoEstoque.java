import java.util.Scanner;

public class EX12_PesquisaProdutoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] codigos = {101, 205, 310, 412, 550};

        System.out.println("Digite o codigo do produto: ");
        int produto = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < codigos.length; i++) {
            if (produto == codigos[i]) {
                System.out.println("Produto encontrado na posição " + i + " do array.");
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("Produto não cadastrado.");
        }

        scanner.close();
    }
}