import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Bem vubdi à nossa clinica!\n");
        System.out.println("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do paciente: ");
        long cpf = Long.parseLong(scanner.nextLine());

        System.out.println("Digite a idade do paciente: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a altura do paciente: ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso do paciente: ");
        float peso = Float.parseFloat(scanner.nextLine());

        System.out.printf("Paciente %s, CPF '%d':\n", nome, cpf);
        System.out.print("---------------------------------------\n");
        System.out.printf("Idade: %d;", idade);
        System.out.printf("\nAltura: %.2fm;\n", altura);
        System.out.printf("Peso: %.2fKg;", peso);
    }
}
