package tut1;

public class Car extends Vehicle {
    public Car(double weight, double length, String registrationNumber) { super(weight, length, registrationNumber); }

    @Override
    public void setWeight(double weight) {
        if (weight >= 1000.0 && weight <= 2000.0) this.weight = weight;
        else {
            throw new IllegalArgumentException("Car weight must be in [1000, 2000] kg.");
        }
    }

    @Override
    public void setLength(double length) {
        if (length >= 1.5 && length <= 3.5) this.length = length;
        else throw new IllegalArgumentException("Bus length must be in [4.0, 10.0] m.");
    }
    
    @Override
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.matches("[A-Za-z0-9]{1,6}")) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new IllegalArgumentException("Car regNo: 1-6 alphanumerical characters.");
        }
    }


}
