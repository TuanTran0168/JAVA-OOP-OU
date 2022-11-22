package practice.Polymorphism.TrungTamTinHoc;

public class Demo {
    public static void main(String[] args) {
        Lecturers l1 = new VisitingLecturer("name", "1/2/2201", "f", "f", "21/9/2003", "HCM");
        Lecturers l2 = new VisitingLecturer("A", "12/5/2001", "g", "g", "25/6/2009", "HCM");
        Lecturers l3 = new FacultyLecturer("B", "22/9/1999", "e", "e", "9/2/2001", 1.9, 500000);
        Lecturers l4 = new VisitingLecturer("C", "12/5/2001", "g", "g", "25/6/2009", "HCM");
        LecturersManagement listLecturers = new LecturersManagement();

        listLecturers.addLecturer(l1);
        listLecturers.addLecturer(l2);
        listLecturers.addLecturer(l3);
        listLecturers.addLecturer(l4);

        listLecturers.showLecturersList();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        listLecturers.searchLecturersByAcademicRank("g").forEach(l -> l.showLecturer());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(l1.payroll(72));
        System.out.println(l2.payroll(24));
        System.out.println(l3.payroll(72));
        System.out.println(l4.payroll(48));

        System.out.println("+++++++++++++++++++++++++++++++++FILE+++++++++++++++++++++++++++++++");
        listLecturers.readInforLecturersFromFile("E:\\VisualStudioCode\\JAVA\\practice\\Polymorphism\\TrungTamTinHoc\\LecturersInfor.txt");
        listLecturers.showLecturersList();
        listLecturers.writeInforLecturersInFile("E:\\VisualStudioCode\\JAVA\\practice\\Polymorphism\\TrungTamTinHoc\\OutputLecturersInfor.txt");
    }
}
