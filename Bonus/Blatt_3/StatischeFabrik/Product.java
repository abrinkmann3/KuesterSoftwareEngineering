package StatischeFabrik;

public class Product {
	private String name;
	private int iD;
	private double price;
	
	public Product(String name, int iD, double price) {
		this.name = name;
		this.iD = iD;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
