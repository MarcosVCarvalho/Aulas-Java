public class Aula10 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador > 0) {
            contador--;
            if (contador % 2 == 0) {
                continue;
            }
            System.out.println("Contando de numero impar: " + contador);
        }
    }
}
