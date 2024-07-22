class Route {
    private String startPickupAddress;
    private String destinationAddress;
    private double tripPrice;

    public Route(String startPickupAddress, String destinationAddress, double tripPrice) {
        this.startPickupAddress = startPickupAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public String getStartPickupAddress() {
        return startPickupAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setStartPickupAddress(String startPickupAddress) {
        this.startPickupAddress = startPickupAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}