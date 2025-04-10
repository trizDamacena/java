import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

         String alfabeto = "abcdefghijklmnopqrstuvwxyz";
         int numero = 0;
         int posicao = 0;
         System.out.println("Digite um numero");
         numero= scanner.nextInt();

         posicao = numero - 1;

         System.out.println(alfabeto.charAt(+posicao));
    }
}
