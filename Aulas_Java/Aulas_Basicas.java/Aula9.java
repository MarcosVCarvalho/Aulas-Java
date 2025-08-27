import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o ano de seu nascimento: ");
         int n1 = teclado.nextInt();
         int idade =2025 - n1;
         if (idade < 16){
            System.out.println("Sua idade é " + idade + " vc não vota");
         } else if(idade >= 16 && idade<=18 || idade>70){
            System.out.println("Sua idade é " + idade + " seu voto é opcional");
         } else if(idade >= 18 && idade<=70){
            System.out.println("Sua idade é " + idade + " vc vota");
         } 
         System.out.println("Fim do sistema");

         teclado.close();
    }
}
