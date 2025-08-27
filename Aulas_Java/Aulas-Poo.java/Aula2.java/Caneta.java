public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada: " + this.tampada);
        System.out.println("A carga entar em " + this.carga + "%");
        System.out.println("A tampa é:  " + this.ponta);
    }
    protected void destampar(){
        this.tampada = false;
        System.out.println("Destampando");
    }
    protected void tampar(){
        this.tampada = true;
        System.out.println("Tampada");
    }
    public void rasbicar(){
        if (tampada == true) {
            System.out.println("Caneta está tampada,não pode rasbiscar");
        }else{
            System.out.println("Caneta está riscando");
        }

    }
}
