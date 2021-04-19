
public class Main {
	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		System.out.println("----Dog Info----");
		System.out.printf("%-30s: %s%n", "Name", myDog.name);
		System.out.printf("%-30s: %d%n", "Age", myDog.age);
		System.out.printf("%-30s: %s%n", "Breed", myDog.breed);
		
		System.out.println("-----Checkout-----");
		
		if(myDog.membership.equals("1")) {
			System.out.printf("%-30s: %s%n", "Membership", "Yes");
			myDog.price = myDog.price * 0.80;
		}else if(myDog.membership.equals("2"))
			System.out.printf("%-30s: %s%n", "Membership", "No");
		else
			System.out.printf("%-30s: %s%n", "Membership", "Invalid input");
		
		System.out.printf("%-30s: %.2f%n", "Price of grooming service", myDog.price);

		
		
		
		System.out.println("\n\n");
		
		
		
		
		Dog samanthaDog = new Dog("Baby", 5, "Goldern Retriever", "2", 97.00);
		System.out.println("----Dog Info----");
		System.out.printf("%-30s: %s%n", "Name", samanthaDog.name);
		System.out.printf("%-30s: %d%n", "Age", samanthaDog.age);
		System.out.printf("%-30s: %s%n", "Breed", samanthaDog.breed);

		System.out.println("-----Checkout-----");
		if(samanthaDog.membership.equals("1")) {
			System.out.printf("%-30s: %s%n", "Membership", "Yes");
			samanthaDog.price = samanthaDog.price * 0.80;
		}else if(samanthaDog.membership.equals("2"))
			System.out.printf("%-30s: %s%n", "Membership", "No");
		else
			System.out.printf("%-30s: %s%n", "Membership", "Invalid input");
		
		System.out.printf("%-30s: %.2f%n", "Price of grooming service", samanthaDog.price);
		
		
	}
}
