package com.fox.controller;

import com.fox.DTO.PotDTO;
import com.fox.domain.Pot;
import com.fox.mapper.AbstractMapper;
import com.fox.mapper.PotMapper;
import com.fox.service.AbstractService;
import com.fox.service.PotService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/pots")
@RestController
@AllArgsConstructor
public class PotController extends AbstractController<Pot, PotDTO, Integer> {
    private final PotService potService;
    private final PotMapper potMapper;


    @Override
    protected AbstractService<Pot, Integer> getService() {
        return potService;
    }

    @Override
    protected AbstractMapper<Pot, PotDTO> getMapper() {
        return potMapper;
    }
}