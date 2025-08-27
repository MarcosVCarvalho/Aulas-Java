public class Aula10 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador > 0) {
            contador--;
            if (contador % 2 == 0) {
                continue;//pula essa ação,voltando para o inicio do while
            }
            System.out.println("Contando de numero impar: " + contador);
        }
    }
}
