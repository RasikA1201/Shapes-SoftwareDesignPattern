//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

import java.awt.*;

public class BoxState implements State{
    @Override
    public Shapes createShape() {
        //Here we apply State pattern
        return new Box();
        //Box b = new Box();

        //b.draw();
        //return b;
    }
}
