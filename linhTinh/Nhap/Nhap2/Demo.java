package linhTinh.Nhap.Nhap2;

public class Demo {
    public static void main(String[] args) {
        Cha c = new Cha();
        System.out.println(c.count);

        Cha c1 = new Child();
        Child c3 = new Child();
        c3.show();
    }
}
