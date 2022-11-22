package practice.Inheritance.Lab5;

public class PersonnelD extends Personnel {
    private double allowance;   //Phụ cấp 

    public PersonnelD(double allowance, String idNumber, String name, String country, boolean gender, String phoneNumber) {
        super(idNumber, name, country, gender, phoneNumber);
        // TODO Auto-generated constructor stub

        this.allowance = allowance;
    }

    public PersonnelD() {
    }

    @Override
    public void enterOnePersonnel() {
        // TODO Auto-generated method stub
        super.enterOnePersonnel();

        System.out.print("Enter personnel allowance: ");
        this.allowance = Double.parseDouble(SCANNER.nextLine());
    }

    @Override
    public void showPersonnel() {
        // TODO Auto-generated method stub
        super.showPersonnel();
        System.out.printf("Personnel allowance: %.1f\n", this.allowance);
    }

    @Override
    public double payroll(int workDay) {
        // TODO Auto-generated method stub
        return super.payroll(workDay) + this.allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
}
