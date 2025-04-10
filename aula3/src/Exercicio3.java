import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numero = 0;
        String texto = "";

        System.out.println("Digite uma texto: ");
        texto = scanner.nextLine();
        System.out.println("Digite um número: "+(texto.length()-1));
        numero = scanner.nextInt();
        //int posicao = Integer.parseInt(scanner.nextLine())

        System.out.println(texto.charAt(+numero));
    }
}
