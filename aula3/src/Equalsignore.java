public class Equalsignore {
    public static void main(String[] args) {
        String palavra1 = "Laranja";
        String palavra2 = "Melancia";
        String palavra3 = "laranja";

        System.out.println(palavra1.equalsIgnoreCase("Laranja"));
        System.out.println(palavra1.equalsIgnoreCase(palavra2));
        System.out.println(palavra1.equalsIgnoreCase(palavra3));
    }
}
