package net.xdclass.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: eureka_discovery
 * @description:
 * @author: chenliyang
 * @create: 2022-04-13 22:12
 **/
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @GetMapping(path = "/test")
    public String test() {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "test" + port;
    }
}
