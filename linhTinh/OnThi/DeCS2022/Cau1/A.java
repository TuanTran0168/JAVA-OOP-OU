package linhTinh.OnThi.DeCS2022.Cau1;

public class A {
    protected int value;

    public A (int x) {
        this.value = x;
    }

    public A() {
        this(1);
    }

    public void inc1() {
        this.value += 1;
    }

    public void inc2() {
        this.value += 2;
    }

    public final void show() {
        System.out.println(this.value);
    }
}
