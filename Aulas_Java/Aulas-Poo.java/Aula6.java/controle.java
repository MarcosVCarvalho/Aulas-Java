public class controle implements interface6 {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolune(int v){
        this.volume = v;
    }
    public boolean getligado(){
        return this.ligado;
    }
    public void setLigado(boolean l){
        this.ligado = l;
    }
    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean t){
        this.tocando = t;
    }
    
    public void ligar(){

    };
    public void desligar(){

    };
    public void abrirmenu(){

    };
    public void fecharmenu(){

    };
    public void maisvolume(){

    };
    public void menosvolume(){

    };
    public void ligarmudo(){

    };
    public void desligarmudo(){

    };
    public void play(){

    };
    public void pause(){

    };
}
