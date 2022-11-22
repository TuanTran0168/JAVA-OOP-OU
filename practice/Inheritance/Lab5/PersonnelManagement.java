package practice.Inheritance.Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//QuanLyNhanVien
public class PersonnelManagement {
    public static final Scanner SCANNER = new Scanner(System.in);
    private List<Personnel> personnelList = new ArrayList<Personnel>();

    public void addPersonnel(Personnel personnel) {
        this.personnelList.add(personnel);
    }

    public void deletePersonnel(Personnel personnel) {
        this.personnelList.remove(personnel);
    }

    public void deletePersonnel() {
        if (this.personnelList.size() > 0) {
            int lastElement = this.personnelList.size() - 1;
            this.personnelList.remove(lastElement);
        }
    }

    // public void deletePersonnel(int index, Personnel personnel) {

    // }

    public void enterAndAddPersonnel() {
        System.out.print("Enter Personnel name: ");
        String name = SCANNER.nextLine();
        System.out.print("Enter Personnel id number: ");
        String idNumber = SCANNER.nextLine();
        System.out.print("Enter Personnel country: ");
        String country = SCANNER.nextLine();
        System.out.print("Enter Personnel gender: ");
        String g = SCANNER.nextLine().toUpperCase();
        boolean gender;
        if (g.equals("MALE") == true || g.equals("NAM") == true)
            gender = true;
        else
            gender = false;
        System.out.print("Enter Personnel phone number: ");
        String phoneNumber = SCANNER.nextLine();

        Personnel personnel = new Personnel(idNumber, name, country, gender, phoneNumber);
        this.addPersonnel(personnel);
        System.out.println();
    }

    public void showPersonnelList() {
        this.personnelList.forEach(personnel -> {
            System.out.println();
            personnel.showPersonnel();
            // System.out.println(" ");
        });
    }

    public List<Personnel> sreachPersonnel(String keyWord) {
        // Khởi tạo đối tượng xong mới tìm được :v không là lỗi
        if (this.personnelList.size() > 0) {
            return this.personnelList.stream().filter(personnel -> (personnel.getName().contains(keyWord) == true)
                    || (personnel.getCountry().contains(keyWord) == true)
                    || (personnel.getIdNumber().contains(keyWord) == true)).toList();
        }
        return null;
    }

    public List<Personnel> getPersonnelList() {
        return personnelList;
    }

    public void setPersonnelList(List<Personnel> personnelList) {
        this.personnelList = personnelList;
    }

}
