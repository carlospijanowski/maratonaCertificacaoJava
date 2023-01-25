package br.com.seteideias.Anotacoes.exemploAlura;

import br.com.seteideias.Anotacoes.exemploAlura.annotation.ClasseValidadora;
import br.com.seteideias.Anotacoes.exemploAlura.model.Usuario.model.Usuario;
import net.bytebuddy.jar.asm.TypeReference;

import java.time.LocalDate;
import java.time.Month;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mário", "42198284863", "123re",LocalDate.of(1995, Month.MARCH, 14));
        System.out.println(usuario.getOrderNumber());
        System.out.println(Usuario.validador(usuario));
    }
}
