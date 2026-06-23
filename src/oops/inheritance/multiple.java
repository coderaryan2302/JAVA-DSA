package oops.inheritance;

interface MusicSystem {
    void playMusic();
}

interface GPS {
    void showLocation();
}

class SmartCar implements MusicSystem, GPS {

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    @Override
    public void showLocation() {
        System.out.println("Showing Location...");
    }
}

public class multiple {
    public static void main(String[] args) {
        SmartCar car = new SmartCar();

        car.playMusic();
        car.showLocation();
    }
}

/*
Multiple Inheritance:

MusicSystem
      \
       SmartCar
      /
    GPS

Java classes me directly support nahi hota.
Interfaces se achieve hota hai.

implements keyword use hota hai.
*/

