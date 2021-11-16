package com.fox.service;

import com.fox.domain.Pot;
import com.fox.repository.PotRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PotService extends AbstractService<Pot, Integer>{
    public PotRepository amenityRepository;

    @Override
    protected JpaRepository<Pot, Integer> getRepository() {
        return amenityRepository;
    }
}
