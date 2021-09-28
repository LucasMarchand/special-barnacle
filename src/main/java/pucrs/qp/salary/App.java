package pucrs.qp.salary;

import java.util.Scanner;

public class App {

    public static double calculate_salary(double baseSalary, double totalSoldByVendor) {
        
        if(totalSoldByVendor < 0){
            totalSoldByVendor =  totalSoldByVendor * -1;
        }

        if(baseSalary < 0){
            baseSalary =  baseSalary * -1;
        }

        return baseSalary + (totalSoldByVendor * 0.15);
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        double baseSalary = input.nextDouble();
        double totalSoldByVendor = input.nextDouble();
        double total = App.calculate_salary(baseSalary, totalSoldByVendor);
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
}
