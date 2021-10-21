package com.company;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Andy´s car");
        Car anotherCar = new Car("Julio´s car");

        myCar.accelerate(5); //5 is an argument
        myCar.accelerate(30);
        myCar.brake(4);

        anotherCar.brake(10);
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName){ //constructor de la clase
        name = carName;
    }

    public void accelerate(int amount) { //amount is an parameter
        speed += amount;
        showSpeed();
    }

    public void brake(int speedReduction) {
        speed = (speed < speedReduction) ? 0 : speed - speedReduction;
        showSpeed();
    }
/*
    public void brake(int speedReduction) { //pocion 2
        if (speed < speedReduction){
            speed = 0;
        } else {
            speed -= speedReduction;
        }
        showSpeed();
    }
*/
/*    public void brake(int speedReduction) { //opcion 1
        speed -= speedReduction;
        if (speed < 0) {
            speed = 0;
        }
        showSpeed();
    }
 */
    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour %n", name, speed);
    }
}