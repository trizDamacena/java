import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        String texto = "";

        Scanner scanner = new Scanner (System.in);
        texto = scanner.nextLine();
        System.out.println(texto.length());
        System.out.println(texto.charAt(0));//primeira posição
        System.out.println(texto.charAt(texto.length()-1)); //ultima posição
    }
}
