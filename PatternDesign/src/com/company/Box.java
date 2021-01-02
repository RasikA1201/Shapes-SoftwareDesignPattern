//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

import java.awt.*;

public class Box extends Shapes{
    //This is an expert pattern and also a Composite pattern
    @Override
    public void draw(Graphics g) {
        //System.out.println(g);
        //System.out.println(positionX);
        //System.out.println(positionY);
        g.setPaintMode();
        g.setColor(Color.BLUE);
        g.drawRect(positionX,positionY,100, 100);


    }
}
