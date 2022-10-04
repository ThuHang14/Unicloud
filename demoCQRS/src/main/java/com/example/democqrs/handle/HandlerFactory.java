package com.example.democqrs.handle;

import com.example.democqrs.dto.request.GetUsersRequest;
import com.example.democqrs.dto.request.RequestData;
import com.example.democqrs.handle.user.GetUsersHandler;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

//@Configuration
//@ComponentScan(basePackages = "com.example.democqrs")
public class HandlerFactory {

    private final static Map<Class<? extends RequestData>, Handler> HANDLERS = new HashMap<>();

    public static Handler getHandler(RequestData input) {
        return HANDLERS.get(input.getClass());
    }

    //   tự động chạy mỗi khi khởi tạo chuong trinh ( -> vòng đời bean )
    @PostConstruct
    public void initHandler() {

//        GetUsersHandler handler = new GetUsersHandler();
//        handler.getClass().getGenericInterfaces();
////        ger / com  handleBeans.getGenericInterfaces();
//        HANDLERS.put(GetUsersRequest.class, new GetUsersHandler());

        //  TODO: lấy tất cả các Handler Bean ( @Component ) và put vào map
        for (Object o : HandleSingleton.getInstance().getAllHandle()
        ) {
//            HANDLERS.put(o.getClass().getGenericInterfaces(), o);
        }

    }

}
