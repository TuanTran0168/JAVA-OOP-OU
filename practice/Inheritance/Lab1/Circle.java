package practice.Inheritance.Lab1;

public class Circle extends Ellipse{

    public Circle(double banKinh) {
        super(banKinh, banKinh);
    }
    
   @Override
   public String layTen() {
       // TODO Auto-generated method stub
       return "Hinh Circle";
   }
}
