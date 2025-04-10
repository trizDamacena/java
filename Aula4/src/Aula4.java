import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um valor: ");
        int v1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = scanner.nextInt();
        System.out.printf("%d + %d = %d\n", v1, v2, v1+v2);
        System.out.printf("%d - %d = %d\n",v1, v2, v1-v2);
        System.out.printf("%d * %d = %d\n",v1, v2,v1*v2);
        System.out.printf("%d / %d = %.1f\n", v1, v2, (double) v1/v2);
        System.out.printf("%d ^ %d = %.1f\n",v1, v2,Math.pow(v1, v2));
        System.out.printf("√%d = %.1f",v1, Math.sqrt(v1));
    }
}
