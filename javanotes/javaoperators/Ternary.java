// package javaoperators;

// import java.util.Scanner;

// // Ternary mmeans 3 words 
// // condition ? if true : if false 
// public class Ternary {
//     public static void main(String[] args){
//         int max; 
//         Scanner sc = new Scanner(System.in);

//         System.out.print("first no:"  );
//         int n1 = sc.nextInt();

//         System.out.print("second no: ");
//         int n2 = sc.nextInt();

//         max = (n1>n2)?n1:n2; 
//         System.out.print("your answer is : "+ max);


        
//     }
// }

package javaoperators;

import java.util.Scanner;
public class Ternary{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in); 
int age;
String Result; 

System.out.print("age: "); 
age = sc.nextInt();

Result = (age <18)?"adult":" not adult"; 
System.out.print("you are: "+ Result);
    }
    }
