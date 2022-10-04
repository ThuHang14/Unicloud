package com.example.democqrs;

import com.example.democqrs.handle.HandleSingleton;
import com.example.democqrs.handle.user.GetUsersHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoCqrsApplication {
    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(DemoCqrsApplication.class, args);

        GetUsersHandler bean = context.getBean(GetUsersHandler.class);
//        bean.getInfo();

//        System.out.println(bean.getClass().getPackage().getName());

//        String[] allBeanNames = context.getBeanDefinitionNames();
//        for (String beanName : allBeanNames) {
//            System.out.println(beanName);
//        }
//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        List<Object> myBeans = Arrays.stream(context.getBeanDefinitionNames())
                .filter(beanName -> context.getBean(beanName).getClass().getPackage().getName().startsWith("com.example.democqrs.handle"))
                .map(context::getBean).toList();

        for (Object o : myBeans
        ) {
            HandleSingleton.getInstance().addHandle(o);
        }

        System.out.println(HandleSingleton.getInstance().getAllHandle());
    }

}
