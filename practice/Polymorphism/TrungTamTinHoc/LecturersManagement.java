package practice.Polymorphism.TrungTamTinHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LecturersManagement {
    public final SimpleDateFormat MY_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private List<Lecturers> lecturersList = new ArrayList<Lecturers>();

    public void addLecturer(Lecturers lecturer) {
        this.lecturersList.add(lecturer);
    }

    public void deleteLecturer(Lecturers lecturer) {
        this.lecturersList.remove(lecturer);
    }

    public List<Lecturers> searchLecturersByAcademicRank(String academicRank) {
        return this.lecturersList.stream().filter(lecturer -> lecturer.getAcademicRank().equals(academicRank)).toList();
    }

    public List<Lecturers> searchLecturersByDegree(String degree) {
        return this.lecturersList.stream().filter(lecturer -> lecturer.getDegree().equals(degree)).toList();
    }

    public List<Lecturers> searchLecturersByName(String name) {
        return this.lecturersList.stream().filter(lecturer -> lecturer.getName().equals(name)).toList();
    }

    public void showLecturersList() {
        this.lecturersList.forEach(lecturer -> lecturer.showLecturer());
    }

    public void readInforLecturersFromFile(String url) {
        File readFile = new File(url);
        try (Scanner scannerFile = new Scanner(readFile)) {
            while (scannerFile.hasNext()) {
                String name = scannerFile.nextLine();
                String dOB = scannerFile.nextLine();
                Date dateOfBirth = MY_DATE_FORMAT.parse(dOB);
                String academicRank = scannerFile.nextLine();
                String degree = scannerFile.nextLine();
                String sDFJ = scannerFile.nextLine();
                Date startDateForJob = MY_DATE_FORMAT.parse(sDFJ);

                Lecturers lec = new VisitingLecturer(name, dateOfBirth, academicRank, degree, startDateForJob, "HCM");
                this.lecturersList.add(lec);
            }
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void writeInforLecturersInFile(String url) {
        File writeFile = new File(url);
        try (PrintWriter writerFile = new PrintWriter(writeFile)) {
            for (Lecturers lecturer : lecturersList) {
                writerFile.println("Your name: " + lecturer.getName());
                writerFile.println("Your date of birth: " + MY_DATE_FORMAT.format(lecturer.getDateOfBirth()));
                writerFile.println("Your academic rank: " + lecturer.getAcademicRank());
                writerFile.println("Your degree: " + lecturer.getDegree());
                writerFile.println("Your start date for job: " + MY_DATE_FORMAT.format(lecturer.getStartDateForJob()));
                writerFile.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // ============== BUG ================
    public int compareSalary(Lecturers lecturer1, Lecturers lecturer2) {
        // salary1 = lecturer1.payroll( lecturer1.getStartDateForJob().getHours())
        return 0;
    }

    public List<Lecturers> getLecturersList() {
        return lecturersList;
    }

    public void setLecturersList(List<Lecturers> lecturersList) {
        this.lecturersList = lecturersList;
    }
}
