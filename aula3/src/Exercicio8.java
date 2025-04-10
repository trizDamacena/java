import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String texto = "Eu gosto de Laranja";
        String palavra1 = "Laranja";
        String palavra2 = "Melancia";
        String palavra3 = "laranja";


        System.out.println(texto.toUpperCase().contains(palavra1.toUpperCase()));
        System.out.println(texto.contains(palavra2));
        System.out.println(texto.toLowerCase().contains(palavra3));
    }


}
