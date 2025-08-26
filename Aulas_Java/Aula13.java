import java.util.Arrays;
import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args) {
        int numeros[] = new int[4];
        int n;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            numeros[i] = n;
        }
        System.out.println("Os números digitados foram " + Arrays.toString(numeros));
        teclado.close();
    }
}
