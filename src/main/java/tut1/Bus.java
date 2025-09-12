package tut1;
public class Bus extends Vehicle {
    public Bus(double weight, double length, String registrationNumber) { super(weight, length, registrationNumber); }

    @Override
    public void setWeight(double weight) {
        if (weight >= 5000.0 && weight <= 20000.0) this.weight = weight;
        else throw new IllegalArgumentException("Bus weight must be in [5000, 20000] kg.");
    }
    @Override
    public void setLength(double length) {
        if (length >= 4.0 && length <= 10.0) this.length = length;
        else throw new IllegalArgumentException("Bus length must be in [4.0, 10.0] m.");
    }
    @Override
    public void setRegistrationNumber(String registrationNumber) {
    if (registrationNumber != null && registrationNumber.matches("[A-Za-z0-9]{1,8}")) {
        this.registrationNumber = registrationNumber;
    } else {
        throw new IllegalArgumentException("Bus regNo: 1-8 alphanumerical characters.");
    }
    }

}
