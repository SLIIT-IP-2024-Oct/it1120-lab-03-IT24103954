import java.util.Scanner;

public class IT24103954Lab3Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly salary :");
		double salary = input.nextDouble();
		System.out.println("Enter the number of OT hours :");
		double otHours = input.nextDouble();
		System.out.println("Enter the OT hourly rate :");
		double rate = input.nextDouble();
		double totalSalary = salary + (otHours * rate);
		System.out.println("Enter the OT hourly rate :");
		System.out.println("The total salary including OT is :" +totalSalary);
	}
}
	

	
