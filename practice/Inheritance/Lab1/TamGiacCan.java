package practice.Inheritance.Lab1;

public class TamGiacCan extends TamGiac {
    public TamGiacCan(double canhAB, double canhC) throws Exception {
        super(canhAB, canhAB, canhC);
    }

    @Override
    public String layTen() {
        // TODO Auto-generated method stub
        return "Hinh Tam Giac Can";
    }
}
