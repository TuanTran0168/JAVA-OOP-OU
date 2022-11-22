package linhTinh.OnThi.DeCS2022.Cau2;

public class A implements IA {
    protected String name;

    public A (String name) {
        this.name = name;
    }

    @Override
    public void show() {
       System.out.println(this.name);
    }
    
}
