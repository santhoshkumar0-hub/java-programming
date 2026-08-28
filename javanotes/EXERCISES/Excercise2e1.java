package EXERCISES;

import java.util.Scanner;

public class Excercise2e1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("productname: ");
        String productname = sc.nextLine();

        System.out.print("Quantity: ");
        int Quantity = sc.nextInt();

        System.out.print("unit price: ");
        int unitprice = sc.nextInt();

        int Total = Quantity * unitprice; 

        System.out.println("\n**SMART BILL**");
        System.out.println("productname: " + productname );
        System.out.println("Quantity: " + Quantity);
    System.out.println("unitprice:$"+ unitprice);
    System.out.println("total:$" + Total);

//     **SMART BILL**
// Product Name : Rice Bag
// Quantity : 4
// Unit Price : ₹850.00
// Total Amount : ₹3400.00
}
}