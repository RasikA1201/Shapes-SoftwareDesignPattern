//Name: Rasika Hedaoo
//Student ID: 1001770527

package com.company;

import javax.swing.*;
import java.awt.*;

public class ShapesGUI extends javax.swing.JFrame{
    //code for setting up background canvas
    JPanel panelDisplay;
    JPanel jPanels = new JPanel();
    JButton boxBtn = new JButton("Box");
    JButton circleBtn = new JButton("Circle");
    JButton undoBtn=new JButton("Undo");
    JButton redoBtn=new JButton("Redo");
    DrawShape drawShape =new DrawShape();
    BorderLayout borderLayouts = new BorderLayout();

    //gui.setVisible(true);


    public ShapesGUI(){
        super();
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jWindos();

        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jWindos() {

        panelDisplay = (JPanel) getContentPane();
        panelDisplay.setLayout(borderLayouts);
        drawShape.setVisible(true);
        //contentPane.setBackground(Color.WHITE);
        setSize(new Dimension(700, 600));
        setTitle("Shapes Design");
        boxBtn.setPreferredSize(new Dimension(100, 50));
        circleBtn.setPreferredSize(new Dimension(100,50));
        undoBtn.setPreferredSize(new Dimension(100, 50));
        redoBtn.setPreferredSize(new Dimension(100, 50));
        jPanels.setPreferredSize(new Dimension(800	, 50));
        drawShape.setBackground(Color.WHITE);
        panelDisplay.add(jPanels, BorderLayout.SOUTH);
        panelDisplay.add(drawShape, java.awt.BorderLayout.CENTER);
        jPanels.add(boxBtn);
        jPanels.add(circleBtn);
        jPanels.add(undoBtn);
        jPanels.add(redoBtn);
        undoBtn.setEnabled(false);
        redoBtn.setEnabled(false);
    }

    public JButton getBox(){
        return boxBtn;
    }

    public JButton getCircle(){

        return circleBtn;
    }

    public JButton getUndo(){
        drawShape.setBackground(Color.WHITE);
        return undoBtn;
    }

    public JButton getRedo(){
        drawShape.setBackground(Color.WHITE);
        return redoBtn;
    }

    public DrawShape getDrawShape(){
        drawShape.setBackground(Color.WHITE);
        return drawShape;
    }

}