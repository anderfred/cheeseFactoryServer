package com.anderfred.cheeseFactoryServer.mapper;

import com.anderfred.cheeseFactoryServer.model.Cheese;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CheeseMapper {
    @Select("select * from cheese")
    List<Cheese> findAll();
}
