package tut1;

public class Vehicle {
    protected double weight;   
    protected double length;  
    protected String name;
    protected double width;
    protected double height;
    protected Integer seatingCapacity;
    protected String registrationNumber;

    public Vehicle(double weight, double length, String registrationNumber) {
        setWeight(weight);
        setLength(length);
        setRegistrationNumber(registrationNumber);
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; } 

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; } 

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public Integer getSeatingCapacity() { return seatingCapacity; }
    public void setSeatingCapacity(Integer seatingCapacity) { this.seatingCapacity = seatingCapacity; }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.matches("[A-Za-z0-9]{1,12}")) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new IllegalArgumentException(
                "Vehicle regNo: 1-12 alphanumerical characters (A-Z,a-z,0-9)."
            );
        }
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + 
            " [weight=" + weight + " kg, length=" + length + " m, regNo=" + registrationNumber + "]";
    }

}

