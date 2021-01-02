//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

import java.awt.*;

public class CircleState implements State {

    @Override
    public Shapes createShape() {
        //Here we apply State pattern
         return new Circle();
//        Circle c = new Circle();
//        System.out.println(g);
//        c.draw(g);
//        return c;
    }

}