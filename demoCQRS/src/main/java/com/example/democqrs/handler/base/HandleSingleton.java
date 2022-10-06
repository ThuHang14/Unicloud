package com.example.democqrs.handler.base;

import java.util.ArrayList;
import java.util.List;

public class HandleSingleton {
    private static HandleSingleton instance;
    private List<Object> handles;

    private HandleSingleton() {
        handles = new ArrayList<>();
    }

    //        GET instance
    public synchronized static HandleSingleton getInstance() {
        if (instance == null) {
            instance = new HandleSingleton();
        }
        return instance;
    }

    public void addHandle(Object obj) {
        handles.add(obj);
    }

    public List<Object> getAllHandle(){
        return handles;
    }
}
