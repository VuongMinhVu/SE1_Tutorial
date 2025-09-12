package tut1;

public class Main {
    public static void main(String[] args) {
        // try {
        //     Vehicle v = new Vehicle(3000, 4.5, "VEH123456789");
        //     System.out.println(v);

        //     Bus b = new Bus(8000, 8.0, "BUS123");
        //     System.out.println(b);

        //     Car c = new Car(1500, 2.5, "C1A2B");
        //     System.out.println(c);
        //     // new Bus(4000, 8.0, "BUS123");    
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        IronSuit suit = new IronSuit(200.0, 2.0, "IRON01", "Tony Stark");
        System.out.println(suit);

        suit.fly("Hanoi", "Da Nang", 100); 
    }
}
