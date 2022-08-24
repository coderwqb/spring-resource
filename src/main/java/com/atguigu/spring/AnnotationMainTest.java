package com.atguigu.spring;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import com.atguigu.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
       // Person bean = applicationContext.getBean(Person.class);
//        System.out.println(bean);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        Person person1 = applicationContext.getBean(Person.class);
//        Person person2 = applicationContext.getBean(Person.class);
//        Cat cat1 = person1.getCat();
//        //cat1.setName("罗打黑");
//        Cat cat2 = person2.getCat();
//        System.out.println(cat1 == cat2);
//        System.out.println(person1==person2);
//        ApplicationContext applicationContext1 = bean.getApplicationContext();
//        System.out.println(applicationContext == applicationContext1);
    }
}
