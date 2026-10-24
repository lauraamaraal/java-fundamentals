import java.util.Scanner;
public class EX02_ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        String texto = scanner.nextLine();

        double celsius = Double.parseDouble(texto);
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);


    }
}
