package linhTinh.OnThi.KeThua_GiaoDien;

public class Child extends Parent implements IParent {

    @Override
    public void getAddress() {
       System.out.print(" Child class overrides the Parent class getAddress()");
    }

    @Override
    public void getMobileNumber() {
        System.out.print(" Child class overrides the Parent class getMobileNumber()");
    }

    @Override
    public void getAge() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    // @Override
    // public void getName() {
    //     // TODO Auto-generated method stub
    // //    System.out.println("Name of child");
    // }
}
