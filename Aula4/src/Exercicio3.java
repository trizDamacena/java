import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 0;

        System.out.print("Digite a temperatura em °C que deseja converter para Fahrenheit: ");
        temp = Double.parseDouble(scanner.nextLine());

        double F = (temp * (double) 9/5)  + 32;
        System.out.printf("A temperatura em Fahrenheit: %.2f", F);
    }
}
