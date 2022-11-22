package linhTinh.OnThi.De2020_2021.TuLam;

public class Child extends Parent{
    public void inc1() {
        x += 5;
        System.out.println("Sau khi goi inc1 CON: " + x);
    }

    public void inc2() {
        x += 10;
        System.out.println("Sau khi goi inc2 CON: " + x);
    }

    @Override
    public void testPublic() {
        // TODO Auto-generated method stub
        super.testPublic();
    }

    @Override
    protected void testProtected() {
        // TODO Auto-generated method stub
        super.testProtected();
    }
}
