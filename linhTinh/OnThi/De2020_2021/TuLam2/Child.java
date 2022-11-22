package linhTinh.OnThi.De2020_2021.TuLam2;

public class Child extends Parent{

    public Child(int y) {
        super(y);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void inc() {
        // TODO Auto-generated method stub
        super.inc();
        x -= 15;
    }
    
}
