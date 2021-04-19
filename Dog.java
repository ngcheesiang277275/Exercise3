import java.util.Scanner;
public class Dog {
	
	String name;
	int age;
	String breed;
	String membership;
	double price;
	

	Scanner s = new Scanner(System.in);
	
	//no-arg constructor
	Dog(){
		System.out.printf("%-30s: ", "Enter dog name");
		this.name = s.nextLine();
		
		System.out.printf("%-30s: ", "Enter dog age");
		this.age = s.nextInt();
		
		System.out.printf("%-30s: ", "Enter dog breed");
		s.nextLine();
		this.breed = s.nextLine();
	
		System.out.printf("%-30s: RM", "Price of grooming service");
		this.price = s.nextDouble();
		System.out.println("\n***20% Membership discount available");
		System.out.printf("%-30s: ", "Membership(1-Yes, 2-No)");
		this.membership = s.next();
		System.out.println();
				
	}
	
	//parameterized constructor
	Dog(String dogName, int dogAge, String dogBreed, String dogMembership, double totalPrice){
		this.name = dogName;
		this.age = dogAge;
		this.breed = dogBreed;
		this.membership = dogMembership;
		this.price = totalPrice;

	}
		
	
}
