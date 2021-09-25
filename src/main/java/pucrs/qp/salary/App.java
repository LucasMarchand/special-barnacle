package pucrs.qp.salary;

public class App {

    public static double calculate_salary(double baseSalary, double totalSoldByVendor) {
        
        if(totalSoldByVendor < 0){
            totalSoldByVendor =  totalSoldByVendor * -1;
        }

        return baseSalary + (totalSoldByVendor * 0.15);
	}

    public static void main(String[] args) {
        System.out.println("Salário com Bônus!");
		System.out.println(calculate_salary(500.00, 1230.00));
    }
}
