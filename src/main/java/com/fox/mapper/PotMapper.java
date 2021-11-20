package com.fox.mapper;

import com.fox.DTO.PotDTO;
import com.fox.domain.Pot;
import org.springframework.stereotype.Component;

@Component
public class PotMapper extends AbstractMapper<Pot, PotDTO> {
    @Override
    public PotDTO mapObjectToDto(Pot pot) {
        if (pot == null) return null;

        PotDTO.PotDTOBuilder potDTOBuilder = PotDTO.builder();
        potDTOBuilder.id(pot.getId());
        potDTOBuilder.name(pot.getName());
        potDTOBuilder.description(pot.getDescription());

        return potDTOBuilder.build();
    }
}
