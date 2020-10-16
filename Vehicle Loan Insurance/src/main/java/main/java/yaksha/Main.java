package main.java.yaksha;

import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the vehicle number :");
	String vehicleNumber=sc.next();
	System.out.println("Enter the model name :");
	String modelName=sc.next();
	System.out.println("Enter the vehicle type[4wheeler/3wheeler/2wheeler] :");
	String vehicleType=sc.next();
	System.out.println("Enter the price of vehicle :");
	double price=sc.nextDouble();
	Vehicle v=new Vehicle(  vehicleNumber, modelName, vehicleType, price) ;
	double loanAmount=v.issueLoan();
	double insuranceAmount=v.takeInsurance();
	
	System.out.println(" Loan issuing for Vehicle number "+v.getVehicleNumber()+" is "+loanAmount+" of type "+v.getVehicleType());
    
	System.out.println(" Insurance Amount eligible for Vehicle number "+v.getVehicleNumber()+" is "+insuranceAmount );

}
}
