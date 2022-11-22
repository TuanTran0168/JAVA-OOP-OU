package practice.Polymorphism.TrungTamTinHoc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Lecturers {
    public final Scanner SCANNER = new Scanner(System.in);
    public final SimpleDateFormat MY_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private Date dateOfBirth;
    private String academicRank;
    private String degree;
    private Date startDateForJob;

    public Lecturers(String name, Date dateOfBirth, String academicRank, String degree, Date startDateForJob) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.academicRank = academicRank;
        this.degree = degree;
        this.startDateForJob = startDateForJob;
    }

    public Lecturers(String name, String dateOfBirth, String academicRank, String degree, String startDateForJob) {
        this.name = name;
        this.academicRank = academicRank;
        this.degree = degree;

        try {
            this.dateOfBirth = MY_DATE_FORMAT.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            this.startDateForJob = MY_DATE_FORMAT.parse(startDateForJob);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    public Lecturers() {
        System.out.print("Enter your name: ");
        this.name = SCANNER.nextLine();

        System.out.println("Enter your date of birth");
        System.out.print("\tEnter day: ");
        String dd = SCANNER.next();
        System.out.print("\tEnter month: ");
        String MM = SCANNER.next();
        System.out.print("\tEnter year: ");
        String yyyy = SCANNER.next();
        String dOB = dd + "/" + MM + "/" + yyyy;

        try {
            this.dateOfBirth = MY_DATE_FORMAT.parse(dOB);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        SCANNER.nextLine();
        System.out.print("Enter your academic rank: ");
        this.academicRank = SCANNER.nextLine();
        System.out.print("Enter your degree: ");
        this.degree = SCANNER.nextLine();

        System.out.println("Enter your start date for job: ");
        System.out.print("\tEnter day: ");
        String dd1 = SCANNER.next();
        System.out.print("\tEnter month: ");
        String MM1 = SCANNER.next();
        System.out.print("\tEnter year: ");
        String yyyy1 = SCANNER.next();
        String sDFJ = dd1 + "/" + MM1 + "/" + yyyy1;

        try {
            this.startDateForJob = MY_DATE_FORMAT.parse(sDFJ);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    public void showLecturer() {
        System.out.println("Your name: " + this.name);
        System.out.println("Your date of birth: " + MY_DATE_FORMAT.format(this.dateOfBirth));
        System.out.println("Your academic rank: " + this.academicRank);
        System.out.println("Your degree: " + this.degree);
        System.out.println("Your start date for job: " + MY_DATE_FORMAT.format(this.startDateForJob));
    }

    public abstract double payroll(double workTime);

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public Date getStartDateForJob() {
        return startDateForJob;
    }

    public void setStartDateForJob(Date startDateForJob) {
        this.startDateForJob = startDateForJob;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
}
