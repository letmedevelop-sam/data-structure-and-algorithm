package com.cybertek.lambdaShortVideos.moveable;

public class ImplementationOfInnerClass {

    public static void main(String[] args) {

        Moveable moveXmile = new Moveable() {
            @Override
            public void move(int mile) {
                System.out.println("moving " + mile);
            }
        };

        Moveable moveShort = new Moveable() {
            @Override
            public void move(int mile) {
                System.out.println("moving short mile " + mile);
            }
        };

        moveXmile.move(75);

        moveShort.move(3);

        System.out.println("=====================with LAMBDA=======================");

        Moveable moveXmileLambda = (int mile)-> System.out.println("moving " + mile);

        Moveable moveShortLambda = mile -> {System.out.println("moving short mile " + mile);};

        moveXmileLambda.move(88);
        moveShortLambda.move(8);

        moveAction(moveXmileLambda);
        moveAction(mile -> {System.out.println("moving short mile " + mile);});

    }

    public static void moveAction(Moveable moveable){
        moveable.move(100);
    }
}
