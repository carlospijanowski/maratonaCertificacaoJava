package br.com.seteideias.Anotacoes.exemploAlura.model.Usuario.model;

import br.com.seteideias.Anotacoes.exemploAlura.annotation.Validador;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
public class Usuario {
    private String nome;
    private String cpf;

    @Validador
    private String orderNumber;

    private LocalDate dataNascimento;

    public boolean usuarioValido(Usuario usuario) {
        if (!usuario.getNome().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")) {
            return false;
        }
        if (!usuario.getCpf().matches("[^0-9]+")) {
            return false;
        }
        return Period.between(usuario.getDataNascimento(), LocalDate.now()).getYears() >= 18;
    }

    public static <T> boolean validador(T objeto) {
        Class<?> classe = objeto.getClass();
        for (Field field : classe.getDeclaredFields()) {
            if (field.isAnnotationPresent(Validador.class)) {
                Validador validador = field.getAnnotation(Validador.class);
                try {
                    field.setAccessible(true);
                    String order = (String) field.get(objeto);
                    return order.contains("RE");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

}
