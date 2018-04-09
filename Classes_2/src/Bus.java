public class Bus extends Auto {
    private int capacity;

    public Bus(int max_speed, int weight, int horsepower, String model, int price, int year, String country, int capacity) {
        super(max_speed, weight, horsepower, model, price, year, country);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " It has a capacity of " + capacity + " people.";
    }
}
