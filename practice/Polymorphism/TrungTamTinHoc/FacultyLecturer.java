package practice.Polymorphism.TrungTamTinHoc;

import java.util.Date;

public class FacultyLecturer extends Lecturers {
    private double basicPay; // Lương cơ bản
    private double coefficientsSalary; // Hệ số lương
    private final double HOURLY_EARNINGS = 90000; // Thu nhập theo giờ

    public FacultyLecturer(String name, Date dateOfBirth, String academicRank, String degree, Date startDateForJob,
            double basicPay, double coefficientsSalary) {

        super(name, dateOfBirth, academicRank, degree, startDateForJob);
        this.basicPay = basicPay;
        this.coefficientsSalary = coefficientsSalary;
    }

    public FacultyLecturer(String name, String dateOfBirth, String academicRank, String degree,
            String startDateForJob, double basicPay, double coefficientsSalary) {

        super(name, dateOfBirth, academicRank, degree, startDateForJob);
        this.basicPay = basicPay;
        this.coefficientsSalary = coefficientsSalary;
    }
    
    public FacultyLecturer() {
        super();
    }

    @Override
    public void showLecturer() {
        super.showLecturer();
        System.out.println("Your basic pay: " + this.basicPay);
        System.out.println("Your coefficients salary: " + this.coefficientsSalary);
        System.out.println();
    }

    @Override
    public double payroll(double workTime) {
        return HOURLY_EARNINGS * workTime + basicPay * coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHOURLY_EARNINGS() {
        return HOURLY_EARNINGS;
    }
}
