import java.util.Scanner;
public class Bag {
	String brand;
	String colour;
	int priceRinggit;
	double volumeLiters;
	int discount;
	int discountPrice;
	
	Scanner s = new Scanner(System.in);
	
	Bag(){
		System.out.printf("%-20s:", "Enter the brand");
		this.brand = s.nextLine();
		
		System.out.printf("%-20s:", "Enter the colour");
		this.colour = s.nextLine();
		
		System.out.printf("%-20s:", "Enter the price");
		this.priceRinggit = s.nextInt();
		
		System.out.printf("%-20s:", "Enter the volume");
		this.volumeLiters = s.nextDouble();
		
		System.out.printf("%-20s:", "Enter discount percent(%)");
		this.discount = s.nextInt();
		this.discountPrice = (int)((this.priceRinggit * (100-discount) / 100));
		
		
	}
	
	Bag(String br, String color, int price, double volume, int discount){
		this.brand = br;
		this.colour = color;
		this.priceRinggit = price;
		this.volumeLiters = volume;
		this.discount = discount;
		this.discountPrice = (int)((price * (100-discount) / 100));

	}
	

	
}
