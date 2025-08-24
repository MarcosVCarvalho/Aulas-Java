import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, n1 = 0;
        String resposta;
        do {
            System.out.println("------------Somador------------");
            System.out.print("Digite um numero: ");
            n1 = teclado.nextInt();
            soma += n1;
            teclado.nextLine();
            System.out.print("Deseja parar?[s/n]: ");
            resposta = teclado.nextLine();
        } while (!resposta.equals("s"));
        System.out.println("A soma dos numeros é " + soma);
        teclado.close();
    }
}
