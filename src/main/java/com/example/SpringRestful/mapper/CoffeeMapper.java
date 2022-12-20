package com.example.SpringRestful.mapper;

import com.example.SpringRestful.model.Coffee;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CoffeeMapper {

    @Select("select id,name,price,create_time,update_time from t_coffee where id = #{id}")
    Coffee findById(@Param("id") Long id);

    @Select("select id,name,price,create_time,update_time from t_coffee where name = #{name}")
    Coffee findByName(@Param("name") String name);
}
