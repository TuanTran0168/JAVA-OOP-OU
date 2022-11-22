package practice.Inheritance.Lab5;

public class PersonnelA extends Personnel {
    public final double COEFFICIENTS_SALARY = 1.2; // Hệ số lương

    public PersonnelA(String idNumber, String name, String country, boolean gender, String phoneNumber) {
        super(idNumber, name, country, gender, phoneNumber);
        // TODO Auto-generated constructor stub
    }

    public PersonnelA() {

    }

    @Override
    public double payroll(int workDay) {
        // TODO Auto-generated method stub
        return super.payroll(workDay) * this.COEFFICIENTS_SALARY;
    }
}
