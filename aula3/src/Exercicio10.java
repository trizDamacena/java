import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println(nome.substring(nome.lastIndexOf(" ")+1));
    }
}
