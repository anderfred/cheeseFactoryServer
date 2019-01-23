package com.anderfred.cheeseFactoryServer.service;

import com.anderfred.cheeseFactoryServer.model.Cheese;

import java.util.Date;
import java.util.Optional;

public interface CheeseService {

    <S extends Cheese> S save(S s);

    Optional<Cheese> findById(Long id);

    Iterable<Cheese> findAll();

    Optional<Cheese> getCheeseByDate(Date date);

    void delete(Cheese cheese);
}
