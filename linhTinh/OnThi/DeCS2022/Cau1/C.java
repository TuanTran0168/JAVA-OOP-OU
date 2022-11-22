package linhTinh.OnThi.DeCS2022.Cau1;

public class C extends B{
    public C(int y) {
        this.value += y;
    }

    public void inc1() {
        this.value += 4;
    }

    public void inc2() {
        super.inc2();
        super.inc1();
    }
}
