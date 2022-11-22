package linhTinh.OnThi.De2020_2021.TuLam2;

public class Parent implements IParent {
    @Override
    public void inc() {
        // TODO Auto-generated method stub
        this.x += 5;
    }

    protected int x;

    public Parent(int y) {
        this.x = y;
    }

    public final void show() {
        inc();
        System.out.println(x + 10);
    }
}
