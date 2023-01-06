package br.com.seteideias.SOLID.liskovSubstitution.solucao.case002;

public class Solucao {

    public class PatoAnimalVerdadeiro {
        public void nadar() {
            //sempre pode nadar
        }
    }

    public class Pata extends PatoAnimalVerdadeiro {
        public void botarOvo() {

        }
    }

    public void main() {
        new Pata();
    }
}
