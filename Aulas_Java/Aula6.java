import java.util.Scanner;
import javax.swing.JFrame;

public class Aula6 {
    public static void main(String[] args) {
        Scanner reacao = new Scanner(System.in);
        System.out.println("Digite sua opinião sobre seu salario: ");
        String resposta = reacao.nextLine();

        float salario = 1500.2f;
        String nome = "Marquinhos";

        System.out.printf("O salario do %s é de %.2f \n",nome, salario);
        System.out.println("Opinião sobre o salario: " + resposta);

        reacao.close();
    }
    
}
