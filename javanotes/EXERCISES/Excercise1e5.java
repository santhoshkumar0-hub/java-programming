package EXERCISES;

import java.util.*;

public class Excercise1e5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("productname: ");
        String productname = sc.nextLine();

        System.out.print("Quantity: ");
        int Quantity = sc.nextInt();

        System.out.print("unit price: ");
        int unitprice = sc.nextInt();

        int Total = Quantity * unitprice; 

        System.out.println("\n---CUSTOMER BILL---");
        System.out.println("productname: " + productname );
        System.out.println("Quantity: " + Quantity);
    System.out.println("unitprice: "+ unitprice);
    System.out.println("total: " + Total);
// --- CUSTOMER BILL ---
// Product Name : Rice Bag
// Quantity : 3
// Unit Price : 850.00
// Total Amount : 2550.00
    }
}
