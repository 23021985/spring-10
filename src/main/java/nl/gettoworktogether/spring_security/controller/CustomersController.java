package nl.gettoworktogether.spring_security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomersController {

    @RequestMapping(value = "/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getCurstomers() {
        List<String> data = new ArrayList<>();
        data.add("Jansen");
        data.add("Pietersen");
        data.add("Klaassen");
        return data;
    }

}
