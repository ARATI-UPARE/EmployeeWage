// WAP to Calculate Daily Wage of Employee

public class EmployeeWage {
    // Constants
    public static final int maxHrsInMonth=100;
    public static final int noOfWorkDay=20;
    public static final int empRatePerHr=20;
    public static final int is_Part_Time=1;
    public static final int is_Full_Time=2;
    // Variable
    public static int empHrs = 0;
    public static int totalEmpHrs = 0;
    public static int totalWorkDay=0;
    public static int totalEmpWage=0;

    public static void main(String arg[]) {

        System.out.println("WELCOME to EMPLOYEE WAGE Computation");

        wageComputation(); // function call
    }

    // Method to compute employee wage
    public static void wageComputation(){

        while( totalWorkDay < noOfWorkDay && totalEmpHrs <= maxHrsInMonth ) {

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
            System.out.println("Employee days:" + totalWorkDay + " Work Hours:" + totalEmpHrs);
        }
    totalEmpWage = ( totalEmpHrs * empRatePerHr );
    System.out.println("Employee Total Salary is :"+ totalEmpWage);
    }
}