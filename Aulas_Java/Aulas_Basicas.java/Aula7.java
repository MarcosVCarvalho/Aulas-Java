public class Aula7 {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 25;
        int n3 = 3;
        n3 --;
        float media = (n1+n2+n3)/3;
        System.out.println("A media é: " + media);
        Float n = 4.6f;
        System.out.print(n + " arredondado é ");
        int arredondamento = (int)Math.floor(n);
        System.out.println(arredondamento);
        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
    }
}
