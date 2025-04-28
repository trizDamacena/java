import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o segundo valor: ");
        int v2 = Integer.parseInt(scanner.nextLine());
        String saida = (v1>v2)? "O primeiro número é maior que o segundo": (v1<v2) ? "O segundo número é maior que o primeiro" : "Os dois números são iguais";
        System.out.printf(saida);
    }
}
