package linhTinh.Nhap.Nhap3;

public class Demo {
    public static void main(String[] args) {
        Parent c1 = new ChildOfChild();
        System.out.println();

        Child c2 = new ChildOfChild();
        System.out.println();

        ChildOfChild c3 = new ChildOfChild();
        System.out.println();

        Child c4 = new Child("AAA");
        System.out.println();

        ChildOfChild c5 = new ChildOfChild("alo");
        c5.thuStatic();

        IParent p1 = new ParentStatic();
    }
}
