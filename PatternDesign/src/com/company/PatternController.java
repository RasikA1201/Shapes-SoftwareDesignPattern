//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PatternController {
    //Controller Pattern starts here
    ShapesGUI s;
    ShapeState shapeState;
    Graphics g;
    DisplayImage i ;

    public PatternController() {
        this.s = new ShapesGUI();
        this.shapeState = new ShapeState();
        //System.out.println(s.getGraphics());
        this.g = s.getGraphics();
        this.i = new DisplayImage();
    }

    public void mouseClickController() {
        s.setVisible(true);
        s.setBackground(Color.WHITE);
        s.getDrawShape().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                s.getUndo().setEnabled(true);
                State presentShapeState = shapeState.getState();
                Shapes presentShape = presentShapeState.createShape();
                presentShape.positionX = (int)e.getPoint().getX();
                presentShape.positionY = (int)e.getPoint().getY();
                g = s.getGraphics();
                presentShape.draw(g);
                i.PushShape(presentShape);

            }
        });

        s.getBox().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeState.setState(new BoxState());
            }
        });

        s.getCircle().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeState.setState(new CircleState());
            }
        });

        s.getUndo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.getRedo().setEnabled(true);

                Graphics gc = s.getDrawShape().getGraphics();
                gc.clearRect(0,0, s.getDrawShape().getWidth(), s.getDrawShape().getHeight());
                Command c=new UndoShape();
                c.execute(i);
                i.draw(g);
                if(i.getFormerShape().size() == 0){
                    s.getUndo().setEnabled(true);
                }
            }
        });

        s.getRedo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics gc = s.getDrawShape().getGraphics();
                gc.clearRect(0,0, s.getDrawShape().getWidth(), s.getDrawShape().getHeight());
                Command c=new RedoShape();
                c.execute(i);
                i.draw(g);
                if(i.getBackShape().size() == 0){
                    s.getRedo().setEnabled(false);
                }
            }
        });
    }
}
