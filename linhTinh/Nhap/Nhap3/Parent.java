package linhTinh.Nhap.Nhap3;

public class Parent {
    static int count = 0;
    public int dem;


    public Parent () {
        this(5);
        System.out.println("Day la Parent khong tham so");
        count++;
    }

    public Parent (int count) {
        System.out.println("Day la Parent");
    }

    public void test() {
        count++;
        this.dem++;
    }

    public static void aloStatic(String alo) {
        System.out.println("Hello" + alo);
    }

    public final void aloFinal(String alo) {
        System.out.println("Hello" + alo);
    }

    public final void aloFinal(String alo, int x) {
        System.out.println("Hello" + alo);
    }

    public final void aloStatic(String alo, int x) {
        System.out.println("Hello" + alo);
    }
}
