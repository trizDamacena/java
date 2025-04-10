import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "";
        String carac = "";
        int posicao = 0;

        System.out.println("Digite um texto: ");
        texto = scanner.nextLine();
        System.out.print("Digite o caracter: ");
        carac = scanner.nextLine();

        System.out.print("A primeira ocorrência da string no texto  é: "+texto.indexOf(carac));
    }
}
