package com.cybertek.lambdaShortVideos.moveable;

@FunctionalInterface
public interface Moveable {
    void move(int mile);
}
@FunctionalInterface
 interface Measurable{
    void measure();
}

@FunctionalInterface
interface Computable{
    void compute(int num1,int num2);
}

@FunctionalInterface
interface Flyable{
    boolean flyHigh(int mile);
}

class DistantMover implements Moveable{

    @Override
    public void move(int mile) {
        System.out.println("moving " + mile);
    }
}

class ShortDistanceMover implements Moveable{

    @Override
    public void move(int mile) {
        System.out.println("moving short mile " + mile);
    }
}
