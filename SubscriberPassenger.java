class SubscriberPassenger extends Passenger {
    public SubscriberPassenger(String name, String ID) {
        super(name, ID);

    }
    @Override
    public void reserveCar(Car car) {
        if (car.getMaxCapacity() == 0) {
            throw new RuntimeException("Maximum capacity of the car is zero.");
        }

        reservedCar = car;
        tripCost = car.getFixedRoute().getTripPrice() * 0.5;
    }
    @Override
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Car Code: " + reservedCar.getCode());
        System.out.println("Route Price: " + reservedCar.getFixedRoute().getTripPrice());
        System.out.println("Trip Cost: " + tripCost);
    }
}