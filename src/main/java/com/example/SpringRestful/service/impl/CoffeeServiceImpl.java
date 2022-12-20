package com.example.SpringRestful.service.impl;

import com.example.SpringRestful.mapper.CoffeeMapper;
import com.example.SpringRestful.model.Coffee;
import com.example.SpringRestful.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService {
    @Autowired
    private CoffeeMapper coffeeMapper;


    @Override
    public Coffee getCoffeeById(Long id) {
        return coffeeMapper.findById(id);
    }

    @Override
    public Coffee getCoffeeByName(String name) {
        return coffeeMapper.findByName(name);
    }
}
