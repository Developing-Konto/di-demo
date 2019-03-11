package com.butcheer.didemo.services;

import guru.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
