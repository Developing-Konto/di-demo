package com.butcheer.didemo;

import com.butcheer.didemo.controllers.ConstructorInjectedController;
import com.butcheer.didemo.controllers.MyController;
import com.butcheer.didemo.controllers.PropertyInjectedController;
import com.butcheer.didemo.controllers.SetterInjectedController;
import com.butcheer.didemo.examplebeans.FakeDataSource;
import com.butcheer.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

   public static void main(String[] args) {

      ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

      MyController controller = (MyController) ctx.getBean("myController");

      FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);


      FakeJmsBroker  fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

      System.out.println("Fake user name: " + fakeDataSource.getUser());
      System.out.println("Fake JSM user name: " + fakeJmsBroker.getUser());


   }

}

