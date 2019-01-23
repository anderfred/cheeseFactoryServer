package com.anderfred.cheeseFactoryServer.repository;

import com.anderfred.cheeseFactoryServer.model.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface CheeseRepository extends CrudRepository<Cheese, Long> {
    Optional<Cheese> getCheeseByDate(Date date);
}
