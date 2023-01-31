package br.com.seteideias.Anotacoes.blueDevCanal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class TestaAnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        LogicaDeNegocio logica = new LogicaDeNegocio();
//        Method[] methods = logica.getClass().getMethods();
//        for (Method  method :  methods) {
//            CanRun anot = method.getAnnotation(CanRun.class);
//            if(Objects.nonNull(anot)){
//                method.invoke(logica);
//            }
//        }


        LogicaDeNegocio deNegocio = new LogicaDeNegocio();
        Method[] declaredMethods = deNegocio.getClass().getDeclaredMethods();
        for ( Method method: declaredMethods){
            CanRun annotation = method.getAnnotation(CanRun.class);
            if(Objects.nonNull(annotation)){
                method.invoke(deNegocio);
            }
        }


    }
}
