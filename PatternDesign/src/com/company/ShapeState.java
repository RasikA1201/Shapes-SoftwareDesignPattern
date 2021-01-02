//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

public class ShapeState {
    //Here we apply State Pattern
    private State state;

    public ShapeState(){

        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){

        return state;
    }

}
