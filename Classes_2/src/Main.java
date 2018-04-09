public class Main {

    public static void main(String[] args) {

        Bus gas = new Bus(60, 20000, 400, "Gas", 30_000_000, 2010, "Russia", 200);
        PassengerCar toyota = new PassengerCar(160, 2000, 250, "Toyota Camry", 4_500_000, 2014, "Japan");
        Limousine bentley = new Limousine(80, 6000, 350, "Bentley Mulsanne", 40_000_000, 2005, "France", 8);
        PassengerCar tesla = new PassengerCar(190, 3000, 280, "Tesla X", 15_000_000, 2017, "USA");


        System.out.println(gas.getInfo());
        System.out.println(toyota.getInfo());
        System.out.println(bentley.getInfo());
        System.out.println(tesla.getInfo());
    }
}
