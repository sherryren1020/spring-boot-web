package com.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public Personv1 getFirstVersionOfPerson(){
        return new Personv1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public Personv2 getSecondVersionOfPerson(){
        return new Personv2(new Name("Bob", "Charlie"));
    }
}
