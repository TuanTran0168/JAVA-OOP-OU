package practice.Inheritance.BaiBo;

public class TamGiacCan extends TamGiac{
    private double ab, c;

    public TamGiacCan(double ab, double c) {
        super(ab, ab, c);
    }

    public String layTen() {
        return "Hinh Tam Giac Can";
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
