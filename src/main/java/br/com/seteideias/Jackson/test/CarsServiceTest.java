package br.com.seteideias.Jackson.test;

import br.com.seteideias.Jackson.dto.CarDto;
import br.com.seteideias.Jackson.dto.CarDtoBuilder;
import br.com.seteideias.Jackson.dto.Proprietario;
import br.com.seteideias.Jackson.service.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

@ExtendWith(MockitoExtension.class)
public class CarsServiceTest {
 
    @InjectMocks
    private CarService carService; 

    @Test
    void givenObjectJavaReturnString() throws JsonProcessingException {
        CarDto car = getCarDto();
        String javaToString = carService.javaToString(car);  
    }

    private static CarDto getCarDto() {
        var car = CarDtoBuilder.aCarDto()
                .withId(UUID.randomUUID().toString())
                .withModel("Palio")
                .withColor("gray")
                .withProprietario(getProprietario())
                .build();
        return car;
    }

    private static Proprietario getProprietario() {
        Proprietario proprietario = new Proprietario();
        proprietario.setNomeProprietario("CARLOS");
        return proprietario;
    }

    @Test
    void testarSeOReadTreeFuncionou() throws JsonProcessingException {
        String s = carService.javaToString(getCarDto());
        String s1 = carService.jsonNode(s,"model");
        Assertions.assertEquals(s1,getCarDto().getModel());
    }

    @Test
    void deveRetornarNoCorretamente() throws JsonProcessingException {
        String s = carService.javaToString(getCarDto());
        String s1 = carService.jsonNode(s,"proprietario.nomeProprietario");
        Assertions.assertEquals(s1,getCarDto().getModel());
    }


}
