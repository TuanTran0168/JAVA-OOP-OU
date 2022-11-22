package linhTinh.Nhap.Nhap2;

public class Child extends Cha {
    public void show() {
        System.out.println(super.count);
    }

    public Child() {
        super.count++;
    }
}
