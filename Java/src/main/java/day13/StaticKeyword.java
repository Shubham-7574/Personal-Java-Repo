package day13;

public class StaticKeyword {

    static int a = 10;  // static variable
    int b = 20;         // non-static variable
    
    static void m1() { // static method
        System.out.println("this is the static m1");
    }
    
    void m2() { // non-static method
        System.out.println("this is the static m2");    
    }
    
    void main() { // non-static main method
        System.out.println(a); // static variable
        System.out.println(b); // non-static variable
        m1();                // static method 
        m2();                // non-static method
    }
    
//    public static void main(String[] args) {
//        // 1) static method access only static stuff without object creation
//        System.out.println(a);
//        m1();
//        
//        // System.out.println(b);  // cannot access non-static variable without object creation
//        // m2();  // non-static method can't be accessed without object creation
//        
//        // 2) static method access non-static stuff with object creation
//        StaticKeyword sk = new StaticKeyword();
//        System.out.println(sk.b);
//        sk.m2();
//        
//        // Calling non-static main() method
//        sk.main(); // Call the non-static main() method
//    }
}
