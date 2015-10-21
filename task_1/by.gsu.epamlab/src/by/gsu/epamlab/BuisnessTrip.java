package by.gsu.epamlab;

public class BuisnessTrip {
	
	public final static int ALLOWANCE_RATE_IN_DAY=50000;
	
	private String employee;
	private int transportExpense;
	private int daysOfTrip;
	
	public BuisnessTrip(String employee, int transportExpense, int dayOfTrip) {
		super();
		this.employee = employee;
		this.transportExpense = transportExpense;
		this.daysOfTrip = dayOfTrip;
	}

	public BuisnessTrip() {
		super();
		this.employee = "Someone";
		this.transportExpense = 0;
		this.daysOfTrip = 0;
		
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public int getTransportExpense() {
		return transportExpense;
	}

	public void setTransportExpense(int transportExpense) {
		this.transportExpense = transportExpense;
	}

	public int getDaysOfTrip() {
		return daysOfTrip;
	}

	public void setDayOfTrip(int dayOfTrip) {
		this.daysOfTrip = dayOfTrip;
	}
	
	public int getTotal(){
		
		int totalCost=ALLOWANCE_RATE_IN_DAY*daysOfTrip+transportExpense;
		
		return totalCost;
	}

	@Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		
		result.append(employee)
		.append(";")
		.append(daysOfTrip)
		.append(";")
		.append(transportExpense)
		.append(";")
		.append(getTotal());
		
		
		return result.toString();// TODO
	}
	
	public void show(){
		
		String dataForConsole=String.format(" Employee=%1s%n Allowance in day=%2$6d%n Day of trip=%3$3d%n"
				+ " Transport=%4$6d%n Total cost=%5$6d%n%n",
				this.employee,ALLOWANCE_RATE_IN_DAY,this.daysOfTrip,this.transportExpense,getTotal());
		
		System.out.print(dataForConsole);
		
	}
	
	
	
	
	
	
	

}
