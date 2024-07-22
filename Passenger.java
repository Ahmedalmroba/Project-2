abstract class Passenger {
    protected String name;
    protected String ID;
    protected Car reservedCar;
    protected double tripCost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Passenger(String name, String ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void reserveCar(Car car);

    public abstract void displayInformation();
}