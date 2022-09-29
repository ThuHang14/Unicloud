package util;

import modal.Color;
import modal.Geometry;
import modal.User;

import java.util.ArrayList;
import java.util.List;

public final class Singleton {
    private static Singleton instance;
    public List<Color> colors;
    public List<Geometry> geometries;
    public List<User> users;

//    Constructor de la private
    private Singleton() {
        colors = new ArrayList<>();
        geometries = new ArrayList<>();
        users = new ArrayList<>();
    }

    //    GET instance (chi tao mot lan duy nhat )
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

//    DATABASE
    public void getConnection(){
        System.out.println("connection database ");
    }

}
