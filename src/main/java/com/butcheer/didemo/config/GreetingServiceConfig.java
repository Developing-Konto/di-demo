package com.butcheer.didemo.config;

import com.butcheer.didemo.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Butcheer on 2019-03-07 19:21
 */
@Configuration
public class GreetingServiceConfig {

   @Bean
   GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
      return new GreetingServiceFactory(greetingRepository);
   }



   @Bean
   @Primary
   @Profile({"default", "en"})
   GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
      return greetingServiceFactory.createGreetingService("en");
   }

   @Bean
   @Primary
   @Profile("es")
   GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
      return greetingServiceFactory.createGreetingService("es");
   }

   @Bean
   @Primary
   @Profile("de")
   GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
      return greetingServiceFactory.createGreetingService("de");
   }

}
