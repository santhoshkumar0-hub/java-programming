package EXERCISES;

import java.util.Scanner;
public class Excercise1e4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name: "); 
    String name = sc.nextLine();
     System.out.print("Roll Number: ");
     int rollnumber=sc.nextInt();
     System.out.print("Department: ");
     String department = sc.next();
     System.out.print("Semester: ");
     int semester = sc.nextInt();
     System.out.print("CGPA: ");
        float cgpa = sc.nextFloat();

        System.out.print("== STUDENT PROFILE ==\n");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollnumber);  
        System.out.println("Department : " + department);
        System.out.println("Semester : " + semester);
        System.out.println("CGPA : " + cgpa);

//     == STUDENT PROFILE ==
// Name : Priya
// Roll Number : 23ECE105
// Department : ECE
// Semester : 3
// CGPA : 8.91

 }
}

