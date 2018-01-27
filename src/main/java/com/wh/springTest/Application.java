package com.wh.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "Hello World!";
            }
        };
    }

  public static void main(String[] args) {
      ApplicationContext context =new FileSystemXmlApplicationContext("/src/main/resources/spring-idol.xml"); 
          //new AnnotationConfigApplicationContext(Application.class);
      //MessagePrinter printer = context.getBean(MessagePrinter.class);
      //printer.printMessage();
      Performer performer=(Performer)context.getBean("duke");
      performer.performer();
  }
}
