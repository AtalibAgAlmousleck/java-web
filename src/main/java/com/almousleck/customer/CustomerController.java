package com.almousleck.customer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Almousleck on Mar, 2024
 */
@RestController
@RequestMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    @GetMapping("list")
    public List<Object> message() {
        return List.of(
                new Customer(1, "Housman", "housman@gmail.com"),
                new Customer(2, "Frank", "fank@gmail.com"),
                new Customer(3, "Mamadou", "mamadou@gmail.com"),
                new Customer(4, "Momo", "momo@gmail.com")
        );
    }
}
