package com.rest.webservices.restful_web_services.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello")
    String HelloWorld(){
        return  "Hello World";
    }

    @GetMapping(path = "/bean")
    HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("hellooooo");
    }

    @GetMapping(path = "/hello/path-variable/{name}")
    HelloWorldBean HelloWorldPathvar(@PathVariable String name){
        return new HelloWorldBean("hellooooo1212121" + name);
    }


}
