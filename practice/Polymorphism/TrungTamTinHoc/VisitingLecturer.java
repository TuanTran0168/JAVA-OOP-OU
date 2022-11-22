package practice.Polymorphism.TrungTamTinHoc;

import java.util.Date;

public class VisitingLecturer extends Lecturers {
    private String currentWorkPlace;
    private final double HOURLY_EARNINGS = 90000; // Thu nhập theo giờ
    
    public VisitingLecturer(String name, Date dateOfBirth, String academicRank, String degree, Date startDateForJob, String currentWorkPlace) {
        super(name, dateOfBirth, academicRank, degree, startDateForJob);
        this.currentWorkPlace = currentWorkPlace;
    }

    public VisitingLecturer(String name, String dateOfBirth, String academicRank, String degree,
            String startDateForJob, String currentWorkPlace) {
        super(name, dateOfBirth, academicRank, degree, startDateForJob);
        this.currentWorkPlace = currentWorkPlace;
    }

    public VisitingLecturer(){
        super();
        System.out.print("Enter your crrent work place: ");
        this.currentWorkPlace = SCANNER.nextLine();
    }

    @Override
    public void showLecturer() {
        super.showLecturer();
        System.out.println("Your current work place: " + this.currentWorkPlace);
        System.out.println();
    }

    @Override
    public double payroll(double workTime) {
        return HOURLY_EARNINGS * workTime;
    }

    public String getCurrentWorkPlace() {
        return currentWorkPlace;
    }

    public void setCurrentWorkPlace(String currentWorkPlace) {
        this.currentWorkPlace = currentWorkPlace;
    }

    public double getHOURLY_EARNINGS() {
        return HOURLY_EARNINGS;
    }
}
