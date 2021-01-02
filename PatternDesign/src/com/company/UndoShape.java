//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

public class UndoShape extends Command {
    public  void execute(DisplayImage i) {
        //This is a Command Pattern
        Shapes s = i.GetPreviousShape();
        i.PushFormerShape(s);
        i.PullShape();
    }
}
