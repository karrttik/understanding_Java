package understanding_fundamental_byQuestions;

//Assume a suitable value for Ramesh's basic salary. His dearness allowance is 40% of
//basic salary, and house rent allowance is 20% of his basic salary. Write a java program
//to calculate his gross salary.

public class grossSalaryCalculator {
    public static void main(String[] agrs) {
        System.out.println("grossSalaryCalculator");

        //Assuming a suitable value for Ramesh basic salary is -
        double basicSalary = 50000;

        //His dearness allowance is 40% of basic salary is -
        double da = .4 * basicSalary;

        //his house rent allowance is 20% of his basic salarym is -
        double hra = .2 * basicSalary;

        //program to calculate his gross salary -
        double grossSalary = basicSalary + da + hra;

        // Print the result
        System.out.println("Ramesh's basic salary: ₹" + basicSalary);
        System.out.println("Dearness allowance (40% of basic salary): ₹" + da);
        System.out.println("House rent allowance (20% of basic salary): ₹" + hra);
        System.out.println("Ramesh's gross salary: ₹" + grossSalary);
    }
}
