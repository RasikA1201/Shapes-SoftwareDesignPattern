//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

import java.awt.*;
import java.util.Iterator;
import java.util.Stack;
import java.awt.Graphics;

public class DisplayImage extends Shapes{
    private Stack<Shapes> formerShape= new Stack<Shapes>();  //stack used to save the shapes
    private  Stack<Shapes> stackInverse= new Stack<Shapes>();   //stack used to pull the shapes and display
    // Iterator pattern starts here. We will maintain history of shapes and use FILO mechanism
    @Override
    public void draw(Graphics g) {
        //This is an Iterator pattern
        Iterator iterator = formerShape.iterator();
        while (iterator.hasNext()) {
            Shapes design=(Shapes) iterator.next();
            design.draw(g);
        }

    }

    public void PushShape(Shapes shape){

        formerShape.push(shape);
    }

    public void PullShape(){

        formerShape.pop();
    }

    public Shapes GetPreviousShape(){

        return formerShape.peek();
    }

    public Stack<Shapes> getFormerShape(){

        return this.formerShape;
    }

    public void PushFormerShape(Shapes shape){

        stackInverse.push(shape);
    }

    public void PullReserveShape(){

        stackInverse.pop();
    }

    public Shapes PullLastReserveShape(){

        return stackInverse.peek();
    }

    public Stack<Shapes> getBackShape(){

        return this.stackInverse;
    }
}
