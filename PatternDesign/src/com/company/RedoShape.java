//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

public class RedoShape extends Command{

    public  void execute(DisplayImage i){
        //This is a Command Pattern
        Shapes s=i.PullLastReserveShape();
        i.PushShape(s);
        i.PullReserveShape();

    }

}