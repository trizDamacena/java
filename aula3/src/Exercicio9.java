import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um valor: ");
        String valor1 = scanner.nextLine();

        Double valor = Double.parseDouble(valor1.replace(",", "."));
        System.out.println(valor);



    }
}
