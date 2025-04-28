import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double v1 = 0;
        double v2 = 0;
        System.out.print("Digite um valor: ");
        v1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o segundo valor: ");
        v2 = Double.parseDouble((scanner.nextLine()));
        System.out.printf("%.2f + %.2f = %.2f\n", v1, v2, (v1+v2));
        System.out.printf("%.2f - %.2f = %.2f\n",v1, v2, v1-v2);
        System.out.printf("%.2f * %.2f = %.2f\n",v1, v2,v1*v2);
        System.out.printf("%.2f / %.2f = %.2f\n", v1, v2, (double) v1/v2);
        System.out.printf("%.2f ^ %.2f = %.2f\n",v1, v2,Math.pow(v1, v2));
        System.out.printf("√%.2f = %.1f",v1, Math.sqrt(v1));
    }
}
