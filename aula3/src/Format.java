import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        String frase = "A %s custa %.2f reais o quilo";
        String fruta = "Laranja";
        Double preco = 5.90;
        System.out.println(String.format(frase,fruta,preco));
    }
}
