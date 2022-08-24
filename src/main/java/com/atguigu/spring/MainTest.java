package com.atguigu.spring;

import com.atguigu.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

    }

    public static void test01(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
