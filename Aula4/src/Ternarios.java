import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        int num1= 7;
        int num2 = 10;

        //String saida = (num1>num2) ?  "O número um é maior que número dois.": "O número dois é maior ou igual que número um";
        String saida = (num1>num2) ?  "O número um é maior que número dois.": (num1<num2) ? "O número dois é maior que o número um" : "Os números são iguais";
        System.out.printf(saida);
    }
}
