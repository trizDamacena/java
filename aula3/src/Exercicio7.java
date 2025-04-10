import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String texto = "";
        String palavra = "";

        System.out.print("Digite o texto: ");
        texto = scanner.nextLine();
        System.out.print("Digite a palavra que deseja encontrar: ");
        palavra = scanner.nextLine();

        System.out.print(texto.contains(palavra));
    }
}
