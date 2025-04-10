public class Replace {
    public static void main(String[] args) {
        String texto = "Eu amo programar em Pyhton, eu amo Python";
        System.out.println(texto.replace("Pyhton", "Java"));

        //REPLACEFIRST

        System.out.println(texto.replaceFirst("Python", "Java"));
    }
}
