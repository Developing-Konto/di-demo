package com.butcheer.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Butcheer on 2019-02-12 14:29
 */

public class PrimarySpanishGreetingService implements GreetingService {
   private GreetingRepository greetingRepository;


   public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
      this.greetingRepository = greetingRepository;
   }

   @Override
   public String sayGreeting() {
      return greetingRepository.getSpanishGreeting();
   }
}
