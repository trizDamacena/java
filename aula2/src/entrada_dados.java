import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int inteiro = Integer.parseInt(scanner.nextLine());
        System.out.print(inteiro);

        System.out.print("\nDigite um valor decimal: ");
        double decimal = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f", decimal);

        System.out.print("\nDigite outro valor decimal: ");
        float decimall = Float.parseFloat(scanner.nextLine());
        System.out.printf("%.2f", decimall);

        System.out.print("\nDigite um valor booliano: ");
        boolean boolina = Boolean.parseBoolean(scanner.nextLine());
        System.out.print(boolina);

        System.out.print("\nDigite um valor long: ");
        long lon = Long.parseLong(scanner.nextLine());
        System.out.print(lon);

        System.out.print("\nDigite um valor short: ");
        short shoort = Short.parseShort(scanner.nextLine());
        System.out.print(+shoort);

        System.out.print("\nDigite um valor byte: ");
        byte byyte = Byte.parseByte(scanner.nextLine());
        System.out.print(byyte);

        System.out.print("\nDigite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print(frase);


    }
}
