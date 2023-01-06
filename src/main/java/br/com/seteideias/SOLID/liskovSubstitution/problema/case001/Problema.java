package br.com.seteideias.SOLID.liskovSubstitution.problema.case001;

public class Problema {

    public class PatoAnimalVerdadeiro {
        public void nadar(){
        }
        public void pula(){
        }
        public void bica(){
        }
    }

    public class PatoDeBrinquedo extends PatoAnimalVerdadeiro{
        public PatoDeBrinquedo(boolean temBateria) {
            this.temBateria = temBateria;
        }
        boolean temBateria;
        @Override
        public void nadar() {
            //problema... uma classe que herda e tem if... ops...provavelmente temos um problema na abstracao
            if(temBateria == true){
                // nada no lago ja que tem bareria
            }
        }
    }
    public void main() {
        new PatoDeBrinquedo(false).nadar();
    }

}
