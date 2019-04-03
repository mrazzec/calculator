package by.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext genericXmlApplicationContext =
                new GenericXmlApplicationContext("context.xml");
        Calculator calculator = genericXmlApplicationContext.getBean("calc", Calculator.class);
        System.out.println(calculator.run());
    }
}
