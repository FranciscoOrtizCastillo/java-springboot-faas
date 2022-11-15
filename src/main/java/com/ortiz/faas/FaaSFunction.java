package com.ortiz.faas;

import java.util.Map;

import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;

@Component
public class FaaSFunction implements Function<PersonaEntity, Map<String,Object>> {

    @Override
    public Map<String,Object> apply(PersonaEntity persona) {       
        return Map.of( "hola", persona.getNombre(), "numItems", persona.getLista().size() );
    }
    
}
