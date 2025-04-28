import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double v1 = 0;
        double C = 0;
        double A = 0;

        System.out.println("Digite o primeiro numero: ");
        v1 = Double.parseDouble(scanner.nextLine());
        C = (2* Math.PI * v1);
        A = Math.PI * Math.pow(v1,2);
        System.out.printf("A circunferência é: %.2f\n", C);
        System.out.printf("A area é: %.2f", A);

    }
}
