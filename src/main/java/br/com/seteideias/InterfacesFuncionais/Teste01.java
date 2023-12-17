package br.com.seteideias.InterfacesFuncionais;

public class Teste01 {

    interface EnviarParaEndPoint{
        void send(String x, int a, int b);
    }

    @FunctionalInterface
    interface Calcular{
        double execute(int a, int b);
    }

    public static void main(String[] args) {
        EnviarParaEndPoint ev = (x,axx,b)  -> System.out.println("enviar String.:: "+x);

        ((EnviarParaEndPoint) (x, a, b) -> {
            System.out.println(a + b);
            System.out.println("sds.: "+x+ (a + b));
            System.out.println(a + b);
        }).send("s",1,1);

        System.out.println("****************************************************");

        Calcular calcular = (x,y)->x*y;
        double execute = calcular.execute(5, 5);
        System.out.println("RESULTADO.: "+execute);

        calcular = (x,y)->{
            int i = x + y;
            int i1 = i * x;
            return i1;
        };

        execute = calcular.execute(2, 3);
        System.out.println("RESULTADO.: "+execute);

    }

}
