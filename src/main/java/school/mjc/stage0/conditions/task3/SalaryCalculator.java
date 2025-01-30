package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result=0;
        if (salary > 0) {
            if (salary <= 10000)
                result = salary - salary * 0.15;
            if (salary > 10000 && salary <= 20000)
                result = salary - salary * 0.18;
            if (salary > 20000)
                result = salary - salary * 0.20;
            System.out.println(result);
        } else {
            System.out.println("wrong input!");
        }

    }
}
