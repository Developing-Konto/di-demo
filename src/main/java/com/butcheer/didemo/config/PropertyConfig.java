package com.butcheer.didemo.config;

import com.butcheer.didemo.examplebeans.FakeDataSource;
import com.butcheer.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Butcheer on 2019-03-09 10:28
 */
@Configuration
public class PropertyConfig {

   @Value("${guru.username}")
   String user;
   @Value("${guru.password}")
   String password;
   @Value("${guru.dburl}")
   String url;
   @Value("${guru.jms.username}")
   String jmsUser;
   @Value("${guru.jms.password}")
   String jmsPassword;
   @Value("${guru.jms.dburl}")
   String jmsUrl;


   @Bean
   public FakeDataSource fakeDataSource() {
      FakeDataSource fakeDataSource = new FakeDataSource();
      fakeDataSource.setUser(user);
      fakeDataSource.setPassword(password);
      fakeDataSource.setUrl(url);

      return fakeDataSource;
   }

   @Bean
   public FakeJmsBroker fakeJmsBroker() {
      FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
      fakeJmsBroker.setUser(jmsUser);
      fakeJmsBroker.setPassword(jmsPassword);
      fakeJmsBroker.setUrl(jmsPassword);

      return fakeJmsBroker;
   }

}
