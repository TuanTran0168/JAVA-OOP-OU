package linhTinh.OnThi.DeCS2022.Cau3;

public class Test {
    public static void main(String[] args) {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Em("A"));
        m.addEmployee(new Leader("LA", "Director"));
        m.addEmployee(new Em("B"));

        m.sort();
        m.output();
    }
}
