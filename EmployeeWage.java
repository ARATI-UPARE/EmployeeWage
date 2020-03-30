// WAP to Dislpay Employee is present or absent

public class EmployeeWage {
    public static void main(String arg[]){
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        double employee=Math.random();
        System.out.println("Employee is Preswnt");
        System.out.println(employee);
        // employee presnt if value is greater than 0.5
        if(employee>0.5)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
