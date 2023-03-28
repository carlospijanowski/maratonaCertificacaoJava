package br.com.seteideias.Mapper_ModelMapper.teste;

import br.com.seteideias.Mapper_ModelMapper.model.ObjetoPrincipal;
import br.com.seteideias.Mapper_ModelMapper.model.ObjetoSecundario;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.util.Assert;

public class ConversaoTeste01 {

    public static void main(String[] args) {

        ObjetoSecundario objetoSecundario = new ObjetoSecundario();
        objetoSecundario.setId("001");
        objetoSecundario.setNome("Carlos");

        ModelMapper modelMapper = new ModelMapper();
        ObjetoPrincipal map = modelMapper.map(objetoSecundario, ObjetoPrincipal.class);

        Assert.isTrue(map.getId().equals(objetoSecundario.getId()));


    }

}
