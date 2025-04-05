
public class Main{
    public static void main(String[] args) {
       

        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(20000);

        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car price: " + car.getPrice());
    }
}