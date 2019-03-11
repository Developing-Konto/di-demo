package com.butcheer.didemo.controllers;

import com.butcheer.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetterInjectedControllerTest {

   private SetterInjectedController setterInjectedController;

   @Before
   public void setUp() {
      this.setterInjectedController = new SetterInjectedController();
      this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
   }


   @Test
   public void testGreeting() {
      assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
   }


}