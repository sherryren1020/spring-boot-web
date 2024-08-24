package com.rest.webservices.restful_web_services.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    //Get all users
    private UserDaoService service;
    public UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    List<User> retriveAllUser(){
        return  service.findAll();
    }

    @GetMapping("/users/{id}")
    User retriveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user == null) throw new UserNotFoundException("id : " + id);

        return  user;
    }

    @DeleteMapping ("/users/{id}")
    void deleteUser(@PathVariable int id){
        service.deleteById(id);
//        if(user == null) throw new UserNotFoundException("id : " + id);

    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();  //users/id
        return ResponseEntity.created(location).build();
    }
}
