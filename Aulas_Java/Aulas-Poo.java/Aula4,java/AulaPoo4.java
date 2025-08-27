public class AulaPoo4 {
    public static void main(String[] args) {
        Caneta4 c1 = new Caneta4("Bic","Preta");
        c1.setPonta(0.6f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
