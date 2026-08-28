package EXERCISES;

import java.util.Scanner;

public class Excercise2e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Consumer name: ");
        String productname = sc.nextLine();

        System.out.print("unit used: ");
        double unit = sc.nextDouble();

        System.out.print("cost per unit: ");
        double cost = sc.nextDouble();

        double Totalbill = unit * cost; 

        System.out.println("\n**ELECTRICITY BILL**");
        System.out.println("Consumer name: " + productname );
        System.out.println("unit used: " + unit);
    System.out.println("cost per unit:"+ cost);
    System.out.println("totalbill:" + Totalbill);

//     ** ELECTRICITY BILL**
// Consumer Name : Suresh
// Units Used : 195
// Cost per Unit : ₹8.25
// Total Bill : ₹1608.75

    }

}
