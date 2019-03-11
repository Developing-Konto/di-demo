package com.butcheer.didemo.controllers;

import com.butcheer.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectedControllerTest {

   private PropertyInjectedController propertyInjectedController;


   @Before
   public void setUp() throws Exception {

      this.propertyInjectedController = new PropertyInjectedController();
      this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
   }

   @Test
   public void testGreeting() {
      assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
   }
}