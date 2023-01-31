package br.com.seteideias.Anotacoes.blueDevCanal;

public class LogicaDeNegocio {
    @CanRun
    public void saque() {
        System.out.println("metodo saque");
    }

    public void extrato() {
        System.out.println("metodo extrato");
    }
    @CanRun
    public void deposito() {
        System.out.println("metodo deposito");

    }
}
