
interface Vehicle {
    void start();  

    default void honk() {
        System.out.println("Honking... Beep Beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started.");
    }
    @Override
    public void honk() {
        System.out.println("Bike honking... Peep Peep!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.honk();  

        Vehicle bike = new Bike();
        bike.start();
        bike.honk(); 
    }
}