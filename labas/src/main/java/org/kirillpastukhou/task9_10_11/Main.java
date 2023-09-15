package org.kirillpastukhou.task9_10_11;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Ball> balls = Arrays.asList(new Ball(10.4, "Blue"), new Ball(), new Ball(6.7),
                new Ball("Blue"), new Ball(8.9, "Blue"));
        Basket basket = new Basket(balls);
        System.out.print("Blue balls: ");
        System.out.println(basket.howManyBlueBalls());
        System.out.print("Total weight: ");
        System.out.printf("%.3f", basket.getAllBallsWeight());


        /*
         1) cd D:\IntellijIDEAProjects\labas\src\main\java\org\kirillpastukhou\task9_10_11
         2) javac Ball.java Basket.java Main.java
         3) cd .. (x3)
         4) java org.kirillpastukhou.task9_10_11.Main
        */

        /*
         1) Maven->Lifecycle->compile & package
         2) cd D:\IntellijIDEAProjects\labas\target
         3) add "Main-Class: org.kirillpastukhou.task9_10_11.Main" to MANIFEST.MF
         4) java -jar .\laba1-1.0-SNAPSHOT.jar
        */
    }
}