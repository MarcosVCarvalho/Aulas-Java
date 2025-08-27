public class Caneta4 {
        private String modelo;
        private float ponta;
        private String cor;
        private boolean tampado;

        public Caneta4(String m,String c){
            this.tampar();
            this.modelo = m;
            this.cor = c;
        }

        public String getModelo(){
            return this.modelo;
        }
        
        public void setModelo(String m){
            this.modelo = m;
        }
        
        public float getPonta(){
            return this.ponta;
        }

        public void setPonta(float p){
            this.ponta = p;
        }

        public void tampar(){
            this.tampado = true;
        }

        public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Cor: " + this.cor);
            System.out.println("Tampado: " + this.tampado);
        }
    }
