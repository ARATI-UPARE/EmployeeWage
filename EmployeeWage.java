// WAP to Calculate Daily Wage of Employee

public class EmployeeWage {
    public static void main(String arg[]){
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        // Constants
        int empRatePerHr=20;
        int empHrs=0;
        // Variable
        int empWage=0;

        double employee=Math.random();
        // employee presnt if value is greater than 0.5
        if(employee>0.5)
        {
            System.out.println("Employee is Present");
            empHrs=8;
            empWage=(empHrs*empRatePerHr);
            System.out.println("Employee Wage is "+empWage);
        }
        else
        {
            System.out.println("Employee is Absent");
            empHrs=0;
            empWage=(empHrs*empRatePerHr);
            System.out.println("Employee Wage is "+empWage);
        }
    }
}
