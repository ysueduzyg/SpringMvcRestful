package com.example.SpringRestful.controller;

import com.example.SpringRestful.model.Coffee;
import com.example.SpringRestful.service.CoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author weide
 * date 2022/12/13
 */
@Controller
@Slf4j
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    /**
     * 返回类型为json
     *
     * @param name
     * @return
     */
    @GetMapping(path = "/getByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Coffee getByName(@PathVariable String name) {

        return coffeeService.getCoffeeByName(name);
    }

    /**
     * 返回类型为xml
     *
     * @param id
     * @return
     */
    @GetMapping(path = "/getById/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Coffee getById(@PathVariable Long id) {

        return coffeeService.getCoffeeById(id);
    }


}
