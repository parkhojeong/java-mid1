package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
        if (object instanceof Dog dog) { // safe down casting
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        } else {
            System.out.println("unknown object");
        }
    }
}
