package com.butcheer.didemo.controllers;

import com.butcheer.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectedController {

   @Autowired // using VARIABLE NAME!!! to resolve service (if no @Primary)
   @Qualifier("greetingServiceImpl")  // after add @Primary to one of service
   public GreetingService greetingServiceImpl;


   public String sayHello() {
      return greetingServiceImpl.sayGreeting();
   }
}
