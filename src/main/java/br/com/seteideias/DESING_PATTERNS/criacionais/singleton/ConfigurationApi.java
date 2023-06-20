package br.com.seteideias.DESING_PATTERNS.criacionais.singleton;

import java.util.Objects;

public class ConfigurationApi {

    private static ConfigurationApi instance;


    public static ConfigurationApi getInstance(){

        synchronized (ConfigurationApi.class){
            if(Objects.isNull(instance)){
                instance = new ConfigurationApi();
            }
        }

        return instance;
    }

}
