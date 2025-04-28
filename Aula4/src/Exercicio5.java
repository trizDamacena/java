import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite as horas trabalhadas no mês: ");
        int horas = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite quantos recebe por horas trabalhadas: ");
        double s_horas = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o tempo de casa do funcionário: ");
        int tempo = Integer.parseInt(scanner.nextLine());

        double s = horas * s_horas;
        double salario = (tempo < 5) ? s : (tempo >= 6 && tempo <=10 ) ? s + (s*10)/100 : s * (s*20)/100;

        System.out.printf("Nome: %s\nHoras trabalhadas: %d\nValor por horas: %.2f\nSalário: %.2f", nome, horas, s_horas, salario);


    }
}
