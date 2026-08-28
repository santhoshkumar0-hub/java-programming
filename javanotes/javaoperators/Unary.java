package javaoperators;

// { a++ , ++a , --a , a-- }

// Here, a++ called post-Increment 
//       ++a called pre-Increment
//        a-- called post- Decrement
//        --a called pre-Decrement 

class Unary{
    public static void main(String[] args){
        int a = 10;

        System.out.println((a++)); // Here, a = 10. it means, a++ is a+1 i.e., 10+1. But our answer will get 10, after it will post increment. Then the value of a becomes a = 11.
        System.out.println((++a)); // Here, a = 11. it means, ++a is 1+a i.e., 1+11. But our answer will get 12, becuase it will pre increment. So,it gives after the solving.
        System.out.println((--a)); // Here, a = 12 answer will be 11
        System.out.println((a--)); // Here, a = 11 answer will be 11
}
}