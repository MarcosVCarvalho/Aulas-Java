public class Aula5 {
    public static void main(String[] args) {
        Conta_banco c1 = new Conta_banco();
        c1.setdono("Marcos Vinicius");
        c1.setnumconta(142);
        c1.abrirconta("cc");
        c1.status();

        c1.depositar(500);
        c1.sacar(80);
        c1.sacar(470);
        c1.fecharConta();
    }
}
