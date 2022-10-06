package com.example.democqrs.handler.base;

import com.example.democqrs.dto.request.base.RequestData;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
public class HandlerFactory {

    private final static Map<Class<? extends RequestData>, Handler> HANDLERS = new HashMap<>();

    private final ApplicationContext context;

    public Handler getHandler(RequestData input) {
        return HANDLERS.get(input.getClass());
    }
    //        HANDLERS.put(GetUsersRequest.class, new GetUsersHandler());

    //   tự động chạy mỗi khi khởi tạo chuong trinh ( -> vòng đời bean )
    @PostConstruct
    public void initHandler() {
//        lấy ra các Bean đac định nghĩa -> put vào map HANDLERS
        Map<String, Handler> handlerMap = context.getBeansOfType(Handler.class);

            handlerMap.forEach((k,v) -> {
                Class<? extends RequestData> requestClassType = getRequestClassType(v.getClass());

                HANDLERS.put(requestClassType, v);
            });
    }

    private Class<? extends RequestData>  getRequestClassType(Class handler) {
        String genericName = handler.getGenericInterfaces()[0].getTypeName();
        genericName = genericName.substring(genericName.indexOf("<")+1,genericName.indexOf(","));

        System.out.println(genericName);
        try {
            return (Class<? extends RequestData>) Class.forName(genericName);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

}
