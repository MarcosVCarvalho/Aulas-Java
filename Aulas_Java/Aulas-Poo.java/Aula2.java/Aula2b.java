public class Aula2b {
   public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.cor = "Azul";
    c1.modelo = "Bic";
    //c1.ponta = 0.5f;
    c1.tampada = true;
    c1.carga = 80;

    c1.status();
    c1.destampar();
    c1.rasbicar();
   
   } 
}
