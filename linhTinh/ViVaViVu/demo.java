package linhTinh.ViVaViVu;

import java.util.Date;

public class demo {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People("Duy", 30, "30/4/1999");

        Date p3Date = new Date("1/6/2000");
        People p3 = new People("Thong", 50, p3Date);

        p1.showPeople();
        p2.showPeople();
        p3.showPeople();

        People p4 = new BadGirl();
        p4.showPeople();
    }
}
