class NonSubscriberPassenger extends Passenger {
    private boolean discountCoupon;

    public NonSubscriberPassenger(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public boolean hasDiscountCoupon() {
        return discountCoupon;
    }
    @Override
    public void reserveCar(Car car) {
        if (car.getMaxCapacity() == 0) {
            throw new RuntimeException("Maximum capacity of the car is zero.");
        }
        reservedCar = car;

        if (discountCoupon) {
            tripCost = car.getFixedRoute().getTripPrice() - (car.getFixedRoute().getTripPrice() * 0.1);
        } else {
            tripCost = car.getFixedRoute().getTripPrice();
        }
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