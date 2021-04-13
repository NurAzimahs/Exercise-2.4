
public class main {

public static void main(String[] args) {
		
		motorcycle y = new motorcycle();
		y.setBrand("Yamaha");
		y.setModel("Y15");
		y.setColor("Yellow");
		y.setPrice(15000);
		y.setWeight(135.9);
		
		System.out.println("Brand: " + y.getBrand());
		System.out.println("Model: " + y.getModel());
		System.out.println("Color: " + y.getColor());
		System.out.println("Prize: RM " + y.getPrice());
		System.out.println("Weight: " + y.getWeight() + "Kg");
		y.Promotion();
		System.out.println();
		
		motorcycle k = new motorcycle();
		k.setBrand("Kawasaki");
		k.setModel("z290");
		k.setColor("Red");
		k.setPrice(30000);
		k.setWeight(155.5);
		
		System.out.println("Brand: " + k.getBrand());
		System.out.println("Model: " + k.getModel());
		System.out.println("Color: " + k.getColor());
		System.out.println("Prize: RM " + k.getPrice());
		System.out.println("Weight: " + k.getWeight() + "Kg");
		k.Promotion();
		System.out.println();
	}
}
