public abstract class Auto {
    private int max_speed;
    private int weight;
    private int horsepower;
    private String model;
    private int price;
    private int year;
    private String country;

    public Auto(int max_speed, int weight, int horsepower, String model, int price, int year, String country) {
        this.max_speed = max_speed;
        this.weight = weight;
        this.horsepower = horsepower;
        this.model = model;
        this.price = price;
        this.year = year;
        this.country = country;
    }

    public String getInfo() {
        return "The model of the car is " + model + ". It was produced in " + country + " in " + year +
                ". It has " + horsepower + " horsepower and max speed of " + max_speed + ". It weights " + weight +
                " kilos. The price is " + price + ".";
    }
}
