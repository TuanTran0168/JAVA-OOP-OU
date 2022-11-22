package practice.Inheritance.Lab1;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(double canh) {
        super(canh, canh);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public String layTen() {
        // TODO Auto-generated method stub
        return "Hinh Vuong";
    }
}
