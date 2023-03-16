/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawshapes;

/**
 * This class represents a car shape that can be drawn on a JPanel.
 * The car has a rectangle on top, a rectangle on bottom, and two circles for wheels.
 * The color of the car and the position of the car can be changed.
 * This class is part of a lab exercise for a Java programming course.
 *
 * @author Shumokh, Mawaddah, Deema
 * @version 14 February, 2023
 * Lab3: Car
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Car
{
    // instance variables 
    final static Color bg = Color.white; // background color for car
    final static Color fg = Color.pink; // default color for car
    final static Color black = Color.black; // color black
    final static Color red = Color.red; // color red
    final static Color yellow = Color.yellow; // color yellow
    final static Color blue = Color.blue; // color blue
    final static Color white = Color.white; // color white

    Shape rectTop = new Rectangle(50, 3, 80, 50); // top rectangle of car
    Shape rectBottom = new Rectangle(10, 53, 150, 80); // bottom rectangle of car
    Shape circleL = new Ellipse2D.Double(15, 100, 50, 50); // left wheel of car
    Shape circleR = new Ellipse2D.Double(100, 100, 50, 50); // right wheel of car
    Color cCar = fg; // current color of car
    int x=100; // current position of car

    // default constructor
    Car ()
    {

    }

    /**
     * Constructor that creates a car of a specific color.
     * @param c the color of the car
     */
    Car (Color c) {
        cCar = c;
    }

    /**
     * Sets the color of the car.
     * @param c the new color of the car
     */
    public void setColor(Color c) {
        cCar = c;
    }

    /**
     * Moves the car to a new position and updates the position of the car's components.
     * @param s the number of pixels to move the car horizontally
     */
    public void move(int s){
        x =x + s;
        rectTop = new Rectangle(x+40,3,80,50);
        rectBottom = new Rectangle(x,53,150,80);
        circleL = new Ellipse2D.Double(x+10,100,50,50);
        circleR = new Ellipse2D.Double(x+90,100,50,50);
    }
}
