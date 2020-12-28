package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int length) {
		System.out.println(length + "km ‘–‚è‚Ü‚·");
		this.fuelAmount = fuelAmount - ( length / fuelCost );
	}

    public double getFuelAmount() {
    	return fuelAmount;
    }
}
