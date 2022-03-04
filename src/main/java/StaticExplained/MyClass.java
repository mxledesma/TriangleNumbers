package StaticExplained;

public class MyClass {


        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            System.out.println(Counter.COUNT);
            System.out.println(c1.COUNT);
            System.out.print("\n");
            Counter.increment();  // Coming from the static method. Counter is the class
            Counter.increment();
            System.out.println(Counter.COUNT);

          //  System.out.print(Counter.term);   WONT WORK
            System.out.print("This is coming from a non static variable inside constructor "+c2.term);
        }

}
