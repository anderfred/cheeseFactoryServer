package com.anderfred.cheeseFactoryServer.controller;

import com.anderfred.cheeseFactoryServer.aop.LogAOP;
import com.anderfred.cheeseFactoryServer.model.Cheese;
import com.anderfred.cheeseFactoryServer.repository.CheeseRepository;
import com.anderfred.cheeseFactoryServer.service.CheeseService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/cheese")
public class MainController {
    //    private CheeseMapper cheeseMapper;
//
//    public CheeseResource(CheeseMapper cheeseMapper) {
//        this.cheeseMapper = cheeseMapper;
//    }
//
//    @GetMapping("/all")
//    @LogAOP
//    List<Cheese> getCheese() {
//        return cheeseMapper.findAll();
//    }
//
//    @DeleteMapping("/{id}")
//    @LogAOP
//    void deleteCheese(@PathVariable int id) {
//        cheeseMapper.deleteCheeseById(id);
//    }
    private CheeseService cheeseService;

    public MainController(CheeseService cheeseService) {
        this.cheeseService = cheeseService;
    }

    @GetMapping("/{id}")
    @LogAOP
    Cheese getById(@PathVariable Long id) {
        return cheeseService.findById(id).get();
    }

    @GetMapping("/all")
    @LogAOP
    Iterable<Cheese> getAll() {
        return cheeseService.findAll();
    }

    @GetMapping("/delete/{id}")
    @LogAOP
    String delete(@PathVariable Long id) {
        if (cheeseService.findById(id).isPresent()) {
        cheeseService.delete(cheeseService.findById(id).get());return id+" deleted";}
        return id+" not found";
    }
}
