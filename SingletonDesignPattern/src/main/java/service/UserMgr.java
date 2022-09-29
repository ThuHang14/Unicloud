package service;

import modal.Color;
import modal.Geometry;
import modal.User;
import util.Singleton;
import util.Util;

public class UserMgr {
    Singleton users = Singleton.getInstance();


    public User demoLogin(User user){
        users.users.clear();
        users.users.add(user);

        return user;
    }

    public void demoLoginUser1(){
        User user = new User(1,"user1",users.colors.get(1),users.geometries.get(0));
        demoLogin(user);
    }

    public void demoLoginUser2(){
        User user = new User(2,"user2",users.colors.get(0),users.geometries.get(0));
        demoLogin(user);
    }


    public void getDataUser() {
        Util.getData(users.users);
    }
}
