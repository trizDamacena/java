import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String cidade = "";
        String estado = "";

        nome = scanner.nextLine();
        cidade = scanner.nextLine();
        estado = scanner.nextLine();

        System.out.println(nome.toUpperCase());
        System.out.println(cidade.toLowerCase());
        System.out.println(estado.toLowerCase());

    }
}