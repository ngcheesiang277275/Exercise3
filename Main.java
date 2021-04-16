
public class Main {
	public static void main(String[] args) {
		Bag bag1 = new Bag();

		
		System.out.printf("---%s---%n", bag1.brand);
		System.out.printf("%-10s: %s%n", "Brand", bag1.brand);
		System.out.printf("%-10s: %s%n", "Colour", bag1.colour);
		System.out.printf("%-10s: RM%d%n", "Price", bag1.priceRinggit);
		System.out.printf("%-10s: %.2fL%n", "Volume", bag1.volumeLiters);
		System.out.println("---SPECIAL DISCOUNT---");
		System.out.printf("%-10s: %d%%%n", "Discount", bag1.discount);
		System.out.printf("%-10s: RM%d%n", ">>New price", bag1.discountPrice);
				
		System.out.println("\n\n");
		
		Bag bag2 = new Bag("Polo", "Red", 70, 25.5, 10);
		System.out.printf("---%s---%n", bag2.brand);
		System.out.printf("%-10s: %s%n", "Brand", bag2.brand);
		System.out.printf("%-10s: %s%n", "Colour", bag2.colour);
		System.out.printf("%-10s: RM%d%n", "Price", bag2.priceRinggit);
		System.out.printf("%-10s: %.2fL%n", "Volume", bag2.volumeLiters);
		System.out.println("---SPECIAL DISCOUNT---");
		System.out.printf("%-10s: %d%%%n", "Discount", bag2.discount);
		System.out.printf("%-10s: RM%d%n", ">>New price", bag2.discountPrice);
				
		
		
	}
}
