public class Limousine extends Auto {
    private int length;

    public Limousine(int max_speed, int weight, int horsepower, String model, int price, int year, String country, int length) {
        super(max_speed, weight, horsepower, model, price, year, country);
        this.length = length;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " The length is " + length + " .";
    }
}
