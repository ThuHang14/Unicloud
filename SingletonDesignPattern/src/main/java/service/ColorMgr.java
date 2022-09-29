package service;

import modal.Color;
import util.Singleton;
import util.Util;

public class ColorMgr {
//    lay ra doi tuong
    Singleton colorManager = Singleton.getInstance();

    public void setColorData() {
        colorManager.getConnection();
    }

    public void addColor(Color color) {
        colorManager.colors.add(color);
    }

    public void getDataColor() {
        Util.getData(colorManager.colors);
    }
}
