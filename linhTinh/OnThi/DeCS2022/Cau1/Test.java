package linhTinh.OnThi.DeCS2022.Cau1;

public class Test {
    public static void main(String[] args) {
        C a1 = new C(10);
        a1.inc1();
        a1.show();

        A a2 = new B();
        a2.inc1();
        a2.inc2();
        a2.show();

        A a3 = new C(3);
        a3.inc1();
        a3.inc2();
        a3.show();
    }
}
