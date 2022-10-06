package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Component
public class HandleManagemenent implements ApplicationContextAware{

    // lưu trữ được tất cả các handle
    // lấy được handle
    // application context để lấy danh sách các handle
    // reflection : để lấy ra request tương ứng với các handle ở trên
    // lưu lại các request và handle tương ứng vào trong map
    private ApplicationContext context;
    private Map<Class<? extends RequestData>, Handler> HANDLER_MAP = new HashMap<>();
//    private Map<Class<? extends CommandRequest>, CommandHandler> COMMAND_HANDLER_MAP = new HashMap<>();
//    private Map<Class<? extends QueryRequest>, QueryHandler> QUERY_HANDLER_MAP = new HashMap<>();

    public <I extends RequestData> Handler getHandle(I requestData) {
        for (Class<? extends RequestData> temp : HANDLER_MAP.keySet())
            if (requestData.getClass().getName().equals(temp.getName())) return HANDLER_MAP.get(temp);

        return null;
    }
//    public <I extends RequestData> CommandHandler getCommandHandle(I requestData) {
//        for (Class<? extends RequestData> temp : COMMAND_HANDLER_MAP.keySet())
//            if (requestData.getClass().getName().equals(temp.getName())) return COMMAND_HANDLER_MAP.get(temp);
//
//        return null;
//    }

    @PostConstruct
    public void init() throws ClassNotFoundException {
        Map<String, Handler> handles = context.getBeansOfType(Handler.class);

//        for (String key : handles.keySet()) {
//            Handler handle = handles.get(key);
//
//            String requestBeanName = handle.getClass().getGenericInterfaces()[0].getTypeName();
//            requestBeanName = requestBeanName.substring(requestBeanName.indexOf('<') + 1, requestBeanName.indexOf(','));
//
//            System.out.println("Handle:" + handle.getClass().getName() + "\tRequest: " + requestBeanName);
//
//            Class request = Class.forName(requestBeanName);
//
//            HANDLER_MAP.put(request, handle);
//        }
        handles.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

}
