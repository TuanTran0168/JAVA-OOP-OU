package practice.Inheritance.Lab5;

public class PersonnelC extends Personnel {
    public final double COEFFICIENTS_SALARY = 2.5; // Hệ số lương

    public PersonnelC(String idNumber, String name, String country, boolean gender, String phoneNumber) {
        super(idNumber, name, country, gender, phoneNumber);
        // TODO Auto-generated constructor stub
    }

    public PersonnelC() {

    }

    @Override
    public double payroll(int workDay) {
        // TODO Auto-generated method stub
        return super.payroll(workDay) * this.COEFFICIENTS_SALARY;
    }

}
