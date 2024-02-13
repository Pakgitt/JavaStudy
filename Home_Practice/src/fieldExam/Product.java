package fieldExam;

public class Product {
	private String pName = "박세혁";
	private int price = 1000;
	private String brand = "몽클레어";

	public Product() {

	}

	
	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void information() {
		System.out.println();
	}

}
