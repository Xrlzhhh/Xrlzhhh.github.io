package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class APP {
    public static void main(String[] args) {
       BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        User user = beanFactory.getBean("userT", User.class);
        System.out.println(user.sayHi("a"));
    }
}
