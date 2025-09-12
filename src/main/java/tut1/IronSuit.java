package tut1;

public class IronSuit extends Vehicle {
    private String owner; 

    public IronSuit(double weight, double length, String registrationNumber, String owner) {
        super(weight, length, registrationNumber);
        this.owner = owner;
    }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public void fly(String from, String to, int distance) {
        System.out.println(owner + " is flying from " + from + " to " + to);
        
        for (int i = 0; i < distance; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("\nArrived at " + to + "!");
    }

    @Override
    public String toString() {
        return super.toString() + ", owner=" + owner;
    }
}

