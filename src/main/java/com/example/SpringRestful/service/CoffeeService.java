package com.example.SpringRestful.service;

import com.example.SpringRestful.model.Coffee;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

public interface CoffeeService {

    public Coffee getCoffeeById(Long id);

    public Coffee getCoffeeByName(String name);
}
