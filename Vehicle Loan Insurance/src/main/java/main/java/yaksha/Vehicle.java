package main.java.yaksha;

public class Vehicle implements Insurance,Loan{
	private String vehicleNumber;

	private String modelName;

	private String vehicleType;

	private double price;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle( String vehicleNumber,String modelName,String vehicleType,double price) {
		this.vehicleNumber=vehicleNumber;
		this.modelName=modelName;
		this.vehicleType=vehicleType;
		this.price=price;
 	}

	@Override
	public double issueLoan() {
		double loanAmount;
		if(getVehicleType().equals("4 wheeler")) {
			loanAmount=price*0.8;
 		}else if(getVehicleType().equals("3 wheeler")) {
			loanAmount=price*0.75;
 		}else
		  {
			loanAmount=price*0.5;
 		  }		
		
		return loanAmount;
	}

	public double takeInsurance() {
		double insuranceAmount=0;
		if(price<=150000) {
			insuranceAmount=3500; 
			
		}else if(price>150000 && price<=300000) {
			insuranceAmount=4000;
		}else if(price>300000) {
			insuranceAmount=5000;
		}
 		return insuranceAmount;
	}

	 
}
