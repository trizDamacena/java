import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String texto = "Eu gosto de maça, maçã é gostosa!";
        String chaar = "";


        System.out.print("Digite um caracter: ");
        chaar =  scanner.nextLine();
        System.out.print(texto.lastIndexOf(chaar));

    }
}
