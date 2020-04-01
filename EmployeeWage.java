// WAP to Calculate Daily Wage of Employee

public class EmployeeWage {
    // Constant
    final int is_Part_Time = 1;
    final int is_Full_Time = 2;

    // Method to compute employee wage
    public void wageComputation(Companyempwage companyEmployee){
        // Variable
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkDay = 0;
        int totalEmpWage = 0;

        while (totalWorkDay < companyEmployee.getNumOfWorkingDays() && totalEmpHrs <= companyEmployee.getMaxHrsInMonth()) {

            int employee = (int) ((Math.random() * 10) % 3);

            switch (employee) {
                case is_Part_Time:
                    empHrs = 4;
                    break;
                case is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkDay++;
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        companyEmployee.setTotalEmpWage( totalEmpHrs * companyEmployee.empRatePerHr );
        System.out.println("Employee Monthly Wage of " + companyEmployee.getCompanyName() + " is " + companyEmployee.getTotalEmpWage());
    }
    public static void main(String arg[]) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        EmployeeWage emp = new EmployeeWage();

        //Array of object of Companyempwage class
        Companyempwage[] company = new Companyempwage[10];
        // assign value to object of Companyempwage
        company[0] = new Companyempwage("ThoughWorks", 40, 20, 100);
        emp.wageComputation(company[0]);
        company[1] = new Companyempwage("Wipro", 30, 22, 120);
        emp.wageComputation(company[1]);
        company[2] = new Companyempwage("Infosys", 45, 18, 90);
        emp.wageComputation(company[2]);
    }
}

class Companyempwage{

    public String companyName=" ";
    public int empRatePerHr=0;
    public int noOfWorkDay=0;
    public int maxHrsInMonth=0;

    public int totalEmpWage=0;

    public Companyempwage(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth){
        this.companyName=companyName;
        this.empRatePerHr=empRatePerHr;
        this.noOfWorkDay=noOfWorkDay;
        this.maxHrsInMonth=maxHrsInMonth;
    }

    //GETTERS method to get variables
    public String getCompanyName(){
        return companyName;
    }
    public int getEmpRatePerHour(){
        return empRatePerHr;
    }

    public int getNumOfWorkingDays(){
        return noOfWorkDay;
    }

    public int getMaxHrsInMonth(){
        return maxHrsInMonth;
    }

    public void setTotalEmpWage( int totalEmpWage ){
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage(){
        return totalEmpWage;
    }

}