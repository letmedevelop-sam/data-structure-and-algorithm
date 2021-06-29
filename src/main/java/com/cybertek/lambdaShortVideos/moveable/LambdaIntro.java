package com.cybertek.lambdaShortVideos.moveable;

public class LambdaIntro {
    public static void main(String[] args) {

        Moveable moveXmile = new DistantMover();
        moveXmile.move(15);

        Moveable moveShort = new ShortDistanceMover();
        moveShort.move(5);

        System.out.println("=======================================");

        moveAction(moveXmile);
        moveAction(moveShort);

        System.out.println("==============measurable==========");

        Measurable m1 = () -> System.out.println("measuring Square");
        Measurable m2 = () -> System.out.println("measuring Rectangle");

        Measurable m3 = () -> {
            System.out.println("measuring Rectangle step 1");
            System.out.println("measuring Circle step 2");
            System.out.println("measuring Circle step 3");

        };

        m1.measure();
        m2.measure();
        m3.measure();


        Computable adder = (num1, num2) -> System.out.println("adding result " + (num1 + num2));

        Computable multiplier = (num1, num2) -> System.out.println("multiply result " + (num1 * num2));

        Computable substractor = (num1, num2) -> System.out.println("substract result " + (num1 - num2));

        Computable divider = (num1, num2) -> System.out.println("divide result " + (num1 / num2));

        Computable reminder = (num1, num2) -> System.out.println("remind result " + (num1 % num2));
        adder.compute(10, 12);
        multiplier.compute(30,15);
        substractor.compute(458,28);
        divider.compute(127,7);
        reminder.compute(7,3);

        Flyable drone = mile -> {return mile > 10;} ;
        System.out.println(drone.flyHigh(17));
        System.out.println(drone.flyHigh(8));

        Flyable seaPlane = mile -> mile < 10 && mile%5==0;
        System.out.println(seaPlane.flyHigh(12));
        System.out.println(seaPlane.flyHigh(8));

    }

    public static void moveAction(Moveable moveable) {
        moveable.move(100);
    }
}
