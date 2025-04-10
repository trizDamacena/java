import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.print("Digite uma palavra do texto: ");
        String palavra = scanner.nextLine();
        
        System.out.print(texto.substring(texto.lastIndexOf(palavra)));
    }
}
