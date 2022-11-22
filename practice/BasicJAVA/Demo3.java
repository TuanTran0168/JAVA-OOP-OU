package practice.BasicJAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao email: ");
        String email = scanner.next();
        scanner.nextLine(); // Tạm cho nó nhận dấu enter thừa
        String emailName = email.substring(0, email.indexOf("@"));
        System.out.println(emailName);

        System.out.print("Nhap vao 1 chuoi co chu hoa: ");
        String s = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        System.out.println("So luong chu hoa la: " + (count));

        File readFile = new File("D:\\VisualStudioCode\\JAVA\\practice\\input.txt"); // Mở file tên readFile để đọc
        File writeFile = new File("D:\\VisualStudioCode\\JAVA\\practice\\output.txt"); // Mở file tên writeFile để ghi

        try (Scanner scannerFile = new Scanner(readFile); PrintWriter writerFile = new PrintWriter(writeFile)) {
            String data = scannerFile.nextLine();
            data = data.replaceAll("\\{file\\}", "tap tin");
            writerFile.println(data);
        }
        // scannerFile.close(); Có try rồi nên không cần đóng nữa

        System.out.print("Nhap vao 1 chuoi: ");
        String s1 = scanner.nextLine();
        String[] temp = s1.trim().split("[,;\\s]++");
        System.out.println("So tu trong cau la: " + (temp.length));

        String maxWord = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i].length() > maxWord.length())
                maxWord = temp[i];
        }
        System.out.println("Tu dai nhat la: " + (maxWord) + " co: " + (maxWord.length()) + " ki tu");

        String temp1 = "";
        for (int i = 0; i < temp.length; i++) {
            String firstWordUpperCase = temp[i];
            firstWordUpperCase = firstWordUpperCase.substring(0, 1).toUpperCase() // Viết hoa chữ đầu
                    + firstWordUpperCase.substring(1).toLowerCase(); // Các chữ sau ghi thường
            temp1 += firstWordUpperCase + " ";
        }
        System.out.println(temp1);

        scanner.close();
    }
}
 