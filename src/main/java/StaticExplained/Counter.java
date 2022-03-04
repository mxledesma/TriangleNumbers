package StaticExplained;

public class Counter {

// This is a static variable shared by all instances of the class which they talk about Counter class
    public static int COUNT = 0;
    public int term = 10;
     Counter() {   // This is a constructor no return type
        COUNT++;
        term++;   // You can place a non static variable inside constructor
    }
/*
A static method belongs to the class rather than instances.
Thus, it can be called without creating instance of class.
It is used for altering static contents of the class.
There are some restrictions of static methods :

Static method can not use non-static members (variables or functions) of the class.
Static method can not use this or super keywords.
 */
    public static void increment(){   // This is a static method
        COUNT++;
    }

}
