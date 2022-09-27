package controller;

import modal.*;
import service.ExtendsAbstract;
import service.ImplementInterface;
import service.ImplementInterface2;

public class main {
    public static void main(String[] args) {

//       Demo Interface
        DemoInterface demoInterface = new ImplementInterface();
        DemoInterface demoInterface2 = new ImplementInterface2();
//        System.out.println(demoInterface.draw() + "---" + demoInterface2.draw());

//Demo Abstract
        DemoAbstract demoAbstract = new ExtendsAbstract();
//        System.out.println(demoAbstract.colors() + " -----" + demoAbstract.draw());


//        Enum
        DemoEnum enum1 = DemoEnum.SPRING;
        DemoEnum enum2 = DemoEnum.SUMMER;
//        System.out.println(enum1 + "----" + enum2 );


//        Ép Kiểu Ngầm Định Từ Lớp Con Sang Lớp Cha
        DemoEpKieu demoEpKieu = new DemoEpKieu();
        ExtendEpKieu extendEpKieu = new ExtendEpKieu();

        demoEpKieu.setName("ten1");
        extendEpKieu.setName("tenEX1");
//        demoEpKieu.print();
//        extendEpKieu.print();
//        ep kieu
        demoEpKieu = extendEpKieu;
//        demoEpKieu.print();
//        extendEpKieu.print();
//        nguoc lai
        demoEpKieu.setName("ten02");
        extendEpKieu = (ExtendEpKieu) demoEpKieu;
//        demoEpKieu.print();
//        extendEpKieu.print();


//        Wrapper
        int a = 10;
        Integer A = Integer.valueOf(a);
        System.out.println(a + " -- " + A);
        System.out.println(A.toString() + " - " + A.byteValue() + " - " + A.describeConstable());

        
    }
}
