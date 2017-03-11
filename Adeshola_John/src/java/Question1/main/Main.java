package Question1.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Question1.bean.SpringWriter;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
    BeanFactory factory = context;
    SpringWriter test = (SpringWriter) factory.getBean("SpringWriter");
    test.run();
  }
} 