public class Conta_banco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private int saldo;
    private boolean statusConta;

    public Conta_banco(){
        this.setsaldo(0);
        this.setstatusConta(false);;
    }

    public void setnumconta(int nc){
        this.numConta = nc;
    }
    public int getnumconta(){
        return this.numConta;
    }

    public void setsaldo(int s){
        this.saldo = s;
    }
    public int getsaldo(){
        return this.saldo;
    }

    public void setstatusConta(boolean s){
        this.statusConta = s;
    }
    public boolean getstatusConta(){
        return this.statusConta;
    }

    public void settipoConta(String tc){
        this.tipoConta = tc;
    }
    public String gettipoConta(){
        return this.tipoConta;
    }

    public void setdono(String dc){
        this.dono = dc;
    }
    public String getdono(){
        return this.dono;
    }


    public void abrirconta(String tc){
        this.setstatusConta(true);
        if (tc == "cc") {
            this.setsaldo(50);
            this.settipoConta("Conta Corrente");
        }else if(tc == "cp"){
            this.setsaldo(150);
            this.settipoConta("Conta Poupança");
        }
    }
    public void fecharConta(){
        if (this.getsaldo() > 0) {
            System.out.println("Conta não pode ser fechada - Saldo Disponivel");
        }else if (this.getsaldo() < 0) {
            System.out.println("Conta não pode ser fechada - Dividas Pendentes");
            System.out.println("---------------------------------------------------");
        } else {
            this.setstatusConta(false);
            System.out.println("Fechando Conta");
            System.out.println("---------------------------------------------------");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.gettipoConta() == "Conta Corrente") {
            v = 12;
        } else if (this.gettipoConta() == "Conta Poupança") {
            v = 20;
        }   
        if (this.getstatusConta()) {
            this.setsaldo(this.getsaldo() - v);
            System.out.println("Pagamento realizado com sucesso - Saldo: " + this.getsaldo() );
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.println("Pagamento Não realizado - Conta está fechada ");
            System.out.println("---------------------------------------------------");
        }
    }

    public void status(){
        System.out.println("------------------Status de Conta------------------");
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo de conta: " + this.tipoConta);
        System.out.println("Dona da conta: " + this.dono);
        System.out.println("Saldo da conta: R$" + this.saldo);
        System.out.println("Status da conta: " + this.statusConta);
        System.out.println("---------------------------------------------------");
    }

    public void depositar(int valor){
        if (this.getstatusConta()) {
            this.setsaldo(this.getsaldo() + valor);
            System.out.println("Deposito de R$" + valor + " realizado com sucesso - Saldo: R$" + this.getsaldo() );
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("Imposivel Depositar em conta fechada");
            System.out.println("---------------------------------------------------");
        }
    }

    public void sacar(int valor){
       if (this.getstatusConta()) {
            if (this.getsaldo() >= valor) {
                this.setsaldo(this.getsaldo() - valor);
                System.out.println("Saque de R$" + valor + " realizado na conta de " + this.getdono());
                System.out.println("Saldo restante: R$" + this.getsaldo());
                System.out.println("---------------------------------------------------");
            } else {
                System.out.println("Saldo insuficiente senhor " + this.getdono());
                System.out.println("Saldo restante: R$" + this.getsaldo());
                System.out.println("---------------------------------------------------");
            }
        } else {
            System.out.println("Imposivel Depositar em conta fechada");
            System.out.println("---------------------------------------------------");
        }
    }
}
