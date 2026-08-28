package javaoperators;

//{ += , -= , *= , /= }
// a value changes , general
//uses atleast 1 variable

public class Assignment {
 public static void main(String[] args){
    int a = 1;

    System.out.println("a+=3: " + (a+=3)); //Here a = 1 -> a = a+3 = 4
    System.out.println("a-=2: " + (a-=2)); //Here a = 4 -> a = 4-2 = 2
    System.out.println("a*=6: " + (a*=6)); // Here a = 2 -> a = 2*6 = 12
    System.out.println("a/=3: " + (a/=3)); //Here a = 12 -> a = 12/3 = 4
 }
}
