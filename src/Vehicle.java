public class Vehicle {
     int steering=100;
     int gears=3;
     int speed=40;


    public void increase()
    {
        System.out.println("Steering = "+steering+ "Gear= "+gears+ "Speed= "+speed);
    }

}

class Car extends Vehicle {
    public void increaseSpeed()
    {
        int increment=10;
        speed+=increment;
        System.out.println("Speed= "+speed);
    }
}

class HondaCity extends Car{
    public void decreaseSpeed()
    {
        int decrement=1;
        gears-=decrement;
        System.out.println("Gears= "+gears);
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Car c=new Car();
        HondaCity h=new HondaCity();
        v.increase();
        c.increaseSpeed();
        h.decreaseSpeed();

    }
}