package net.xdclass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka_discovery
 * @description:
 * @author: chenliyang
 * @create: 2022-04-13 22:12
 **/
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @GetMapping(path = "/test")
    public String test() {
        return "test";
    }
}
