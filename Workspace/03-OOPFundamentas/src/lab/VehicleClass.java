package lab;

public class VehicleClass {
	private int regNo;
	private String brand;
	private int price;
	private double mileage;
	

	public VehicleClass(int regNo, String brand, double mileage) {
		super();
		this.regNo = regNo;
		this.brand = brand;
		//this.price = price;
		this.mileage = mileage;
	}
	int getPrice(int price) {
		this.price=price;
		return price;
	}
//	public void vehicleDetails() {
//		
//		System.out.println("regNo=" + regNo + ", brand=" + brand + ", price=" + price + ", mileage=" + mileage);
//	}
//	


	@Override
	public String toString() {
		return "VehicleClass [regNo=" + regNo + ", brand=" + brand + ", price=" + price + ", mileage=" + mileage + "]";
	}
	public static void main(String[] args) {

		VehicleClass v1 = new VehicleClass(7788776, "Tata", 30);
		v1.getPrice(750000);
		VehicleClass v2 = new VehicleClass(7788799, "Maruti", 28);
		v2.getPrice(650000);
		if(v1.price < v2.price || v1.mileage < v2.mileage) {
			System.out.println("Best car is "+v1);
		}
		else if(v1.price < v2.price && v1.mileage < v2.mileage) {
			System.out.println("Best car is "+v1);
		}
		else {
			System.out.println("Best car is "+v2);
		}
		

	}

}
