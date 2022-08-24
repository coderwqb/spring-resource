package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
//@Import(MyImportRegister.class)
//@Import(Person.class)
@ComponentScan("com.atguigu.spring")
public class MainConfig {
    public MainConfig() {
        System.out.println("MainConfig..创建了");
    }
//    @Bean
//    public Person person() {
//        Person person = new Person();
//        person.setName("张三");
//        return person;
//    }
}

//class MyImportRegister implements ImportBeanDefinitionRegistrar {
//    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
//                                        BeanDefinitionRegistry registry) {
//        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
//        rootBeanDefinition.setBeanClass(Cat.class);
//        registry.registerBeanDefinition("tomCat", rootBeanDefinition);
//    }
//}
