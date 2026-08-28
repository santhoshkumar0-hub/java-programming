package EXERCISES;

import java.util.Scanner;

public class Ecercise1e3 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
    
       String AstronautName;
       int Age;
       String Country;
       int MissionNumber;

       System.out.print("Astronaut Name: ");
       AstronautName = sc.nextLine();

       System.out.print("Age: ");
       Age = sc.nextInt(); 

       sc.nextLine();      // when you shift from int to String use this line.

       System.out.print("Country: ");
       Country = sc.nextLine(); 

       System.out.print("Mission Number: ");
       MissionNumber = sc.nextInt();

       System.out.println("\n--Astronaut Profile--");
       System.out.println(); // use this when you need an gap betwwen the lines
       System.out.println("AstronautName: "+AstronautName);
       System.out.println("Age: "+Age);
       System.out.println("Country: "+ Country);
       System.out.println("MissionNumber: " + MissionNumber); 

    }
    
}
