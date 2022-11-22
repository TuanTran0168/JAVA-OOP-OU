package linhTinh.ViVaViVu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People {
    public static final SimpleDateFormat MY_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private int age;
    private Date birhtDate;

    public People()
    {
        this.name = "Gay";
        this.age = 18;
        Date b = new Date("1/1/1990");
        this.birhtDate = b;
    }

    public People(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birhtDate = birthDate;
    }

    public People(String name, int age, String birthDate) {
        this.name = name;
        this.age = age;
        try {
            this.birhtDate = MY_DATE_FORMAT.parse(birthDate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void showPeople()
    {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Ngay sinh: " + MY_DATE_FORMAT.format(this.birhtDate));
        System.out.println();
    }

    public Date getBirhtDate() {
        return birhtDate;
    }

    public void setBirhtDate(Date birhtDate) {
        this.birhtDate = birhtDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
