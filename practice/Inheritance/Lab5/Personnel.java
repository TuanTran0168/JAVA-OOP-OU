package practice.Inheritance.Lab5;

import java.util.Scanner;

//NhanVien
public class Personnel {
    public static final Scanner SCANNER = new Scanner(System.in);
    public final double BASIC_PAY = 100000; // Lương cơ bản
    private static int count = 0;
    private int personnelCode = ++count;
    private String idNumber;
    private String name;
    private String country;
    private boolean gender;
    private String phoneNumber;

    public Personnel(String idNumber, String name, String country, boolean gender, String phoneNumber) {
        this.idNumber = idNumber;
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Personnel() {
    }

    public void enterOnePersonnel() {
        System.out.print("Enter Personnel name: ");
        this.name = SCANNER.nextLine();
        System.out.print("Enter Personnel id number: ");
        this.idNumber = SCANNER.nextLine(); // Chưa xử lý chuỗi số chứng minh chỉ có số, Để làm sau
        System.out.print("Enter Personnel country: ");
        this.country = SCANNER.nextLine();
        System.out.print("Enter Personnel gender: ");
        String g = SCANNER.nextLine().toUpperCase();
        if (g.equals("MALE") == true || g.equals("NAM") == true)
            this.gender = true;
        else
            this.gender = false;
        System.out.print("Enter Personnel phone number: ");
        this.phoneNumber = SCANNER.nextLine(); // Chưa xử lý chuỗi số điện thoại chỉ có số, Để làm sau
    }

    public void showPersonnel() {
        System.out.println("Personnel code: " + this.personnelCode);
        System.out.println("Personnel name: " + this.name);
        System.out.println("Personnel id number: " + this.idNumber);
        System.out.println("Personnel country: " + this.country);
        System.out.print("Personnel gender: ");
        if (this.gender == true)
            System.out.println("Male");
        else
            System.out.println("Female");
        System.out.println("Personnel phone number: " + this.phoneNumber);
        // System.out.println();
    }

    public double payroll(int workDay) {
        return BASIC_PAY * workDay;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getPersonnelCode() {
        return personnelCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonnelCode(int personnelCode) {
        this.personnelCode = personnelCode;
    }

}
