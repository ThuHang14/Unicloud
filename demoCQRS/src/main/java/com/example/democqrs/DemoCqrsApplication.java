package com.example.democqrs;

import com.example.democqrs.handler.base.Handler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class DemoCqrsApplication {
    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(DemoCqrsApplication.class, args);

//        GetUsersHandler bean = context.getBean(GetUsersHandler.class);
//        bean.getInfo();

//        System.out.println(bean.getClass().getPackage().getName());

//        List<Object> myBeans = Arrays.stream(context.getBeanDefinitionNames())
//                .filter(beanName -> context.getBean(beanName).getClass().getPackage().getName().startsWith("com.example.democqrs.handle"))
//                .map(context::getBean).toList();
//
//        for (Object o : myBeans
//        ) {
//            HandleSingleton.getInstance().addHandle(o);
//        }
//
//        System.out.println(HandleSingleton.getInstance().getAllHandle());

        Map<String,Handler> handlerMap = context.getBeansOfType(Handler.class);
//        handlerMap.forEach((k, v) -> System.out.println(k + "-----" + Arrays.toString(v.getClass().getGenericInterfaces())));

        handlerMap.forEach((k,v) -> {
            String handler = k;
            System.out.println(handler);
            String genericName = v.getClass().getGenericInterfaces()[0].getTypeName();
//            genericName = genericName.substring(genericName.indexOf("<")+1,genericName.indexOf(","));

            System.out.println(k);
            System.out.println(genericName);
        });
    }


}
