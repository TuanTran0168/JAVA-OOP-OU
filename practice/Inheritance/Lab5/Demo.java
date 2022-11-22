package practice.Inheritance.Lab5;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        final int NUMBER_OF_PERSONNEL_DEPARTMENT = 5; // Số lượng bộ phận nhân viên hiện có (thường, A, B, C, D)
        final int NUMBER_OF_CHOISE = 6;
        PersonnelManagement managementList = new PersonnelManagement();

        int choise;
        do {
            // Clear Screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("\t========== MENU ==========\n");
            System.out.println(
                    "1. Add a personnel.\n2. Delete a personnel\n3. Search personnel by name, country, ID number.\n4. Show personnel list.\n5. Payroll for personnel.\n6. Finish.");
            System.out.print("\nEnter your number: ");
            choise = Integer.parseInt(SCANNER.nextLine());
            System.out.println();

            switch (choise) {
                case 1:
                    int choisePersonnel;
                    System.out.println("\t1. ADD A PERSONNEL.\n");
                    System.out.println(
                            "1. Personnel.\n2. Personnel A.\n3. Personnel B.\n4. Personnel C.\n5. Personnel D.");
                    do {
                        System.out.print("\nEnter your number: ");
                        choisePersonnel = Integer.parseInt(SCANNER.nextLine());
                        if (choisePersonnel == 1) {
                            System.out.println("\n\tPersonnel");
                            Personnel personnel = new Personnel();
                            personnel.enterOnePersonnel();
                            managementList.addPersonnel(personnel);

                        } else if (choisePersonnel == 2) {
                            System.out.println("\n\tPersonnel A");
                            Personnel personnel = new PersonnelA();
                            personnel.enterOnePersonnel();
                            managementList.addPersonnel(personnel);

                        } else if (choisePersonnel == 3) {
                            System.out.println("\n\tPersonnel B");
                            Personnel personnel = new PersonnelB();
                            personnel.enterOnePersonnel();
                            managementList.addPersonnel(personnel);

                        } else if (choisePersonnel == 4) {
                            System.out.println("\n\tPersonnel C");
                            Personnel personnel = new PersonnelC();
                            personnel.enterOnePersonnel();
                            managementList.addPersonnel(personnel);

                        } else if (choisePersonnel == 5) {
                            System.out.println("\n\tPersonnel D");
                            Personnel personnel = new PersonnelD();
                            personnel.enterOnePersonnel();
                            managementList.addPersonnel(personnel);
                        }

                        System.out.println("SUCCESSFUL!");
                    } while (choisePersonnel < 1 || choisePersonnel > NUMBER_OF_PERSONNEL_DEPARTMENT);
                    break;

                case 2:
                    System.out.println("\t2. DELETE A PERSONNEL.\n");
                    managementList.deletePersonnel();
                    System.out.println("SUCCESSFUL!");
                    break;

                case 3:
                    System.out.println("\t3. SEARCH PERSONNEL BY NAME,COUNTRY, ID NUMBER.\n");
                    System.out.print("Enter your key word: ");
                    String keyWord = SCANNER.nextLine();
                    managementList.sreachPersonnel(keyWord).forEach(personnel -> personnel.showPersonnel());
                    break;

                case 4:
                    System.out.println("\t4. SHOW PERSONNEL LIST.\n");
                    managementList.showPersonnelList();
                    break;

                case 5:
                    System.out.println("\t5. PAYROLL FOR PERSONNEL.\n");
                    int workDay;
                    System.out.print("Enter work day for all personnel in List: ");
                    workDay = Integer.parseInt(SCANNER.nextLine());
                    System.out.println("Work day for all personnel: " + workDay + "\n");

                    managementList.getPersonnelList().forEach(personnel -> {
                        personnel.showPersonnel();
                        System.out.printf("Personnel Salary: %.1f\n\n", personnel.payroll(workDay));
                    });
                    break;

                default:
                    System.out.println("\n\t========== FINISH ==========\n");
            }

            System.out.println("\nPress Any Key To Continue...");
            SCANNER.nextLine();

        } while (choise < NUMBER_OF_CHOISE);

        SCANNER.close();

        // Personnel p1 = new Personnel("037", "Nguyen Van A", "HCM", true, "0123");
        // Personnel p2 = new Personnel();
        // Personnel p3 = new Personnel();
        // Personnel p4 = new PersonnelA();
        // Personnel p5 = new PersonnelB("036", "Tran Thi B", "HN", false, "0199");
        // Personnel p6 = new PersonnelC("035", "Tran Van Loc", "QN", true, "0168");

        // p2.enterOnePersonnel();

        // PersonnelManagement managementList = new PersonnelManagement();
        // managementList.addPersonnel(p1);
        // managementList.addPersonnel(p2);
        // managementList.addPersonnel(p3);
        // managementList.addPersonnel(p4);
        // managementList.addPersonnel(p5);
        // managementList.addPersonnel(p6);
        // managementList.enterAndAddPersonnel();
        // System.out.println("=================== DANH SACH =======================");
        // managementList.showPersonnelList();

        // System.out.println("=================== DANH SACH DA XOA
        // =======================");
        // managementList.deletePersonnel(p3);
        // managementList.showPersonnelList();

        // System.out.println("=================== DANH SACH TIM KIEM
        // =======================");
        // managementList.sreachPersonnel("a").forEach(p -> p.showPersonnel());

        // System.out.println("=================== BANG LUONG =======================");
        // managementList.getPersonnelList().forEach(personnel ->
        // System.out.println(personnel.payroll(10)));
    }
}
