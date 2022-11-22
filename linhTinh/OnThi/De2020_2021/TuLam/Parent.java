package linhTinh.OnThi.De2020_2021.TuLam;

public class Parent {
    protected static int x;

    public Parent() {
        x = 0;
        System.out.println("Khoi tao ne: " + x);
    }

    public final void show() {
        System.out.println(x);
    }

    protected void inc1() {
        x++;
        System.out.println("Sau khi goi inc1 CHA: " + x);
    }

    private void inc2() {
        x += 2;
        System.out.println("Sau khi goi inc2 CHA: " + x);
    }

    public void inc() {
        this.inc1();
        this.inc2();
        x +=2;
        System.out.println("Sau khi cong 2 inc CHA: " + x);
    }

    private void testPrivate() {
        System.out.println("Day la test Private");
    }

    public void testPublic() {
        System.out.println("Day la test Public");
    }

    protected void testProtected() {
        System.out.println("Day la test Public");
    }
}
