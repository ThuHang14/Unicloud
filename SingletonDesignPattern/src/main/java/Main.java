import service.ColorMgr;
import service.UserMgr;
import util.Singleton;
import modal.Color;
import modal.Geometry;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Geometry data1 = new Geometry(1, "data 1 ");
        singleton.geometries.add(data1);

        Color color1 = new Color(1, "red");
        Color color2 = new Color(2, "black");

//        them data vao list<modal.Color> , data duoc thong nhat vi chi tao ra mot doi tuong
        singleton.colors.add(color1);
        ColorMgr colorMgr = new ColorMgr();
        colorMgr.addColor(color2);
//        colorMgr.getDataColor();

//        DEMO HANH VI KHI DA LOGGING
        UserMgr userMgr = new UserMgr();
        userMgr.getDataUser();
        userMgr.demoLoginUser1();
        userMgr.getDataUser();
        userMgr.demoLoginUser2();
        userMgr.getDataUser();
    }
}
