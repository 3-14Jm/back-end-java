package com.fox.service;

import com.fox.domain.Pot;
import com.fox.repository.PotRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PotService extends AbstractService<Pot, Integer>{
    public PotRepository potRepository;

    @Override
    protected JpaRepository<Pot, Integer> getRepository() {
        return potRepository;
    }

    public List<Pot> getPotsByParam(String name, int order) {
        List<Pot> vases = (List<Pot>) potRepository.findAll();

        Comparator<Pot> comparatorByName = Comparator.comparing(Pot::getName);
        vases.sort(comparatorByName);

        if (order == 2)
            Collections.reverse(vases);
        return vases;
    }
}
