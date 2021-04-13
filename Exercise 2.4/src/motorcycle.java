public class motorcycle {

	String brand;
	String model;
	String color;
	double weight,price;
	
	 // Create Setter Method
	  public void setBrand(String brand) {
		  this.brand = brand;
	  }
	  
	  public void setModel(String model) {
		  this.model = model;
	  }
	  
	  public void setColor(String color) {
		  this.color = color;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }

	  public void setPrice(double price) {
		  this.price = price;
	  }

	  // Create Getter Method
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }

	  public double getWeight() {
		  return this.weight;
	  }

	  public double getPrice() {
		  return this.price;
	  }
	  
	  public void Promotion() {
		System.out.println("You will offered free service for 5 months !!");
	}
}