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
        Arrays.sort(numeros);
        System.out.println("Os números digitados em ordem crescente foram: " + Arrays.toString(numeros));
        int resultado = Aula15.soma(5,10);
        System.out.println("O resultado foi " + resultado);
        teclado.close();
    }
}
