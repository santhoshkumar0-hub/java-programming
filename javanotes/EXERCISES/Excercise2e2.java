package EXERCISES;

import java.util.Scanner;

public class Excercise2e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("member name: ");
        String membername = sc.nextLine();

        System.out.print("weight: ");
        double weight = sc.nextDouble();

        System.out.print("height: ");
        double height = sc.nextDouble();

        double BMI = weight / (height*height);//BMI = Weight / (Height × Height) 

        System.out.println("\n**FITNESS REPORT**");
        System.out.println("Member name: " + membername );
        System.out.println("Weight: " + weight);
    System.out.println("Height: "+ height);
    System.out.println("BMI: " + BMI);
    }
}

//     ** FITNESS REPORT**
// Member Name : Rahul
// Weight : 72.0 kg
// Height : 1.75 m
// BMI : 23.51

