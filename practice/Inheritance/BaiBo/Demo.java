package practice.Inheritance.BaiBo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Ellipse e1 = new Ellipse(30, 20);
        Ellipse e2 = new Circle(15);
        Circle c1 = new Circle(20);
        TamGiac t1 = new TamGiac(10, 20, 30);
        TamGiac t2 = new TamGiacCan(20, 30);
        TamGiac t3 = new TamGiacDeu(45);
        TamGiacCan t4 = new TamGiacCan(15, 30);
        TamGiacCan t5 = new TamGiacDeu(25);
        TamGiacDeu t6 = new TamGiacDeu(24);

        List<Ellipse> dSEllipses = new ArrayList<>();
        List<TamGiac> dSTamGiac = new ArrayList<>();
        dSEllipses.add(e1);
        dSEllipses.add(e2);
        dSEllipses.add(c1);
        

        dSTamGiac.add(t1);
        dSTamGiac.add(t2);
        dSTamGiac.add(t3);
        dSTamGiac.add(t4);
        dSTamGiac.add(t5);
        dSTamGiac.add(t6);


    }
}
