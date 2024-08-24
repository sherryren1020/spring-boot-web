package com.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
class UserDaoService {
    //JPA/Hibernate > database

    //UserDaoService >static List

    private static List<User> users= new ArrayList<>();
    private static int userCount =0;

    static {
        users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Jay", LocalDate.now().minusYears(20)));
        users.add(new User(++userCount,"Hake", LocalDate.now().minusYears(25)));
    }

    public static List<User> findAll() {
        return users;
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);

    }

}
