package linhTinh.OnThi.De3;

public class C implements A, B {
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public void b() {
        System.out.println("Giao dien B");
    }
}
