public class TestStaticProperty {

    public static void main(String[] args) {
        Car car1 = new Car("BMW x5", "Skyactive 5");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("BMW x6", "Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
