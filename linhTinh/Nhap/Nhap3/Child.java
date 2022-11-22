package linhTinh.Nhap.Nhap3;

public class Child extends Parent{
    public Child() {
        System.out.println("Day la Child khong tham so");
        count++;
    }

    public Child(String mlem) {
        System.out.println("Day la Child");
    }

    public void thuStatic() {
        Parent.count++;
        System.out.println(count);
    }

}
