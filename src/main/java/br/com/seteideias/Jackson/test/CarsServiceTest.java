package br.com.seteideias.Jackson.test;

import br.com.seteideias.Jackson.dto.CarDto;
import br.com.seteideias.Jackson.dto.CarDtoBuilder;
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
        var car = CarDtoBuilder.aCarDto()
                .withId(UUID.randomUUID().toString())
                .withModel("Palio")
                .withColor("gray")
                .build();

        String javaToString = carService.javaToString(car);

//        Assertions.assertEquals(javaToString, contains);
    }


}
