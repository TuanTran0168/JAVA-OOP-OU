package practice.Inheritance.BaiBo;

public class TamGiacDeu extends TamGiacCan{
    private double abc;

    public TamGiacDeu(double abc) {
        super(abc, abc);
    }

    public String layTen() {
        return "Hinh Tam Giac Deu";
    }

    public double getAbc() {
        return abc;
    }

    public void setAbc(double abc) {
        this.abc = abc;
    }


}
