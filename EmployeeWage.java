// WAP to Calculate Daily Wage of Employee

public class EmployeeWage {
   // Method to compute employee wage
    public int wageComputation(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth) {
        // Constant
        final int is_Part_Time = 1;
        final int is_Full_Time = 2;
        // Variable
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkDay = 0;
        int totalEmpWage = 0;

        //System.out.println(" #### Welcome To " + companyName+ "####");
        while (totalWorkDay < noOfWorkDay && totalEmpHrs <= maxHrsInMonth) {

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
            //System.out.println("     Employee days:" + totalWorkDay + " Work Hours:" + totalEmpHrs);
        }
        totalEmpWage = (totalEmpHrs * empRatePerHr);
        //System.out.println("Employee Monthly Salary is in " +companyName +" is :" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String arg[]) {

        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        EmployeeWage emp = new EmployeeWage();
        int []wages=new int[3];
        // We can give input of multiple companies using object of class as follows
        wages[0]=emp.wageComputation("ThoughWorks", 40, 20, 100);
        System.out.println("Employee Monthly Wage "+wages[0] + " In ThoughtWorks");
        wages[1]=emp.wageComputation("Wipro", 30, 22, 120);
        System.out.println("Employee Monthly Wage "+wages[1]+" In Wipro ");
        wages[2]=emp.wageComputation("Infosys", 45, 18, 90);
        System.out.println("Employee Monthly Wage "+wages[2]+" In Infosys ");
    }

}