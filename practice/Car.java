package practice;

public class Car {
	
	private String carName;
	private int id;
	private float price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, int id, float price) {
		super();
		this.carName = carName;
		this.id = id;
		this.price = price;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", id=" + id + ", price=" + price + "]";
	}
	
	

}
