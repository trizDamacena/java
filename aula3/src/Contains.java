public class Contains {
    public static void main(String[] args) {

        String texto = "Eu gosto de Laranja";
        String palavra1 = "Laranja";
        String palavra2 ="Melancia";
        String palavra3 ="laranja";
        System.out.println(texto.contains(palavra1));
        System.out.println(texto.contains(palavra2));
        System.out.print(texto.contains(palavra3));
    }
}
