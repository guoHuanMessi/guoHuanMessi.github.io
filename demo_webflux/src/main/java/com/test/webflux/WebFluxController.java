package com.test.webflux;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class WebFluxController {

    @GetMapping (value = "/list", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> queryUsers() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userList.add(new User("aaa"+i,"man",20));
        }
        return Flux.fromIterable(userList).delayElements(Duration.ofSeconds(1));
    }

    @GetMapping("/oneUser")
    public Mono<User> getUser(){
        return Mono.just(new User("zhuhuan","woman",23));
    }
}
