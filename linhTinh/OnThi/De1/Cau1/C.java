package linhTinh.OnThi.De1.Cau1;

public class C extends A implements B {
    @Override
    void n() { // Trùng tên nên phải đổi tên của phương thức m() trong class A thành n()
        System.out.println("Ghi de m() cua A");
    }

   @Override // Hiện thực bất kỳ phương thức nào của 1 lớp giao diện thì phạm vi truy cập cũng phải là public
   public void m() {
       System.out.println("Hien thuc m() cua B");
   }
}
