public class Aula8 {
    public static void main(String[] args) {
        int n1,n2,r;
        n1 = 4;
        n2 = 7;
        // Se n1 > n2, R recebe 0, senão recebe 1
        r = (n1>n2) ?0:1;
        System.out.println(r);

        String nome1 = "marcos";
        String nome2 = "marcos";
        String nome3 = new String ("marcos");
        String resposta;
        resposta = nome1 == nome2 ? "Igual":"Diferente";
        System.out.println(resposta);
        resposta = nome1.equals(nome3) ? "Igual":"Diferente";
        System.out.println(resposta);





    }
}
