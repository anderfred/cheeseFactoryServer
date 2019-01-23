package com.anderfred.cheeseFactoryServer.service;

import com.anderfred.cheeseFactoryServer.model.Cheese;
import com.anderfred.cheeseFactoryServer.repository.CheeseRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CheeseServiceImpl implements CheeseService {
    private CheeseRepository cheeseRepository;

    public CheeseServiceImpl(CheeseRepository cheeseRepository) {
        this.cheeseRepository = cheeseRepository;
    }

    @Override
    public <S extends Cheese> S save(S s) {
        return cheeseRepository.save(s);
    }

    @Override
    public Optional<Cheese> findById(Long id) {
        return cheeseRepository.findById(id);
    }

    @Override
    public Iterable<Cheese> findAll() {
        return cheeseRepository.findAll();
    }

    @Override
    public Optional<Cheese> getCheeseByDate(Date date) {
        return cheeseRepository.getCheeseByDate(date);
    }

    @Override
    public void delete(Cheese cheese) {
        cheeseRepository.delete(cheese);
    }
}
