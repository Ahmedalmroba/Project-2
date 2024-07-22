class Car {
    private String code;
    private Route fixedRoute;
    private int maxCapacity;

    public Car(String code, Route fixedRoute, int maxCapacity) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maxCapacity = maxCapacity;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}