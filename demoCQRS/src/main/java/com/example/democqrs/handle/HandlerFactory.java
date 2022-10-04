package com.example.democqrs.handle;

import com.example.democqrs.DemoCqrsApplication;
import com.example.democqrs.dto.request.GetUsersRequest;
import com.example.democqrs.dto.request.RequestData;
import com.example.democqrs.handle.user.GetUsersHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@Configuration
//@ComponentScan(basePackages = "com.example.democqrs")
public class HandlerFactory {

    private final static Map<Class<? extends RequestData>, Handler> HANDLERS = new HashMap<>();

    public static Handler getHandler(RequestData input) {
        return HANDLERS.get(input.getClass());
    }

    //   tự động chạy initHandler mỗi khi khởi tạo chuong trinh ( -> vòng đời bean )
    @PostConstruct
    public void initHandler() {

        GetUsersHandler handler = new GetUsersHandler();
        handler.getClass().getGenericInterfaces();
//        ger / com
        HANDLERS.put(GetUsersRequest.class, new GetUsersHandler());

        //  TODO: lấy tất cả các Handler Bean ( @Component ) và put vào map

        ApplicationContext context = SpringApplication.run(DemoCqrsApplication.class);

        String[] handleBeans = context.getBeanDefinitionNames();
        for (String s : handleBeans
             ) {
//            HANDLERS.put(s.getClass().getGenericInterfaces().getClass(),s);
        }
//        handleBeans.getGenericInterfaces();

    }

}
