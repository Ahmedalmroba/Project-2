public class Main {


    public static void main(String[] args) {
        Route route1 = new Route("Start Pickup ", "Destination Address", 14.3);
        Route route2 = new Route("Start Pickup  ", "Destination Address ", 17.2);

        Car car1 = new Car("Car ", route1, 5);
        Car car2 = new Car("Car ", route2, 0);

        Passenger[] passengers = new Passenger[2];
        passengers[0] = new SubscriberPassenger("ahmed", "11160");
        passengers[1] = new NonSubscriberPassenger("mohammed", "11161", true);

        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof SubscriberPassenger) {
                    passenger.reserveCar(car1);
                } else if (passenger instanceof NonSubscriberPassenger) {
                    passenger.reserveCar(car2);
                }
                passenger.displayInformation();
            } catch (RuntimeException e) {
                System.out.println("invalid: " + e.getMessage());
            }

        }}}