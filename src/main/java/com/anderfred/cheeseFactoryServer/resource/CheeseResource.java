package com.anderfred.cheeseFactoryServer.resource;

import com.anderfred.cheeseFactoryServer.mapper.CheeseMapper;
import com.anderfred.cheeseFactoryServer.model.Cheese;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/cheese")
public class CheeseResource {
    private CheeseMapper cheeseMapper;

    public CheeseResource(CheeseMapper cheeseMapper) {
        this.cheeseMapper = cheeseMapper;
    }

    @GetMapping("/all")
    List<Cheese> getCheese() {
        return cheeseMapper.findAll();
    }
}
