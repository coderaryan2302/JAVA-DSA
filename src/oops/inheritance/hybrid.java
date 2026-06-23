package oops.inheritance;
class Vehicle2 {
    void start() {
        System.out.println("Vehicle Started");
    }
}

interface MusicSystem1{
    void playMusic();
}

class Car2 extends Vehicle2 implements MusicSystem {
    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }
}

public class hybrid {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.start();
        car.playMusic();
    }
}

/*
Hybrid Inheritance:

Vehicle
    ↓
   Car
    ↑
MusicSystem

Combination of inheritance types.

Java me interfaces ki help se possible hai.
*/

